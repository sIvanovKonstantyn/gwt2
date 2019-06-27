package com.example.foo.client;

import com.google.gwt.core.client.GWT;
import com.google.gwt.uibinder.client.UiBinder;
import com.google.gwt.uibinder.client.UiField;
import com.google.gwt.user.client.ui.*;

import java.util.HashMap;
import java.util.Map;

public class FullSpaceLayout extends ResizeComposite implements ProvidesResize {

    interface FullSpaceLayoutUiBinder extends UiBinder<TabLayoutPanel, FullSpaceLayout> {}

    private static FullSpaceLayoutUiBinder UI_BINDER = GWT.create(FullSpaceLayoutUiBinder.class);
    private Map<Class<? extends Widget>, Integer> tabIndexes = new HashMap<>();

    @UiField
    TabLayoutPanel tabPanel;

    public FullSpaceLayout() {
        initWidget(UI_BINDER.createAndBindUi(this));
        initTabPanel();
    }

    private void initTabPanel() {
        tabPanel.add(new HTML());
    }

    public void drawLayout(Widget layout) {
        FlowPanel flowPanel = new FlowPanel();
        tabPanel.add(flowPanel);
        flowPanel.add(layout);
        tabPanel.selectTab(tabPanel.getWidgetCount()-1);
    }
}
