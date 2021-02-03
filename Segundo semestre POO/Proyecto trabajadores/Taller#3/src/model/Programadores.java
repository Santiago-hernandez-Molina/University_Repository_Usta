package model;

//*Author: Juan David Neira Martinez
//*Date: 16/10/2020
//*Description: this software describe the employees
public class Programadores extends Empleados implements Taxes{

    //Attributes
    private double zone;

    //Constructors
    public Programadores() {
        super();
    }

    public Programadores(boolean hasdoubleZone, String name, int cc, int age, String sex, String telephone, double salary) {
        super(name, cc, age, sex, telephone, salary);
        this.zone = zone;
    }

    //Setters and Getters
    public double getZone() {
        return zone;
    }

    public void setZone(double zone) {
        this.zone = zone;
    }

    @Override
    public String toString() {
        return "hasdoubleZone: " + zone + ", (" + super.toString() + ")" + ", salary: " + getSalary();
    }

    @Override
    public double getSalary() {
        return getSalary() * (10 / 100);
    }

}
