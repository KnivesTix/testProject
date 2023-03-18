import org.example.race.Elves;
import org.example.race.Orc;
import org.example.squad.Squad;
import org.example.unit.Unit;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class SquadTest {
    @Test
    public void testSquad() {
        Squad squad = new Squad(new Orc());
        List<Unit> orc = squad.getUnit();
        int total_count = squad.warior_cnt+squad.shooter_cnt + squad.wizard_cnt;
        assertEquals(total_count, getUnitCount(orc));
    }

    private long getUnitCount(List<Unit> orc) {

        Map<Unit, Long> counted = orc.stream()
                .collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));

        return counted.size();

    }

}
