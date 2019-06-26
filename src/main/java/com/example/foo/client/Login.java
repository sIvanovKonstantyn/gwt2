package com.example.foo.client;

import com.github.gwtbootstrap.client.ui.*;
import com.google.gwt.core.client.GWT;
import com.google.gwt.uibinder.client.UiBinder;
import com.google.gwt.uibinder.client.UiField;
import com.google.gwt.uibinder.client.UiTemplate;
import com.google.gwt.user.client.ui.Composite;
import com.google.gwt.user.client.ui.Widget;

public class Login extends Composite {

    private static final LoginUiBinder UI_BINDER = GWT.create(LoginUiBinder.class);

    @UiField
    Form fmLoginForm;
    @UiField
    Legend legend;
    @UiField
    ControlLabel lUserName;
    @UiField
    TextBox tbUserName;
    @UiField
    ControlLabel lPassword;
    @UiField
    PasswordTextBox tbPassword;
    @UiField
    Button btnEnter;
    @UiField
    ControlGroup cgUserName;
    @UiField
    ControlGroup cgPassword;
    @UiField
    HelpInline hiUserName;
    @UiField
    HelpInline hiPassword;
    @UiField
    CheckBox cbSaveLogin;

    @UiTemplate("Login.ui.xml")
    interface LoginUiBinder extends UiBinder<Widget, Login> {
    }

    public Login() {
        initWidget(UI_BINDER.createAndBindUi(this));
    }

}
