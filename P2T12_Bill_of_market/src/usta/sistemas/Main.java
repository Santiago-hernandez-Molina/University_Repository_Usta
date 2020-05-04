package usta.sistemas;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
// AUTHOR: Santiago Hernández Molina
        //DATE: 21-04-2020
        //DESCRIPTION:This software calculate the gross value and total value
    f_menu();
    int N = f_total_product();
    double total_bill=0;
    for (int i=1;i<=N;i=i+1){
        total_bill=total_bill+f_value_product(i);
    }
        System.out.println("The total bill is: "+total_bill);
    }
    public static void f_menu(){
        //This method show thw menu of the software
        System.out.println(" ___________________________________");
        System.out.println("|  SoftBillMarket                   |");
        System.out.println("| Version 1.0 21-04-2020            |");
        System.out.println("| Created by Santiago Hernández     |");
        System.out.println("|___________________________________|");
        System.out.println("                                     ");
    }
    public static int f_total_product(){
        //this method return the number of total products
        Scanner keyboard =new Scanner(System.in);
        int total_product;
        do {
            System.out.println("Input the number of product(input values more than 1): ");
            total_product=keyboard.nextInt();
        }while(total_product<1);
        return total_product;
    }
    public static double f_value_product(int i){
        Scanner keyboard=new Scanner(System.in);
        double value_product;
        do {
            System.out.println("Input the value of product(" + i + ")(value must be greater than 1)");
            value_product = keyboard.nextInt();
        }while(value_product<1);
        if (value_product>1000){
            value_product=value_product*1.19;
        }
        return value_product;
    }

}
