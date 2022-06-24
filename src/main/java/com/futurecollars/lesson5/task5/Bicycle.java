package com.futurecollars.lesson5.task5;

public class Bicycle implements Vehicle {
    boolean isStarted;

    public Bicycle(boolean isStarted) {
        this.isStarted = isStarted;
    }

    @Override
    public void start() {
        isStarted = true;
    }

    @Override
    public void stop() {
        isStarted = false;
    }

    @Override
    public boolean isStarted() {
        return isStarted;
    }

    @Override
    public void setStarted(boolean isStarted) {
        this.isStarted = isStarted;
    }

}