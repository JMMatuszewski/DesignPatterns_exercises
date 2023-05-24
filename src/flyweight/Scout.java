package flyweight;

public class Scout{

    private int x;
    private int y;
    private ChickenStats stats;

    public Scout(int x, int y) {
        this.stats = ChickenStatsRepository.getScoutStats();
        this.x = x;
        this.y = y;

    }
}