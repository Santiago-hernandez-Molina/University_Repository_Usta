package usta.sistemas;
import java.util.Scanner;
public class Main {

    public static void main(String[] args) {
        //AUTHOR: Santiago Hernandez Molina
        //DATE: 14/04/2020
        //Description: This software compare two numbers
        f_menu();
        f_compare();

    }
    public static void f_menu(){
        //This method show thw menu of the software

        System.out.println(" ___________________________________");
        System.out.println("|  SoftCompNumb                     |");
        System.out.println("| Version 1.0 14-04-2020            |");
        System.out.println("| Created by Santiago Hernández     |");
        System.out.println("|___________________________________|");
        System.out.println("                                     ");

    }
    public static void f_compare(){
        Scanner keyboard =new Scanner(System.in);
        int n1,n2;
        System.out.println("input the first integer number");
        n1=keyboard.nextInt();
        System.out.println("input the second integer number");
        n2=keyboard.nextInt();
        if(n1!=n2){
            System.out.println("the number are different");
        }
        else {
            System.out.println("the numbers are equals");
        }

    }
}
