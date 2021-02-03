package model;

public class Landmammal extends Animal implements Food {

    //attributes
    private int strenght;
    private boolean domesticable;

    public Landmammal(){
        super();
    }

    //Constructor
    public Landmammal(int id, String animalName, boolean hostility, int health, int damage, int weight, int speed, int strenght, boolean domesticable) {
        super(id, animalName, hostility, health, damage, weight, speed);
        this.strenght = strenght;
        this.domesticable = domesticable;
    }

    //setter and getter
    public int getStrenght() {
        return strenght;
    }

    public void setStrenght(int strenght) {
        this.strenght = strenght;
    }

    public boolean isDomesticable() {
        return domesticable;
    }

    public void setDomesticable(boolean domesticable) {
        this.domesticable = domesticable;
    }

    @Override
    public String toString() {
        return "Landmammal" +
                " strenght=" + strenght +
                ", domesticable=" + domesticable  +
                '(' + super.toString() +", dropFood"+ getFood()+')';
    }

    @Override
    public int getFood() {
        return (int) (weight*0.6);
    }
}
