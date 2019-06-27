package com.example.foo.client;

import com.google.gwt.user.client.Cookies;
import com.google.gwt.user.client.Window;
import com.google.gwt.user.client.ui.RootLayoutPanel;
import com.google.gwt.user.client.ui.RootPanel;

public class AppController {

    private static boolean loggedIn;

    public static  native void consoleLog(String text) /*-{
        console.log(text);
    }-*/;

    public static void drawWorkspace() {

        final String loggedInCooky = Cookies.getCookie("loggedIn");

        loggedIn = loggedInCooky == null
                ? false
        : Boolean.parseBoolean(loggedInCooky);

        consoleLog("drawWorkspace()- logged:" + AppController.loggedIn);

        if(!AppController.loggedIn) {
            consoleLog("drawLogoutPage()");
            drawLogoutPage();
        } else {
            consoleLog("ModulePainterImpl().draw()");
            new ModulePainterImpl().draw();
        }
    }

    private static void drawLogoutPage() {
        clearPage();
        RootPanel.get().add(new Login());
    }

    private static void clearPage() {
        RootLayoutPanel.get().clear();
    }

    public static void login() {
        Cookies.setCookie("loggedIn", "true");
        Window.Location.reload();
    }
}
