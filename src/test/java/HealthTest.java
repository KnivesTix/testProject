import org.example.action.Damage;
import org.example.race.Elves;
import org.example.race.Orc;
import org.example.squad.Squad;
import org.example.unit.Unit;
import org.junit.jupiter.api.Test;


import static org.junit.jupiter.api.Assertions.assertEquals;

public class HealthTest {
    @Test
    public void testSquad() {
        Squad squad = new Squad(new Orc());
        Squad squad2 = new Squad(new Elves());

        Unit firstUnit = squad.getUnit().get(1);
        firstUnit.setCurrentAction(firstUnit.getActions().get(1));
        Damage dmg = (Damage) firstUnit.getActions().get(1);

        Unit secondUnit = squad2.getRandomUnit();
        float health = secondUnit.getHealth();

        firstUnit.executeAction(secondUnit);

        assertEquals(health - dmg.getDamage(), secondUnit.getHealth());
    }
}
