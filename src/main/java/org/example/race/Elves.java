package org.example.race;

import org.example.action.Damage;
import org.example.action.Improvement;

public class Elves extends Race{

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
