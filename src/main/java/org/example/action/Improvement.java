package org.example.action;

import org.example.unit.Unit;

public class Improvement implements Action{
    private String name = "Улучшение";

    public Improvement(){
    }

    public float getImprovementCoef() {
        return 1.5f;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void execute(Unit unit){
    }

}
