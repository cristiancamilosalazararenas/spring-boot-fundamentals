package com.debuggeandoideas.models;

import lombok.ToString;

@ToString
public class SoulStone extends Stone {

    private static final String COLOR = "Orange";
    private static final String NAME = "Soul Stone";
    private static final String LOCATION = "Soulworld";
    private static final int ENERGY_LEVEL = 10;

    public SoulStone() {
        super(COLOR, NAME, LOCATION, ENERGY_LEVEL);
    }

    @Override
    public void usePower() {
        System.out.println("Total control: " + this + ".");
    }
}
