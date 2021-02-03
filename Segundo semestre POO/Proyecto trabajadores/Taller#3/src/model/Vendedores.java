package model;
//*Author: Juan David Neira Martinez
//*Date: 16/10/2020
//*Description: this software describe the employees
public class Vendedores extends Empleados implements Taxes {

    //Attributes
    private String zone;

    //Constructors
    public Vendedores() {
    }

    public Vendedores(String zone) {
        this.zone = zone;
    }

    //Setters and Getters
    public String getZone() {
        return zone;
    }

    public void setZone(String zone) {
        this.zone = zone;
    }

    @Override
    public String toString() {
        return "zone: " + zone + ", (" + super.toString() + ")" + ", salary: " + getSalary();
    }

    @Override
    public double getSalary() {
        return getSalary();
    }
}
