package usta.sistemas;
import java.util.Scanner;
public class Main {

    public static void main(String[] args) {
        // AUTHOR: Santiago Hernández Molina
        //DATE: 13-04-2020
        //DESCRIPTION: this software calculates the average height of a group of 5 children
        f_menu();
        double summatory=f_sum_height();
        System.out.println("The summatory is: "+summatory+ " mts");
        f_average(summatory);


    }
    public static void f_menu() {
        //This method show thw menu of the software
        System.out.println(" ___________________________________");
        System.out.println("|  SoftAverageHeight                |");
        System.out.println("| Version 1.0 13-04-2020            |");
        System.out.println("| Created by Santiago Hernández     |");
        System.out.println("|___________________________________|");
        System.out.println("                                     ");
        System.out.println("input the kind of option grades: \n1.Celsius \n2.Fahrenheit \n3.kelvin");
    }
    public static double f_sum_height() {
        //Description: This method calculate the summatory of 5 height
        Scanner keyboard = new Scanner(System.in);
        double summatory, height1, height2, height3, height4, height5;
        System.out.println("Input the firts height (mts):");
        height1 = keyboard.nextDouble();
        System.out.println("Input the second height (mts):");
        height2 = keyboard.nextDouble();
        System.out.println("Input the third height (mts):");
        height3 = keyboard.nextDouble();
        System.out.println("Input the fourth height (mts):");
        height4 = keyboard.nextDouble();
        System.out.println("Input the five height (mts):");
        height5 = keyboard.nextDouble();
        summatory = height1 + height2 + height3 + height4 + height5;
        return summatory;
    }
    public static void f_average(double summatory){
        //Description: This method calculate the average
        double average= summatory/5;
        System.out.println("The average is: "+average+ " (mts)");
    }


}
