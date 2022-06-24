package com.futurecollars.lesson5.task5;

public class Car implements Vehicle {
    Engine engine;

    public Car(Engine engine) {
        this.engine = engine;
    }

    @Override
    public void start() {
        engine.startEngine();
    }

    @Override
    public void stop() {
        engine.stopEngine();
    }

    @Override
    public boolean isStarted() {
        return engine.isEngineStarted();
    }

    @Override
    public void setStarted(boolean isStarted) {
        engine.setEngineStarted(isStarted);
    }


    private static class Engine {
        private boolean engineStarted;

        protected void startEngine() {
            if (!engineStarted) {
                engineStarted = true;
            }
        }

        protected void stopEngine() {
            if (engineStarted) {
                engineStarted = false;
            }
        }

        public boolean isEngineStarted() {
            return engineStarted;
        }

        public void setEngineStarted(boolean engineStarted) {
            this.engineStarted = engineStarted;
        }

    }

}
