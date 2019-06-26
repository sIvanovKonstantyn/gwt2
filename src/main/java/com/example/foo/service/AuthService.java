package com.example.foo.service;

import com.google.gwt.core.client.GWT;
import com.google.web.bindery.event.shared.SimpleEventBus;

public class AuthService {

    private static final EntityRequestFactory instance;

    static {
        instance = GWT.create(EntityRequestFactory.class);
        instance.initialize(new SimpleEventBus(), new AuthRequestTransport());
    }

    public static EntityRequestFactory get() {
        return instance;
    }
}
