public class LaserGun {

    private boolean small;

    private boolean medium;
    private boolean big;

    public void shootAGun(Ammunition ammunition) {
        if (small) {
            System.out.println("Small gun prepared, we got " + ammunition.getEnergyAmount() + "amount of energy");
        } else if(medium) {
            System.out.println("Medium gun prepared, we got " + ammunition.getEnergyAmount() + "amount of energy");
        } else if(big) {
            System.out.println("Big gun prepared, we got " + ammunition.getEnergyAmount() + "amount of energy");
        } else {
            System.out.println("We have no such guns!");
        }
    }

    public void setSmallGun(boolean small) {
        this.small = small;
    }
    public void setMediumGun(boolean medium) {
        this.medium = medium;
    }
    public void setBigGun(boolean big) {
        this.big = big;
    }
}
