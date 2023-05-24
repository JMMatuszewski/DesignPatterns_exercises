package flyweight;

public class Tank{

    private int x;
    private int y;
    private ChickenStats stats;

    public Tank(int x, int y) {
        this.stats = ChickenStatsRepository.getTankStats();
        this.x = x;
        this.y = y;

    }
}