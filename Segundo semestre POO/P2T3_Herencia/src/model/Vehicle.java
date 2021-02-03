package model;

public class Vehicle {

    private int id;
    private String licensePlate;
    private String brand;
    private Owner owner;
    private int model;


    public Vehicle() {
    }

    public Vehicle(int id, String licensePlate, String brand, Owner owner, int model) {
        this.id = id;
        this.licensePlate = licensePlate;
        this.brand = brand;
        this.owner = owner;
        this.model = model;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getLicensePlate() {
        return licensePlate;
    }

    public void setLicensePlate(String licensePlate) {
        this.licensePlate = licensePlate;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public Owner getOwner() {
        return owner;
    }

    public void setOwner(Owner owner) {
        this.owner = owner;
    }

    public int getModel() {
        return model;
    }

    public void setModel(int model) {
        this.model = model;
    }

    @Override
    public String toString() {
        return super.toString();
    }
}
