package flyweight;

public class Soldier{

    private int x;
    private int y;
    private ChickenStats stats;

    public Soldier(int x, int y) {
        this.stats = ChickenStatsRepository.getSoldierStats();
        this.x = x;
        this.y = y;

    }
}