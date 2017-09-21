package com.company.Soldier.Abstract;

public abstract class Soldier  {

    private String name;
    private int attackPoint;
    private int defensePoint;
    private int experiencePoint;

    public Soldier(){}

    public Soldier(String name, int attackPoint, int defensePoint, int experiencePoint){
        this.name = name;
        this.attackPoint = attackPoint;
        this.defensePoint = defensePoint;
        this.experiencePoint = experiencePoint;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAttackPoint() {
        return attackPoint;
    }

    public void setAttackPoint(int attackPoint) {
        this.attackPoint = attackPoint;
    }

    public int getDefensePoint() {
        return defensePoint;
    }

    public void setDefensePoint(int defensePoint) {
        this.defensePoint = defensePoint;
    }

    public int getExperiencePoint() {
        return experiencePoint;
    }

    public void setExperiencePoint(int experiencePoint) {
        this.experiencePoint = experiencePoint;
    }

    public abstract void attack();
    public abstract void defense();
    public abstract void train();
    public abstract void printAttributes();

}
