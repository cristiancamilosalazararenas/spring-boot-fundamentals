package com.debuggeandoideas;

import com.debuggeandoideas.models.*;

import java.sql.Time;

public class Main {
    public static void main(String[] args) {

        // Different ways to instantiate classes.

        /*
        * Type inference.
        * final var mindStone = new MindStone(); -> Good practice.
        * final Stone powerStone = new PowerStone(); -> Good practice.
        * final RealityStone realityStone = new RealityStone(); -> Bad practice.
        * */

        final var mindStone = new MindStone();
        final var powerStone = new PowerStone();
        final var realityStone = new RealityStone();
        final var soulStone = new SoulStone();
        final var spaceStone = new SpaceStone();
        final var timeStone = new TimeStone();

        mindStone.usePower();
        System.out.println("-----------");
        powerStone.usePower();
        System.out.println("-----------");
        realityStone.usePower();
        System.out.println("-----------");
        soulStone.usePower();
        System.out.println("-----------");
        spaceStone.usePower();
        System.out.println("-----------");
        timeStone.usePower();
    }
}