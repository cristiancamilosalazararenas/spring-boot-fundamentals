package com.debuggeandoideas;

import com.debuggeandoideas.models.*;
import com.debuggeandoideas.services.GauntletServiceImpl;

import java.sql.Time;

public class Main {
    public static void main(String[] args) {

        // === Inheritance and Polymorphism Section ===

        // Different ways to instantiate classes.

        /*
        * Type inference.
        * final var mindStone = new MindStone(); -> Good practice.
        * final Stone powerStone = new PowerStone(); -> Good practice.
        * final RealityStone realityStone = new RealityStone(); -> Bad practice.
        * */

        System.out.println("=== Inheritance and Polymorphism Section ===");
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
        System.out.println("-----------\n");

        // === Encapsulation section ===
        System.out.println("=== Encapsulation section ===");
        final var gauntletService = new GauntletServiceImpl();
        // gauntletService.realityStone = null; -> Modification should not be possible.
        gauntletService.useGauntlet("");
    }
}