package com.company.Model.Object;

import com.company.Model.Abstract.Soldier;

public class Cavalry extends Soldier {

    private int throwPoint;

    public Cavalry(String name, int attackPoint, int defensePoint, int experiencePoint, int throwPoint){
        super(name,attackPoint,defensePoint,experiencePoint);//super statement allows us to inherit attributes of Soldier class
        this.throwPoint = throwPoint;
    }

    public int getThrowPoint() {
        return throwPoint;
    }

    public void setThrowPoint(int throwPoint) {
        this.throwPoint = throwPoint;
    }

    @Override
    public void attack() {
        System.out.println(this.getName()+" throws his spear!");
        this.setExperiencePoint(this.getExperiencePoint()+20);
        System.out.println(this.getName()+"'s experience point is increased by 20 and now it is "+this.getExperiencePoint());
    }

    @Override
    public void defense() {
        System.out.println(this.getName()+" rides his horse to far away from the enemy!");
    }


    @Override
    public void train() {
        System.out.println(this.getName()+" made his spear-throwing range larger.His throw point is increased by 20.");
        this.setThrowPoint(this.getThrowPoint()+20);
        this.setAttackPoint(this.getAttackPoint()+15);
        this.setDefensePoint(this.getDefensePoint()+10);
    }

    @Override
    public void printAttributes() {
        System.out.println(this.getName()+" :\n   Attack Point : "+this.getAttackPoint()+"\n   Defense Point : "+this.getDefensePoint()
                +"\n   Experience Point : "+this.getExperiencePoint()+"\n   Throw Point : "+this.getThrowPoint());
    }
}
