package com.example.foo.client;

import com.github.gwtbootstrap.client.ui.event.HiddenHandler;
import com.google.gwt.core.client.GWT;
import com.google.gwt.dom.client.Style;
import com.google.gwt.dom.client.Style.Unit;
import com.google.gwt.user.client.Cookies;
import com.google.gwt.user.client.ui.DockLayoutPanel;
import com.google.gwt.user.client.ui.HTML;
import com.google.gwt.user.client.ui.Label;
import com.google.gwt.user.client.ui.RootLayoutPanel;
import com.google.gwt.user.client.ui.RootPanel;
import com.google.gwt.user.client.ui.Widget;

public class ModulePainterImpl {

    private DockLayoutPanel rootPanel = new DockLayoutPanel(Unit.PX);
//    private Header header;
    private FullSpaceLayout content = new FullSpaceLayout();

    private void initLayout() {

        rootPanel.clear();
        RootLayoutPanel.get().clear();

//        Header.height = Header.def_height;
//        header = new Header(content, selectedModule);
//        header.getElement().getStyle().setMarginLeft(1, Unit.PX);
//        header.getElement().getStyle().setMarginRight(1, Unit.PX);
//        rootPanel.addNorth(header, Header.height);
//        rootPanel.getWidgetContainerElement(header).getStyle().setOverflow(Style.Overflow.VISIBLE);
//
        rootPanel.add(content);
        RootLayoutPanel.get().add(rootPanel);
    }

    public void draw() {
        initLayout();
        content.drawLayout(new Label("TEST LAYOUT"));
    }

//    public void drawModule(UserProxy user) throws UIException {
//        AppModule selectedModule = AppController.getUserData().getSelectedModule();
//        if (!layoutInitialized) {
//            AppModule cookieSelectedModule = null;
//            if (Cookies.isCookieEnabled() && Cookies.getCookie(Constants.COOKIE_SELECTED_MODULE) != null) {
//                String name = Cookies.getCookie(Constants.COOKIE_SELECTED_MODULE);
//                for (AppModule module : AppModule.values()) {
//                    if (UIUtils.unsafeIgnoreCaseEquals(module.getSName(), name)) {
//                        cookieSelectedModule = module;
//                        break;
//                    }
//                }
//            }
//            if (checkModuleEnabled(AppController.getUserData(), cookieSelectedModule)) {
//                selectedModule = cookieSelectedModule;
//            }
//        }
//        initLayout(selectedModule);
//        if (user != null) {
//            if (user.isLoggedIn()) {
//                AuditUtils.refreshBrowser();
//                if (selectedModule != null) {
//                    switch (selectedModule) {
//                        case CSKO_MODULE:
//                            break;
//                        case ADMIN_MODULE:
//                            drawAdmLayout();
//                            break;
//                        case BA_MODULE:
//                            drawBaLayout();
//                            break;
//                        default:
//                            drawEmptyLayout();
//                    }
//                } else {
//                    drawEmptyLayout();
//                }
//            } else
//                throw new UIException("User is not authorized! Access denied!");
//        } else
//            throw new UIException("User is not found in server session!");
//    }
//
//    @Override
//    public void drawLogoutPage() {
//        drawLogoutLayout();
//    }
//
//    @Override
//    public void drawErrorDialog(String errorMessage, String stackTrace) {
//        drawErrorModalDialog(errorMessage, stackTrace, null);
//    }
//
//    @Override
//    public void drawErrorDialog(String errorMessage) {
//        drawErrorModalDialog(errorMessage, null, null);
//    }
//
//    @Override
//    public void drawErrorDialogWithHiddenHandler(String errorMessage, String stackTrace, HiddenHandler hiddenHandler) {
//        drawErrorModalDialog(errorMessage, stackTrace, hiddenHandler);
//    }
//
//    private void drawErrorModalDialog(String errorMessage, String stackTrace, HiddenHandler hiddenHandler) {
//        ErrorDialog dialog = new ErrorDialog(errorMessage, stackTrace);
//        if (hiddenHandler != null) {
//            dialog.addHiddenHandler(hiddenHandler);
//        }
//        dialog.show();
//    }
//
//    private boolean checkModuleEnabled(UserProxy user, AppModule module) {
//        if (user == null || module == null)
//            return false;
//
//        switch (module) {
//            case CSKO_MODULE:
//                return user.getPermissions().getHasCSKOPermission();
//            case BA_MODULE:
//                return user.getPermissions().getHasBaPermission();
//            case ADMIN_MODULE:
//                return user.getPermissions().getHasAdmPermission();
//            default:
//                return false;
//        }
//    }
//
//    /**
//     * Clean rbc history
//     */
//    @Override
//    public void cleanModulesHistory() {
//        content.clear();
//    }
//
//    /**
//     * Draw Admin module
//     */
//    private void drawAdmLayout() {
//        GWT.runAsync(AdmLayout.class, new AsyncModuleRunner(content.prepareDrawing(AdmLayout.class)) {
//            @Override
//            public void onSuccess() {
//                content.drawLayout(AdmLayout.class, AdmLayout::new);
//                super.onSuccess();
//            }
//        });
//    }
//
//    /**
//     * Draw ba module
//     */
//    private void drawBaLayout() {
//        GWT.runAsync(BaLayout.class, new AsyncModuleRunner(content.prepareDrawing(BaLayout.class)) {
//            @Override
//            public void onSuccess() {
//                content.drawLayout(BaLayout.class, BaLayout::new);
//                super.onSuccess();
//            }
//        });
//    }
//
//    private void drawEmptyLayout() {
//        draw(new Label("Error during workspace initialization"));
//    }
//
//    private void drawLogoutLayout() {
//        clearPage();
//        RootPanel.get().add(new Login());
//    }
//
//    private void clearPage() {
//        RootLayoutPanel.get().clear();
//        layoutInitialized = false;
//    }
//
//    public void lock() {
//        HTML lockout = new HTML();
//        lockout.setStyleName("lockout");
//
//        RootPanel.get().add(lockout);
//    }

}











