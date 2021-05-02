package com.company.Service;

import com.company.Model.Abstract.Soldier;
import com.company.Model.Object.*;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class ArmyManager {

    // ArmyManager class is used for certain functions
    // Since the armyManager will only be used for function calls it is better to implement it as a singleton class
    // Which means there will be only one static instance of army manager for whole program
    private static ArmyManager instance;

    private ArmyManager(){}

    // Lazy initialization implemented
    public static ArmyManager getInstance(){
        if(instance == null){
            instance = new ArmyManager();
        }
        return instance;
    }

    public Army createArmy(){

        // Create Commander
        Commander commander = new Commander("Alexander", 90, 100, 150, 120);

        // Create Soldiers
        List<Soldier> soldiers = Stream.of(
                new Archer("Archer 1", 40, 15, 100, 80),
                new Archer("Archer 2", 55, 12, 125, 100),
                new Archer("Archer 3", 37, 10, 85, 60),
                new Swordsman("Swordsman 1", 25, 50, 25, 55),
                new Swordsman("Swordsman 2", 35, 80, 60, 60),
                new Swordsman("Swordsman 3", 40, 40, 45, 50),
                new Cavalry("Cavalry 1", 40, 20, 120, 50),
                new Cavalry("Cavalry 2", 35, 20, 110, 75),
                new Cavalry("Cavalry 3", 45, 25, 95, 45)
        ).collect(Collectors.toList());

        return new Army(commander, soldiers);
    }

    public void printArmyAttributes(Army army){
        army.getCommander().printAttributes();
        army.getSoldiers().forEach(Soldier::printAttributes);
    }

}
