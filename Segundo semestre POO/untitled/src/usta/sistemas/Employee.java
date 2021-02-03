package usta.sistemas;

/*
Author: Santiago Hernandez Molina
Date: 29/09/2020
 */

public class Employee {

    private int id;
    private String name;
    private String phoneNumber;
    private String address;

    public Employee() {
    }

    public Employee(int id, String name, String phoneNumber, String address) {

        this.id = id;
        this.name = name;
        this.phoneNumber = phoneNumber;
        this.address = address;

    }

    public int getId() {
        return this.id;
    }

    public void setId() {
        this.id = id;
    }

    public String getName() {
        return this.name;
    }

    public void setName() {
        this.name = name;
    }

    public String getPhoneNumber() {
        return this.phoneNumber;
    }

    public void setPhoneNumber() {
        this.phoneNumber = phoneNumber;
    }

}

