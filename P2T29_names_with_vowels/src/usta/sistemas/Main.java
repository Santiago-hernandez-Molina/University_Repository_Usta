package usta.sistemas;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        // Author:Santiago Hernandez Molina
        //Date:06/06/2020
        //this software determinate how many letters a and e have one number
        int TotalP = f_menu();
        String[] names = f_people(TotalP);
        f_Count_letters(names);
    }

    public static int f_menu() {
        //This method show thw menu of the software
        System.out.println(" ___________________________________");
        System.out.println("| SoftNamesWithVowels               |");
        System.out.println("| Version 1.0 06-04-2020            |");
        System.out.println("| Created by Santiago Hernandez     |");
        System.out.println("|___________________________________|");
        System.out.println("                                     ");
        Scanner keyboard = new Scanner(System.in);
        System.out.println("input the total of people");
        int TotalPeople = keyboard.nextInt();
        while (TotalPeople < 1) {
            System.err.println("ERR:input values greater than 0\ninput the total of people again");
            TotalPeople = keyboard.nextInt();
        }
        return TotalPeople;
    }

    public static String[] f_people(int totalP) {
        Scanner keyboard = new Scanner(System.in);
        String[] names = new String[totalP];
        for (int i = 0; i < totalP; i++) {
            System.out.println("input the name of the person " + (i + 1));
            names[i] = keyboard.nextLine();
        }
        return names;
    }

    public static void f_Count_letters(String[] names) {
        //this method count how many names has the letters a and e
        int totalNA = 0, totalNE = 0, totalW = 0;
        for (String name : names) {
            totalW++;
            if (name.contains("a")) {//This conditional count how many people have the letter e
                totalNA++;
            }
            if (name.contains("e")) {//This conditional count how many people have the letter e
                totalNE++;
            }
        }
        System.out.println("the total persons that have the letter a are: " + totalNA);
        System.out.println("the total person that have the letter e are: " + totalNE);
        System.out.println("the total person are: " + totalW);
    }
}
