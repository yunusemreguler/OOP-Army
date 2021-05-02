package com.company.Model.Object;

import com.company.Model.Abstract.Soldier;
import com.company.Model.Interface.CommanderBehaviour;

import java.util.List;

public class Commander extends Soldier implements CommanderBehaviour{

    private int commandPoint;

    public Commander(){}

    public Commander(String name, int attackPoint, int defensePoint, int experiencePoint, int commandingPoint){
        super(name,attackPoint,defensePoint,experiencePoint);//super statement allows us to inherit attributes of Soldier class
        this.commandPoint = commandingPoint;
    }

    public int getCommandPoint() {
        return commandPoint;
    }

    public void setCommandPoint(int commandingPoint) {
        this.commandPoint = commandingPoint;
    }

    @Override
    public void attack() {
        System.out.println(this.getName()+" attacks!");
        this.setExperiencePoint(this.getExperiencePoint()+20);
        System.out.println(this.getName()+"'s experience point is increased by 20 and now it is "+this.getExperiencePoint());
    }

    @Override
    public void defense() {
        System.out.println(this.getName()+" defends!");
    }

    @Override
    public void train() {
        System.out.println(this.getName()+" commands his soldiers.His command point is increased by 20.");
        this.setCommandPoint(this.getCommandPoint()+20);
        this.setAttackPoint(this.getAttackPoint()+15);
        this.setDefensePoint(this.getDefensePoint()+10);
    }

    @Override
    public void printAttributes() {
        System.out.println(this.getName()+" :\n   Attack Point : "+this.getAttackPoint()+"\n   Defense Point : "+this.getDefensePoint()
                            +"\n   Experience Point : "+this.getExperiencePoint()+"\n   Command Point : "+getCommandPoint());
    }

    @Override
    public void commandToAttack(List<Soldier> soldiers){
        soldiers.forEach(Soldier::attack);
    }

    @Override
    public void commandToDefense(List<Soldier> soldiers) {
        soldiers.forEach(Soldier::defense);
    }

    @Override
    public void commandToTrain(List<Soldier> soldiers) {
        soldiers.forEach(Soldier::train);
    }

}
