package org.example.race;

import org.example.unit.Unit;

public class Race {

    private String name;

    public Race(){
    }
    final Unit wizard = new Unit(Unit.UnitType.WIZARD);

    final Unit shooter = new Unit(Unit.UnitType.SHOOTER);
    final Unit warior = new Unit(Unit.UnitType.WARIOR);

    public Unit getWizard() {
        return wizard;
    }

    public Unit getShooter() {
        return shooter;
    }

    public Unit getWarior() {
        return warior;
    }

    public String getName(){
            return name;
    }
    public void setName(String name){
        this.name = name;
    }
    public enum RaceType {
        good(new Race[]{new Elves(), new Human()}),
        bad(new Race[]{new Undead(), new Orc()});

        final Race[] race;

        public Race[] getRace() {
            return race;
        }
        RaceType(Race[] races) {
            this.race = races;
        }



    }

}
