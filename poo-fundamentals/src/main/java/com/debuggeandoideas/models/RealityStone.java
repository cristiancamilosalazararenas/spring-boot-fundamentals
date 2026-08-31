package com.debuggeandoideas.models;

public class RealityStone extends Stone{

    private static final String COLOR = "Red";
    private static final String NAME = "Reality Stone";
    private static final String LOCATION = "The World Pool";
    private static final int ENERGY_LEVEL = 11;

    public RealityStone() {
        super(COLOR, NAME, LOCATION, ENERGY_LEVEL);
    }

    @Override
    public void usePower() {
        /*
         * === Business logic ===
         * When concatenating a string with an object, Java ultimately calls the toString() method directly.
         * */
        System.out.println("Alter reality: " + this + ".");
    }
}
