package org.example.unit;

import org.example.action.Action;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Random;


public class Unit {
    String name;
    private List<Action> actions = new ArrayList<>();
    private UnitType unitType;

    public float health = 100.0f;
    private Action currentAction;
    private Action action;

    public String getName(){
        return name;
    }
    public void setName(String name){
        this.name = name;
    }
    public Unit(UnitType unitType) {
        this.unitType = unitType;
    }
    public float getHealth(){
        return health;
    }
    public void setHealth(float health){
        this.health = health;
    }
    public void setActions(Action... actions) {
        Collections.addAll(this.actions, actions);
    }

    public void setCurrentAction(Action currentAction) {
        this.currentAction = currentAction;
    }

    public Action getCurrentAction() {
        return currentAction;
    }
    public UnitType getUnitType(){
            return unitType;
    }

    public void setCurrentAction() {
        this.currentAction = actions.get(new Random().nextInt(actions.size()));
    }
    public List<Action> getActions() {
        return actions;
    }

    public enum UnitType {
        SHOOTER,
        WIZARD,
        WARIOR;
    }

    public Unit (Unit unit){
        this.unitType = unit.unitType;
        this.name = unit.name;
        this.actions = unit.getActions();
    }
    public void executeAction(Unit trg) {
        if (currentAction == null) {
            setCurrentAction();
        }
        currentAction.execute(trg);
    }

}
