package usta.sistemas;

import java.util.Random;

public class Main {

    public static void main(String[] args) {
        // Author:Santiago Hernandez Molina
        //Date:04/05/2020
        //Description: This software saves the salary of 5 employees
        f_menu();
        int[] salary_employees = f_salary();
        for (int i = 0; i < 5; i++) {
            System.out.println("The salary of (" + (i + 1) + ") is : " + salary_employees[i]);
        }

    }

    public static void f_menu() {
        //This method show thw menu of the software
        System.out.println(" ___________________________________");
        System.out.println("|  SoftVectorSalary                 |");
        System.out.println("| Version 1.0 04-05-2020            |");
        System.out.println("| Created by Santiago Hernández     |");
        System.out.println("|___________________________________|");
        System.out.println("                                     ");
    }

    public static int[] f_salary() {
        //This method return a vector with salary of five employees
        Random rand = new Random();
        int[] salary = new int[5];//This var to save the salary of five employees
        for (int i = 0; i < 5; i++) {
            salary[i] = (int) Math.floor(Math.random() * (2000000 - 1000000 + 1) + 1000000);
        }
        return salary;
    }


}
