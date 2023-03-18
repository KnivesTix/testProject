package org.example.race;

import org.example.action.Damage;
import org.example.action.Disease;

public class Undead extends Race {

    public Undead(){
        warior.setActions(new Damage(18));
        wizard.setActions(new Damage(5));
        wizard.setActions(new Disease());
        shooter.setActions(new Damage(4));
        shooter.setActions(new Damage(2));
        this.setName("undead");
        warior.setName("warior");

    }
}
