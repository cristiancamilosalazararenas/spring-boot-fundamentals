package com.debuggeandoideas.models;

public class PowerStone extends Stone{

    private static final String COLOR = "Purple";
    private static final String NAME = "Power Stone";
    private static final String LOCATION = "The Arena";
    private static final int ENERGY_LEVEL = 15;

    public PowerStone() {
        super(NAME, COLOR, LOCATION, ENERGY_LEVEL);
    }

    @Override
    public void usePower() {
        /*
         * === Business logic ===
         * When concatenating a string with an object, Java ultimately calls the toString() method directly.
         * */
        System.out.println("Increase power and energy: " + this + ".");
    }
}
