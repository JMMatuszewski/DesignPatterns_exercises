import ChickenInvasion.*;

public class Main {
    public static void main(String[] args) {

        System.out.println("Chickens are comming!");

        Factory factory = new ChickenFactory();

        Chicken scout = factory.createChicken(ChickenType.SCOUT);
        Chicken soldier = factory.createChicken(ChickenType.SOLDIER);
        Chicken tank = factory.createChicken(ChickenType.TANK);
    }
}