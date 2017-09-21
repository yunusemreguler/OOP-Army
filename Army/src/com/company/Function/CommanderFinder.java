package com.company.Function;

import com.company.Soldier.Abstract.Soldier;
import com.company.Soldier.Object.Commander;

import java.util.List;

public class CommanderFinder {

    //A function to find the commander inside the army
    //Still an army can fight without a commander but they would be
    //weaker for sure.
    public Commander findCommander(List<Soldier> soldiers){

        Commander commander = new Commander();

        for(int i = 0;i<soldiers.size();i++){
            if(soldiers.get(i) instanceof Commander)
            {
               commander = (Commander) soldiers.get(i);
               break;
            }
        }

        return commander;
    }

}
