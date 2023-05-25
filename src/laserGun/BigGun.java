package laserGun;

import ammunition.Ammunition;

public class BigGun extends LaserGun{
    private static final String gunType = "Gauss";

    @Override
    public void shootAGun(Ammunition ammunition) {
        if (ammunition.getLaserGun().equals(GunType.BIG)) {
            System.out.println(ammunition.getEnergyAmount() + " amount of energy has been sent, " + gunType + " gun has shot the chicken.");
        } else {
            System.out.println("We have no bigger guns for such power!.");
        }
    }

}
