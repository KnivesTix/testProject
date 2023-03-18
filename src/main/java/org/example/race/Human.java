package org.example.race;

import org.example.action.Damage;
import org.example.action.Improvement;

public class Human extends Race{

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
