// (C) Uri Wilensky. https://github.com/NetLogo/NetLogo

package org.nlogo.prim.etc;

import org.nlogo.agent.Link;
import org.nlogo.agent.Turtle;
import org.nlogo.core.Syntax;
import org.nlogo.nvm.Command;

public final class _die
    extends Command {
  public _die() {
    this.switches = true;
  }



  @Override
  public void perform(final org.nlogo.nvm.Context context) {
    if (context.agent instanceof Turtle) {
      ((Turtle) context.agent).die();
    } else {
      ((Link) context.agent).die();
    }
    context.finished = true;
  }

  public void perform_1(final org.nlogo.nvm.Context context) {
    if (context.agent instanceof Turtle) {
      ((Turtle) context.agent).die();
    } else {
      ((Link) context.agent).die();
    }
    context.finished = true;
  }

  public void profiling_perform_1(final org.nlogo.nvm.Context context) {
    if (context.agent instanceof Turtle) {
      ((Turtle) context.agent).die();
    } else {
      ((Link) context.agent).die();
    }
    // profiling data collection, close out the call record
    context.finished = true;
    workspace.profilingTracer().closeCallRecord(context, context.activation);
  }
}
