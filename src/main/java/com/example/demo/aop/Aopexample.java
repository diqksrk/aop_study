package com.example.demo.aop;

public class Aopexample {
    public interface ControllerContainer {
        public void controller1(int[] arr);
        public void controller2(int[] arr);
    }

    public static class ControllerFactory implements ControllerContainer {
        private ControllerFactory() {};
        private static ControllerContainer instance = new ControllerFactory();
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
