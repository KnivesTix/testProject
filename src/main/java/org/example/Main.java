package org.example;

import org.example.race.Race;
import org.example.squad.Squad;
import org.example.unit.Unit;
import java.util.LinkedList;
import java.util.List;
import java.util.Random;

public class Main {
    private final List<Squad> squads = new LinkedList<>();

    public static void main(String[] args) {
         Main main = new Main();
         Squad squad = new Squad(main.randomRace(Race.RaceType.good));
         Squad squad2 = new Squad(main.randomRace(Race.RaceType.bad));

         main.squads.add(squad);
         main.squads.add(squad2);
         main.doAttack();
    }

    private Race randomRace(Race.RaceType raceType) {
        Random random = new Random();
        Race[] races = raceType.getRace();
        return races[random.nextInt(races.length)];
    }

    private void doAttack(){
        Unit firstUnit, secondUnit;
        Random random = new Random();
        int src = random.nextInt(2);

        firstUnit = squads.get(src).getActiveUnit();
        firstUnit.setCurrentAction();
        int trg = 1 - src;

        secondUnit = squads.get(trg).getRandomUnit();

        firstUnit.executeAction(secondUnit);
    }



}