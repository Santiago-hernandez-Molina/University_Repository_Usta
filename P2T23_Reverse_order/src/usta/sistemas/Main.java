package usta.sistemas;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        // Author:Santiago Hernandez Molina
        //Date:29/04/2020
        //this software show the numbers that you input in reverse order
        f_menu();
    }

    public static void f_menu() {
        //This method show thw menu of the software
        System.out.println(" ___________________________________");
        System.out.println("|  SoftReverseOrder                 |");
        System.out.println("| Version 1.0 29-04-2020            |");
        System.out.println("| Created by Santiago Hernández     |");
        System.out.println("|___________________________________|");
        System.out.println("                                     ");
    }

    public static int f_number(int a) {
        //This method return the user numbers
        Scanner keyboard = new Scanner(System.in);
        int b=0;
        for (int i = 1; i <= 5; i++) {
            System.out.println("input the number");
            a=keyboard.nextInt();
        }
        return a;

    }

}
