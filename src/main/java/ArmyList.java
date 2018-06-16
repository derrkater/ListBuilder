import lombok.Data;

import java.util.List;

@Data
public class ArmyList {

    private String sideOfConflict;
    private int pointsLimit;
    private int points;
    private List<Unit> units;
    private int unitCount;
    private int breakCondition;
    private Model leader;
    private int bowsLimit;
    private int bowsCount;

}
