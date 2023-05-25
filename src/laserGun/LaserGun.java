package laserGun;

import ammunition.Ammunition;

public abstract class LaserGun {

    private LaserGun biggerGun;

    public abstract void shootAGun(Ammunition ammunition);

    public LaserGun getBiggerGun() {
        return biggerGun;
    }

    public void setBiggerGun (LaserGun biggerGun) {
        this.biggerGun = biggerGun;
    }
}

