package com.company.Soldier.Interface;


import com.company.Soldier.Abstract.Soldier;

import java.util.List;

public interface CommanderBehaviour {

    void commandToAttack(List<Soldier> soldierList);

    void commandToDefense(List<Soldier> soldierList);

    void commandToTrain(List<Soldier> soldierList);
}