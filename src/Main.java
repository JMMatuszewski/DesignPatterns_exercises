import flyweight.Scout;
import flyweight.Soldier;
import flyweight.Tank;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        System.out.println("Chickens incoming!");

        List<Object> enemyChickens = new ArrayList<>();

        for(int i = 0; i < 1000000 ; i++) {
            enemyChickens.add(new Scout(50,0));
            enemyChickens.add(new Soldier(25,0));
            enemyChickens.add(new Tank(75,0));
        }

    }
}