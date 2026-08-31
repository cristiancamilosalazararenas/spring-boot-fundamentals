package com.debuggeandoideas.models;

public class MindStone extends Stone{

    private static final String COLOR = "Yellow";
    private static final String NAME = "Mind Stone";
    private static final String LOCATION = "Mindscape";
    private static final int ENERGY_LEVEL = 5;

    public MindStone() {
        super(COLOR, NAME, LOCATION, ENERGY_LEVEL);
    }

    @Override
    public void usePower() {
        /*
         * === Business logic ===
         * When concatenating a string with an object, Java ultimately calls the toString() method directly.
         * */
        System.out.println("Mind control in stone: " + this + ".");
    }
}
