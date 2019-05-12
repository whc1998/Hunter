package com.branch.dellog;

import com.android.build.api.transform.Context;
import com.android.build.api.transform.TransformInput;
import com.android.build.api.transform.TransformOutputProvider;
import com.quinn.hunter.transform.HunterTransform;
import com.quinn.hunter.transform.RunVariant;

import org.gradle.api.Project;

import java.io.IOException;
import java.util.Collection;

public class MyTransform extends HunterTransform {

    private DelLogExtension extension;
    private Project project;

    public MyTransform(Project project) {
        super(project);
        this.project=project;
        this.bytecodeWeaver=new MyWeaver();
    }

    @Override
    public void transform(Context context, Collection<TransformInput> inputs, Collection<TransformInput> referencedInputs, TransformOutputProvider outputProvider, boolean isIncremental) throws IOException, com.android.build.api.transform.TransformException, InterruptedException {
        extension= (DelLogExtension) project.getExtensions().getByName("dellogExtension");
        super.transform(context, inputs, referencedInputs, outputProvider, isIncremental);
    }

    @Override
    protected RunVariant getRunVariant() {
        return extension.runVariant;
    }

}
