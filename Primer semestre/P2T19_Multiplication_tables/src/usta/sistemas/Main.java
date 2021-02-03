package usta.sistemas;
import java.util.Scanner;
public class Main {

    public static void main(String[] args) {
        // Author:Santiago Hernandez Molina
        //Date:27/04/2020
        //Description this software prints the multiplication tables
        Scanner keyboard=new Scanner(System.in);
        int menu;
        f_menu();
        do {
            f_tables();
            System.out.println("Do you want to create other table 1:yes, 0:exit");
            menu = keyboard.nextInt();
        } while (menu==1);
        System.out.println("thanks for use the software");

    }
    public static void f_menu() {
        //This method show thw menu of the software
        System.out.println(" ___________________________________");
        System.out.println("| SoftMultiplicationTables          |");
        System.out.println("| Version 1.0 27-04-2020            |");
        System.out.println("| Created by Santiago Hernández     |");
        System.out.println("|___________________________________|");
        System.out.println("                                     ");
    }
    public static int f_options(){
        //This method return the number that you want multiply
        Scanner keyboard=new Scanner(System.in);
        int option;
        do {
            System.out.println("input the number of the table that you want see");
            option = keyboard.nextInt();
        }while (option<1||option>99);
        return option;
    }
    public static void f_tables(){
        //This method show the multiplication table
        int menu, option= f_options();
        System.out.println("the multiplication table of "+option+" is:");
        for (int i=1;i<=10;i++){
            System.out.println(option+"x"+i+"="+option*i);
        }

    }

}
