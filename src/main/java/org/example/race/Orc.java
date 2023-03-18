package org.example.race;

import org.example.action.Curse;
import org.example.action.Damage;
import org.example.action.Disease;
import org.example.action.Improvement;
import org.example.race.Race;
import org.example.unit.Shooter;
import org.example.unit.Unit;
import org.example.unit.Warior;
import org.example.unit.Wizard;

public class Orc extends Race {
 // Warior warior = new Warior(Unit.UnitType.WARIOR);
 // Wizard wizard = new Wizard(Unit.UnitType.WIZARD);
//  Shooter shooter = new Shooter(Unit.UnitType.SHOOTER);

  public Orc(){
    warior.setActions(new Damage(2));
    wizard.setActions(new Improvement(),new Curse());
   // wizard.setActions();
    shooter.setActions(new Damage(3), new Damage(2));
   // shooter.setActions();
    this.setName("orc");
    warior.setName("warior");
    wizard.setName("wizard");
    shooter.setName("shooter");
  }

}

