package com.example.foo.client;

import com.example.foo.service.AuthService;
import com.example.foo.service.UserProxy;
import com.google.gwt.user.client.ui.RootLayoutPanel;
import com.google.gwt.user.client.ui.RootPanel;
import com.google.web.bindery.requestfactory.shared.Receiver;

public class AppController {
    public static void drawWorkspace() {

        AuthService.get().getUserRequestContext().checkUserInSession().fire(
                new Receiver<UserProxy>() {
                    @Override
                    public void onSuccess(UserProxy userProxy) {
                        if(userProxy == null) drawLogoutPage();
                    }
                }
        );
    }

    private static void drawLogoutPage() {
        clearPage();
        RootPanel.get().add(new Login());
    }

    private static void clearPage() {
        RootLayoutPanel.get().clear();
    }
}
