package org.example.action;

import org.example.unit.Unit;

public class Disease implements Action {
    private String name = "Недуг";

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public float getImprovementCoef() {
        return 0.5f;
    }

    public void execute(Unit unit){
    }
    public Disease(){
    }

}
