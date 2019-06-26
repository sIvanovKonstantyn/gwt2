package com.example.foo.service;

import com.google.web.bindery.requestfactory.shared.ProxyFor;
import com.google.web.bindery.requestfactory.shared.ValueProxy;

@ProxyFor(value = User.class)
public interface UserProxy extends ValueProxy {

}
