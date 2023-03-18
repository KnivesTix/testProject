package org.example.race;

import org.example.action.Curse;
import org.example.action.Damage;
import org.example.action.Improvement;


public class Orc extends Race {

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

