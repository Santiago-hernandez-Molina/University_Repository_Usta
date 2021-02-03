package usta.sistemas;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        // Author:Santiago Hernandez Molina
        //Date:30/04/2020
        //Description: This software allow choose one product in a machine
        Scanner keyboard = new Scanner(System.in);
        int run;
        do {
            int opt = f_option();
            f_ticket(opt);
            System.out.println("do you want to order other drink press 1 to continue");
            run = keyboard.nextInt();
        } while (run == 1);


    }

    public static void f_menu() {
        //This method show the menu of the software
        System.out.println(" _________________________________________________________");
        System.out.println("|      Producto      |    Valor     |   Tiempo(Creación)  |");
        System.out.println("|1.Aromatica         |        $ 1300|                30seg|");
        System.out.println("|2.Café negro        |        $ 1000|                30seg|");
        System.out.println("|3.Café con leche    |        $ 1900|                45seg|");
        System.out.println("|4.Capuchino         |        $ 2500|                60seg|");
        System.out.println("|5.Mocachino         |        $ 2700|                70seg|");
        System.out.println("|____________________|______________|_____________________|");
    }

    public static int f_option() {
        //This method return the user option
        Scanner keyboard = new Scanner(System.in);
        int option;
        do {
            f_menu();
            System.out.println("input the option to choose(input values between 1 and 5)");
            option = keyboard.nextInt();
        } while (option < 1 || option > 5);
        return option;
    }

    public static void f_ticket(int opt) {
        //
        Scanner keyboard = new Scanner(System.in);
        int seg = 0, ticket, sumT = 0;
        if (opt == 1) {
            opt = 1300;
            seg = 30;
        } else if (opt == 2) {
            opt = 1000;
            seg = 30;
        } else if (opt == 3) {
            opt = 1900;
            seg = 45;
        } else if (opt == 4) {
            opt = 2500;
            seg = 60;
        } else if (opt == 5) {
            opt = 2700;
            seg = 70;
        }

        System.out.println("value of product is " + opt);
        System.out.println("input the ticket value");
        ticket = keyboard.nextInt();
        sumT += ticket;
        System.out.println("money entered $" + sumT);
        while (sumT < opt) {
            System.out.println("enter the missing money ");
            ticket = keyboard.nextInt();
            sumT += ticket;
            System.out.println("money entered $" + sumT);
        }
        int change = sumT - opt;
        System.out.println("your drink is brewing");
        System.out.println("your change are: $" + change);
        System.out.println("please wait " + seg + "seg");


    }
}