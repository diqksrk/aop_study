package com.example.demo.handler;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

public class DynamicInvocationHandler implements InvocationHandler {
    private Object delegate;

    public DynamicInvocationHandler(Object delegate) {
        this.delegate = delegate;
    }

    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        System.out.println("Start Method");
        method.invoke(delegate, args);
        System.out.println("End Method");
        return null;
    }
}
