package com.branch.dellog

import com.android.build.gradle.AppExtension
import com.android.build.gradle.internal.transforms.MergeJavaResourcesTransform
import org.gradle.api.Plugin
import org.gradle.api.Project

/**
 * Created by Ryze on 2017-2-5.
 */
class DelLogPlugin implements Plugin<Project> {

  @SuppressWarnings("NullableProblems")
  @Override
  void apply(Project project) {

    project.extensions.create('dellogExtension', DelLogExtension);
    AppExtension appExtension = (AppExtension)project.getProperties().get("android")
    appExtension.registerTransform(new MyTransform(project), Collections.EMPTY_LIST)

//    project.afterEvaluate {
//      println "============start"
//      //在gradle 构建完之后执行
//      project.logger.error("dellogExtension : " + project.dellogExtension.sourceDir);
//
//      def rootDir = project.projectDir.toString().plus(project.dellogExtension.sourceDir);
//
//      project.logger.error(rootDir);
//
//      DelLogUtil.delLog(new File(rootDir));
//    }

//    project.task('dellog', {
//      project.logger.error("dellogExtension : " + project.dellogExtension.sourceDir);
//
//      def rootDir = project.projectDir.toString().plus(project.dellogExtension.sourceDir);
//
//      project.logger.error(rootDir);
//
//      DelLogUtil.delLog(new File(rootDir));
//
//    })

  }
}
