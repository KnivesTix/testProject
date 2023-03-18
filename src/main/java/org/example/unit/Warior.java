package org.example.unit;

import org.example.action.Action;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Warior extends Unit{

    private List<Action> actions = new ArrayList<>();

    public Warior(UnitType unitType) {
        super(unitType);
    }


    public void setActions(Action actions) {
        Collections.addAll(this.actions, actions);
    }
}
