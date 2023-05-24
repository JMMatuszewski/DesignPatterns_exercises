import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        System.out.println("Chickens incoming!");

        List<Object> enemyChickens = new ArrayList<>();

        for(int i = 0; i < 1000000 ; i++) {
            enemyChickens.add(new Scout("easy", 25, 15, "feathers",50,0));
            enemyChickens.add(new Soldier("normal", 50, 10, "egg",25,0));
            enemyChickens.add(new Tank("hard", 100, 5, "basket",75,0));
        }

    }
}