package flyweight;

public class ChickenStats {
    private String difficulty;
    private int hp;
    private int speed;
    private String projectile;
    public ChickenStats(String difficulty, int hp, int speed, String projectile) {
        this.difficulty = difficulty;
        this.hp = hp;
        this.speed = speed;
        this.projectile = projectile;
    }

    public String getDifficulty() {
        return difficulty;
    }
    public int getHp() {
        return hp;
    }
    public int getSpeed() {
        return speed;
    }
    public String getProjectile() {
        return projectile;
    }
}
