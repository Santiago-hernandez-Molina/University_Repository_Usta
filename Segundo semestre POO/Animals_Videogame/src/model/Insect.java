package model;

public class Insect extends Animal implements Food {

    //attributes
    private boolean poisonous;

    public Insect() {
        super();
    }

    //Constructor
    public Insect(int id, String animalName, boolean hostility, int health, int damage, int weight, int speed, boolean poisonous) {
        super(id, animalName, hostility, health, damage, weight, speed);
        this.poisonous = poisonous;
    }

    //setter and getter


    public boolean isPoisonous() {
        return poisonous;
    }

    public void setPoisonous(boolean poisonous) {
        this.poisonous = poisonous;
    }

    @Override
    public String toString() {
        return "Insect" +
                " poisonous=" + poisonous  +
                '(' + super.toString() +", dropFood"+ getFood()+')';
    }

    @Override
    public int getFood() {
        return (int) (weight*0.1);
    }

}
