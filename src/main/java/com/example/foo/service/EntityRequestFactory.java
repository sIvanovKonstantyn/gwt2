package com.example.foo.service;

import com.google.web.bindery.requestfactory.shared.RequestFactory;

public interface EntityRequestFactory  extends RequestFactory {
    UserRequestContext getUserRequestContext();
}
