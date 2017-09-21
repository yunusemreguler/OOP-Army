package com.company.Soldier.Object;

import com.company.Soldier.Abstract.Soldier;

public class Archer extends Soldier {

    private int aimPoint;

    public int getAimPoint() {
        return aimPoint;
    }

    public void setAimPoint(int aimPoint) {
        this.aimPoint = aimPoint;
    }

    public Archer(String name, int attackPoint, int defensePoint, int experiencePoint, int aimPoint){
        super(name,attackPoint,defensePoint,experiencePoint);
        this.aimPoint = aimPoint;
    }

    @Override
    public void attack() {
        System.out.println(this.getName()+" shoots arrows!");
        this.setExperiencePoint(this.getExperiencePoint()+20);
        System.out.println(this.getName()+"'s experience point is increased by 20 and now it is "+this.getExperiencePoint());
    }

    @Override
    public void defense() {
        System.out.println(this.getName()+" keeps his distance to enemy!");
    }

    @Override
    public void train() {
        System.out.println(this.getName()+" shoots arrows to dummy.His aim point is increased by 20.");
        this.setAimPoint(this.getAimPoint()+20);
        this.setAttackPoint(this.getAttackPoint()+20);
        this.setDefensePoint(this.getDefensePoint()+5);
    }

    @Override
    public void printAttributes() {
        System.out.println(this.getName()+" :\n   Attack Point : "+this.getAttackPoint()+"\n   Defense Point : "+this.getDefensePoint()
                +"\n   Experience Point : "+this.getExperiencePoint()+"\n   Aim Point : "+this.getAimPoint());
    }
}
