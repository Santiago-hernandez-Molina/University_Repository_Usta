/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

/**
 *
 * @author Diego Alexander Guerrero Campos
 */
public class Author {
    //Attributes
    private int id;
    private String name;
    private String fecha_de_nacimiento;
    private int age;
    
    //Constructors
    public Author() {}

    public Author(int id, String name, String fecha_de_nacimiento, int age) {
        this.id = id;
        this.name = name;
        this.fecha_de_nacimiento = fecha_de_nacimiento;
        this.age = age;
    }

    //Getters and Setters


    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getFecha_de_nacimiento() {
        return fecha_de_nacimiento;
    }

    public void setFecha_de_nacimiento(String fecha_de_nacimiento) {
        this.fecha_de_nacimiento = fecha_de_nacimiento;
    }

    public int getAge(int age) {
        return this.age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    //toString

    @Override
    public String toString() {
        return "Author{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", fecha_de_nacimiento='" + fecha_de_nacimiento + '\'' +
                ", age=" + age +
                '}';
    }
    @Override
    public int hashCode() {
        return id;
    }
}


