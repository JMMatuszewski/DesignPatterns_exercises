import ammunition.Ammunition;
import laserGun.*;

public class Main {
    public static void main(String[] args) {
        System.out.println("Chickens are comming!");

        Ammunition ammunition = new Ammunition("big",GunType.BIG);

        LaserGun smallGun = new SmallGun();
        LaserGun mediumGun = new MediumGun();
        LaserGun bigGun = new BigGun();

        smallGun.setBiggerGun(mediumGun);
        mediumGun.setBiggerGun(bigGun);

        smallGun.shootAGun(ammunition);
        //gun.setMediumGun(true);

        //gun.shootAGun(ammunition);

    }
}