package org.example.squad;

import org.example.race.Race;
import org.example.unit.Unit;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.stream.IntStream;

public class Squad {
    private final List<Unit> unit = new ArrayList<>();
    Race race;
    public final int wizard_cnt = 1;
    public final int warior_cnt = 4;
    public final int shooter_cnt = 3;

    public Squad(Race race) {
        this.race = race;

        IntStream.rangeClosed(1, wizard_cnt).forEach(
                i -> unit.add(new Unit(race.getWizard()))
        );

        IntStream.rangeClosed(1, shooter_cnt).forEach(
                i -> unit.add(new Unit(race.getShooter()))
        );

        IntStream.rangeClosed(1, warior_cnt).forEach(
                i -> unit.add(new Unit(race.getWarior()))
        );
    }
    public List<Unit> getUnit(){
        return unit;
}
    public Unit getActiveUnit() {
        return getRandomUnit();
    }
    public Squad(){}
    public Unit getRandomUnit(){
        return unit.get(new Random().nextInt(unit.size()));
    }

}
