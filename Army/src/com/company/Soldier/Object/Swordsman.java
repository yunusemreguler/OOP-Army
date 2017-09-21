package com.company.Soldier.Object;

import com.company.Soldier.Abstract.Soldier;

public class Swordsman extends Soldier {

    private int cutPoint;

    public int getCutPoint() {
        return cutPoint;
    }

    public void setCutPoint(int cutPoint) {
        this.cutPoint = cutPoint;
    }

    public Swordsman(String name, int attackPoint, int defensePoint, int experiencePoint, int cutPoint){
        super(name,attackPoint,defensePoint,experiencePoint);
        this.cutPoint = cutPoint;
    }

    @Override
    public void attack() {
        System.out.println(this.getName()+" swings his sword!");
        this.setExperiencePoint(this.getExperiencePoint()+20);
        System.out.println(this.getName()+"'s experience point is increased by 20 and now it is "+this.getExperiencePoint());
    }

    @Override
    public void defense() {
        System.out.println(this.getName()+" uses his shiled!");
    }

    @Override
    public void train() {
        System.out.println(this.getName()+" learnt new moves with sword.His cut point is increased by 20.");
        this.setCutPoint(this.getCutPoint()+20);
        this.setAttackPoint(this.getAttackPoint()+10);
        this.setDefensePoint(this.getDefensePoint()+25);
    }

    @Override
    public void printAttributes() {
        System.out.println(this.getName()+" :\n   Attack Point : "+this.getAttackPoint()+"\n   Defense Point : "+this.getDefensePoint()
                +"\n   Experience Point : "+this.getExperiencePoint()+"\n   Cut Point : "+this.getCutPoint());
    }

}
