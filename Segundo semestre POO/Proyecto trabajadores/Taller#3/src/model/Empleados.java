package model;
//*Author: Juan David Neira Martinez
//*Date: 16/10/2020
//*Description: this software describe the employees
public class Empleados {

    //Attributes
    private int id;
    private String name;
    private int cc;
    private int age;
    private String sex;
    private String telephone;
    private double salary;

    //Constructors
    public Empleados() {
    }

    public Empleados(String name, int cc, int age, String sex, String telephone, double salary) {
        this.name = name;
        this.cc = cc;
        this.age = age;
        this.sex = sex;
        this.telephone = telephone;
        this.salary = salary;
    }

    public int getId() {
        return id;
    }

    //Setter and Getters
    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getCc() {
        return cc;
    }

    public void setCc(int cc) {
        this.cc = cc;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    public String getTelephone() {
        return telephone;
    }

    public void setTelephone(String telephone) {
        this.telephone = telephone;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    @Override
    public String toString(){
        return "Id: "+ id + "Name: " + name  + "CC: " + cc + "Age: " + age + "Sex: " + sex + "Telephone " + telephone + "Salary " + salary;
    }
}
