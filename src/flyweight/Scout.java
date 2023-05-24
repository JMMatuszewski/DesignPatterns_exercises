package flyweight;

public class Scout{
    private String difficulty;
    private int hp;
    private int speed;
    private String projectile;

    private ChickenStats stats;
    public Scout(String difficulty, int hp, int speed, String projectile) {
        this.difficulty = difficulty;
        this.hp = hp;
        this.speed = speed;
        this.projectile = projectile;
    }
}