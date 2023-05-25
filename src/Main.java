public class Main {
    public static void main(String[] args) {
        System.out.println("Chickens are comming!");

        Ammunition ammunition = new Ammunition("medium");

        LaserGun gun = new LaserGun();

        gun.setMediumGun(true);

        gun.shootAGun(ammunition);

    }
}