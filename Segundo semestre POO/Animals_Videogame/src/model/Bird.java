package model;

import java.util.WeakHashMap;

public class Bird extends Animal implements Food {

    //attributes
    private boolean flying;

    public Bird() {
        super();
    }


    //Constructor
    public Bird(int id, String animalName, boolean hostility, int health, int damage, int weight, int speed, boolean flying) {
        super(id, animalName, hostility, health, damage, weight, speed);
        this.flying = flying;
    }

    //setter and getter
    public boolean isFlying() {
        return flying;
    }

    public void setFlying(boolean flying) {
        this.flying = flying;
    }

    @Override
    public String toString() {
        return "Bird" +
                " flying=" + flying +
                '(' + super.toString() +", dropFood"+getFood()+ ')';
    }

    @Override
    public int getFood() {
        return (int) (weight * 0.4);
    }
}
