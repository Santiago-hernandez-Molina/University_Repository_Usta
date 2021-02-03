package model;

public class Fish extends Animal implements Food{

    //attributes
    private boolean poisonous;
    private String waterTipe;

    public Fish(){
        super();
    }

    //Constructor
    public Fish(int id, String animalName, boolean hostility, int health, int damage, int weight, int speed, boolean poisonous, String waterTipe) {
        super(id, animalName, hostility, health, damage, weight, speed);
        this.poisonous = poisonous;
        this.waterTipe = waterTipe;
    }

    //setter and getter
    public boolean isPoisonous() {
        return poisonous;
    }

    public void setPoisonous(boolean poisonous) {
        this.poisonous = poisonous;
    }

    public String getWaterTipe() {
        return waterTipe;
    }

    public void setWaterTipe(String waterTipe) {
        this.waterTipe = waterTipe;
    }

    @Override
    public String toString() {
        return "Fish" +
                " poisonous=" + poisonous +
                ", waterTipe='" + waterTipe  +
                '(' + super.toString() + ", dropFood"+getFood()+')';
    }

    @Override
    public int getFood() {
        return (int) (weight*0.5);
    }
}
