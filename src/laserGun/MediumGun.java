package laserGun;

import ammunition.Ammunition;

public class MediumGun extends LaserGun{
    private static final String gunType = "Ion";

    @Override
    public void shootAGun(Ammunition ammunition) {
        if (ammunition.getLaserGun().equals(GunType.MEDIUM)) {
            System.out.println(ammunition.getEnergyAmount() + " amount of energy has been sent, " + gunType + " gun has shot the chicken.");
        } else {
            getBiggerGun().shootAGun(ammunition);
        }
    }

}
