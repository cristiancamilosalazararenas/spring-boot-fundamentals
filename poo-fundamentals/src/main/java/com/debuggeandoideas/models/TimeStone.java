package com.debuggeandoideas.models;

public class TimeStone extends Stone{

    private static final String COLOR = "Green";
    private static final String NAME = "Time Stone";
    private static final String LOCATION = "The Ellipsis";
    private static final int ENERGY_LEVEL = 9;

    public TimeStone() {
        super(COLOR, NAME, LOCATION, ENERGY_LEVEL);
    }

    @Override
    public void usePower() {
        /*
         * === Business logic ===
         * When concatenating a string with an object, Java ultimately calls the toString() method directly.
         * */
        System.out.println("Control time: " + this + ".");
    }
}
