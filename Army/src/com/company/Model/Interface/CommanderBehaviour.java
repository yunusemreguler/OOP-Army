package com.company.Model.Interface;


import com.company.Model.Abstract.Soldier;

import java.util.List;

public interface CommanderBehaviour {

    void commandToAttack(List<Soldier> soldierList);

    void commandToDefense(List<Soldier> soldierList);

    void commandToTrain(List<Soldier> soldierList);
}