package model;

public abstract class Animal {
    private int id;
    private String animalName;
    private boolean hostility;
    private int health;
    private int damage;
    protected int weight;
    private int speed;

    public Animal() {
    }

    //Constructor
    public Animal(int id, String animalName, boolean hostility, int health, int damage, int weight, int speed) {
        this.id = id;
        this.animalName = animalName;
        this.hostility = hostility;
        this.health = health;
        this.damage = damage;
        this.weight = weight;
        this.speed = speed;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getAnimalName() {
        return animalName;
    }

    public void setAnimalName(String animalName) {
        this.animalName = animalName;
    }

    public boolean isHostility() {
        return hostility;
    }

    public void setHostility(boolean hostility) {
        this.hostility = hostility;
    }

    public int getHealth() {
        return health;
    }

    public void setHealth(int health) {
        this.health = health;
    }

    public int getDamage() {
        return damage;
    }

    public void setDamage(int damage) {
        this.damage = damage;
    }

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    public int getSpeed() {
        return speed;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }

    @Override
    public String toString() {
        return
                "id=" + id +
                ", animalName='" + animalName + '\'' +
                ", hostility=" + hostility +
                ", health=" + health +
                ", damage=" + damage +
                ", weight=" + weight +
                ", speed=" + speed;
    }

    @Override
    public int hashCode() {
        return id;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Animal other = (Animal) obj;
        if (this.id != other.id) {
            return false;
        }
        return true;
    }



}
