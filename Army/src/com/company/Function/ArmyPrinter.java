package com.company.Function;

import com.company.Soldier.Abstract.Soldier;

import java.util.List;

public class ArmyPrinter {

    //Print the attributes of soldiers in the army.
    public void printArmy(List<Soldier> soldiers){
        for(int i = 0;i<soldiers.size();i++){
            soldiers.get(i).printAttributes();
        }
    }

}
