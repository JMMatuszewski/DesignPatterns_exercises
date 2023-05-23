package ChickenInvasion;

public class ChickenFactory extends Factory{
    @Override
    public Chicken createChicken(ChickenType type) {
        switch(type) {
            case SCOUT:
                return new Scout("easy",25,15,"feather");
            case SOLDIER:
                return new Soldier("normal",50,10,"egg");
            case TANK:
                return new Tank("hard",100,5,"eggBasket");
            default:
                throw new UnsupportedOperationException("No such type");

        }
    }
}
