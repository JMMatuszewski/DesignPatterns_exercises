public class Main {
    public static void main(String[] args) {

        System.out.println("Chickens incoming!");

        Chicken scout = new Scout("easy", 25, 15, "feathers");
        Chicken soldier = new Soldier("normal", 50, 10, "egg");
        Chicken tank = new Tank("hard", 100, 5, "basket");
    }
}