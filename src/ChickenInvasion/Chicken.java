package ChickenInvasion;

public abstract class Chicken {
    private String difficulty;
    private int hp;
    private int speed;
    private String projectile;

    public Chicken(String difficulty, int hp, int speed, String projectile) {
        this.difficulty = difficulty;
        this.hp = hp;
        this.speed = speed;
        this.projectile = projectile;
    }

    public String getDifficulty() {
        return this.difficulty;
    }

    public int getHp() {
        return this.hp;
    }

    public int getSpeed() {
        return this.speed;
    }

    public String getProjectile() {
        return this.projectile;
    }
}