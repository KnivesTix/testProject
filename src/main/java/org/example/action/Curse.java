package org.example.action;


import org.example.unit.Unit;

public class Curse implements Action {
    private String name = "Проклятие";

    public void execute (Unit unit) {
    }
    public Curse(){
    }

    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }

    public float getImprovementCoef() {
        return 1.0f;
    }
}
