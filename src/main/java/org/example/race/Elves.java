package org.example.race;

import org.example.action.Damage;
import org.example.action.Improvement;
import org.example.unit.Shooter;
import org.example.unit.Unit;
import org.example.unit.Warior;
import org.example.unit.Wizard;

public class Elves extends Race{
 /*  Warior warior = new Warior(Unit.UnitType.WARIOR);
   Wizard wizard = new Wizard(Unit.UnitType.WIZARD);
   Shooter shooter = new Shooter(Unit.UnitType.SHOOTER);
*/
public Elves(){
   warior.setActions(new Damage(15));
   wizard.setActions(new Improvement(),new Damage(10));
   shooter.setActions(new Damage(7),new Damage(3));
   shooter.setActions();
   this.setName("elves");
   warior.setName("warior");
   wizard.setName("wizard");
   shooter.setName("shooter");

}

}
