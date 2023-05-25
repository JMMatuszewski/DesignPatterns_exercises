package laserGun;

import ammunition.Ammunition;

public class SmallGun extends LaserGun {
    private static final String gunType = "Laser";

    @Override
    public void shootAGun(Ammunition ammunition) {
        if (ammunition.getLaserGun().equals(GunType.SMALL)) {
            System.out.println(ammunition.getEnergyAmount() + " amount of energy has been sent, " + gunType + " gun has shot the chicken.");
        } else {
            getBiggerGun().shootAGun(ammunition);
        }
    }

}
