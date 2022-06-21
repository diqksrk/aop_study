package com.example.demo.aop;

import com.example.demo.handler.DynamicInvocationHandler;

import java.lang.reflect.Proxy;

public class Aopexample3 {
    public interface ControllerContainer {
        public void controller1(int[] arr);
        public void controller2(int[] arr);
    }

    public static class ControllerFactory implements ControllerContainer {
        private ControllerFactory() {};
        private static ControllerContainer instance = ControllerFactory.newInstance();

        public static ControllerContainer newInstance() {
            ControllerContainer controllerFactory = new ControllerFactory();
            return (ControllerContainer) Proxy.newProxyInstance(controllerFactory.getClass().getClassLoader()
                    , controllerFactory.getClass().getInterfaces()
                    , new DynamicInvocationHandler(controllerFactory));
        }

        public static ControllerContainer getInstance() {
            return instance;
        }

        @Override
        public void controller1(int[] arr) {
            // Todo SomeThing
        }

        @Override
        public void controller2(int[] arr) {
            // Todo SomeThing
        }
    }
}
