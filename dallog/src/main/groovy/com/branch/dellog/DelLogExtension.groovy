package com.branch.dellog

import com.quinn.hunter.transform.RunVariant

/**
 * Created by Ryze on 2017-2-9.
 */
class DelLogExtension {

  String sourceDir;
  public RunVariant runVariant = RunVariant.ALWAYS

  @Override
  String toString() {
    return "MyExtension{" +
            "runVariant=" + runVariant +
            '}';
  }

}
