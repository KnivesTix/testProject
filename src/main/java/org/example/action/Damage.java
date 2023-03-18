package org.example.action;


import org.example.unit.Unit;

public class Damage implements Action{
    private String name = "Урон";
    private int damage;
    public Damage(int damage){
        this.damage = damage;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getDamage() {
        return damage;
    }

    public void setDamage(int damage) {
        this.damage = damage;
    }

    public float getImprovementCoef() {
        return 1.0f;
    }

    public void execute(Unit unit) {
        unit.setHealth(unit.getHealth() - (damage * getImprovementCoef()));
        System.out.println(unit.getHealth());
    }


}
