package com.company.Model.Object;

import com.company.Model.Abstract.Soldier;

import java.util.ArrayList;
import java.util.List;

public class Army {

    Commander commander;
    List<Soldier> soldiers;

    public Army(){
        this.soldiers = new ArrayList<>();
    }

    public Army(Commander commander, List<Soldier> soldiers){
        this.commander = commander;
        this.soldiers = soldiers;
    }

    public Commander getCommander() {
        return commander;
    }

    public void setCommander(Commander commander) {
        this.commander = commander;
    }

    public List<Soldier> getSoldiers() {
        return soldiers;
    }

    public void setSoldiers(List<Soldier> soldiers) {
        this.soldiers = soldiers;
    }

}
