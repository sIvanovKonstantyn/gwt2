package com.example.foo.service;

import com.google.web.bindery.requestfactory.shared.Request;
import com.google.web.bindery.requestfactory.shared.RequestContext;

public interface UserRequestContext extends RequestContext {
    Request<UserProxy> checkUserInSession();
}
