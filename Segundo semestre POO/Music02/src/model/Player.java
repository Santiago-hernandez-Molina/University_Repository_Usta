/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import java.util.Objects;

/**
 *
 * @author ITEDRIS
 */
public class Player {
    //Attributes
    private int id;
    private String name;
    private int age;
    private boolean qualification;

    //Constructors

    public Player(int id, String name,  int age, boolean qualification) {
        this.id = id;
        this.name = name;
        this.age = age;
        this.qualification = qualification;
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


    public int getAge(int age) {
        return this.age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public boolean isQualification() {
        return qualification;
    }

    public void setQualification(boolean qualification) {
        this.qualification = qualification;
    }


    //toString


    @Override
    public String toString() {
        return "Player{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", age=" + age +
                ", qualification=" + qualification +
                '}';
    }


    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Player player = (Player) o;
        return id == player.id &&
                age == player.age &&
                qualification == player.qualification &&
                name.equals(player.name);

    }

    @Override
    public int hashCode() {
        return Objects.hash(id, name, age, qualification);
    }
}

