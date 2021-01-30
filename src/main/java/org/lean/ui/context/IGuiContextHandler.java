package org.lean.ui.context;

import org.apache.hop.core.gui.plugin.action.GuiAction;

import java.util.List;

public interface IGuiContextHandler {

    List<GuiAction> getSupportedActions();

    String getContextId();
}
