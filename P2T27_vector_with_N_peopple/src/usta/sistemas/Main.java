package usta.sistemas;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        // Author:Santiago Hernandez Molina
        //Date: 05/05/2020
        //this software
        f_menu();
        int totalPeople = total_people();
        int[] agePeople = f_age_of_people(totalPeople);
        f_show_age(agePeople);
        average_age(agePeople);

    }


    public static void f_menu() {
        //This method show the menu of the software
        System.out.println(" ___________________________________");
        System.out.println("|  SoftAgePeople                    |");
        System.out.println("| Version 1.0 05-05-2020            |");
        System.out.println("| Created by Santiago Hernández     |");
        System.out.println("|___________________________________|");
        System.out.println("                                     ");
    }

    public static int total_people() {
        Scanner keyboard = new Scanner(System.in);
        System.out.println("input the number of people");
        int totalPeople = keyboard.nextInt();
        while (totalPeople <= 0) {
            System.err.println("ERR;check that number of people was greater than 0");
            totalPeople = keyboard.nextInt();
        }
        return totalPeople;
    }

    public static int[] f_age_of_people(int totalPeople) {
        //This function return a vector with the age o people
        int[] age_people = new int[totalPeople];
        for (int i = 0; i < totalPeople; i++) {
            age_people[i] = (int) Math.floor((Math.random() * 80) + 1);
        }
        return age_people;
    }

    public static void f_show_age(int[] age_people) {
        //This method show how many people are over 18 and how many are under 18
        int Total_over18 = 0, Total_under18 = 0, Total_over60 = 0;
        for (int age_person : age_people) {
            System.out.println(age_person);
            if (age_person < 18) {
                Total_under18 += 1;
            } else {
                if (age_person > 60) {
                    Total_over60 += 1;
                } else {
                    Total_over18 += 1;
                }
            }
        }
        System.out.println("The total people under 18 is: " + Total_under18);
        System.out.println("The total people between 18 and 60 is: " + Total_over18);
        System.out.println("the total people over 60 is: " + Total_over60);
    }

    public static void average_age(int[] totalP) {
        int sum_age = 0;
        for (int value : totalP) {
            sum_age = sum_age + value;
        }
        int average = sum_age / totalP.length;
        System.out.println("the average is: " + average);
    }
}
