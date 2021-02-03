package model;

public class Car extends Vehicle {

    private String color;

    public Car() {
        super();
    }

    public Car(int id, String licensePlate, String brand, Owner owner, int model, String color) {
        super(id, licensePlate, brand, owner, model);
        this.color = color;
    }
}
