package org.example.race;

import org.example.action.Damage;
import org.example.action.Improvement;
import org.example.race.Race;
import org.example.unit.Shooter;
import org.example.unit.Unit;
import org.example.unit.Warior;
import org.example.unit.Wizard;

public class Human extends Race{

   // Warior warior = new Warior(Unit.UnitType.WARIOR);
   // Wizard wizard = new Wizard(Unit.UnitType.WIZARD);
   // Shooter shooter = new Shooter(Unit.UnitType.SHOOTER);

    public Human(){
        warior.setActions(new Damage(18));
        wizard.setActions(new Improvement());
        wizard.setActions(new Damage(4));
        shooter.setActions(new Damage(5));
        shooter.setActions(new Damage(3));
        this.setName("human");
        warior.setName("warior");
    }
}
