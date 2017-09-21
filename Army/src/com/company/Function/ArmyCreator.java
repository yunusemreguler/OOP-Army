package com.company.Function;


import com.company.Soldier.Abstract.Soldier;
import com.company.Soldier.Object.Archer;
import com.company.Soldier.Object.Commander;
import com.company.Soldier.Object.Spearman;
import com.company.Soldier.Object.Swordsman;

import java.util.ArrayList;
import java.util.List;

public class ArmyCreator {

    public ArmyCreator(){}

    public List<Soldier> createArmy(){

        List<Soldier> army = new ArrayList<Soldier>();

        //Commander
        Commander commander = new Commander("Commander",90,100,150,120);

        //Archers
        Archer archer1 = new Archer("Archer 1",40,15,100,80);
        Archer archer2 = new Archer("Archer 2",55,12,125,100);
        Archer archer3 = new Archer("Archer 3",37,10,85,60);

        //Swordsmen
        Swordsman swordsman1 = new Swordsman("Swordsman 1",25,50,25,55);
        Swordsman swordsman2 = new Swordsman("Swordsman 2",35,80,60,60);
        Swordsman swordsman3 = new Swordsman("Swordsman 3",40,40,45,50);

        //Spearmen
        Spearman spearman1 = new Spearman("Spearman 1",40,20,120,50);
        Spearman spearman2 = new Spearman("Spearman 2",35,20,110,75);
        Spearman spearman3 = new Spearman("Spearman 3",45,25,95,45);

        army.add(commander);
        army.add(archer1);
        army.add(archer2);
        army.add(archer3);
        army.add(swordsman1);
        army.add(swordsman2);
        army.add(swordsman3);
        army.add(spearman1);
        army.add(spearman2);
        army.add(spearman3);

        return army;
    }
}
