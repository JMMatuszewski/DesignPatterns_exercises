package ammunition;

import laserGun.GunType;

public class Ammunition {

    private String energy;
    private GunType gunType;

    public Ammunition(String energy, GunType gunType) {
        this.energy = energy;
        this.gunType = gunType;
    }

    public String getEnergyAmount() {
        return energy;
    }
    public GunType getLaserGun() {
        return gunType;
    }

}
