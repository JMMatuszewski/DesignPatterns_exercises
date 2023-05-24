package flyweight;

public class ChickenStatsRepository {
    private static ChickenStats scoutStats = new ChickenStats("easy",25,15,"feather");
    private static ChickenStats soldierStats = new ChickenStats("normal",50,10,"egg");
    private static ChickenStats tankStats = new ChickenStats("hard",100,5,"basket");

    private ChickenStatsRepository() {}

    public static ChickenStats getScoutStats() {
        return scoutStats;
    }
    public static ChickenStats getSoldierStats() {
        return soldierStats;
    }
    public static ChickenStats getTankStats() {
        return tankStats;
    }

}
