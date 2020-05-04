package usta.sistemas;
import java.util.Scanner;
public class Main {

    public static void main(String[] args) {
        //Author: Santiago hernández Molina
        //Date: 22/04/2020
        //Description: a housewife needs to make the market of the month
        f_menu();
        Scanner keyboard = new Scanner(System.in);
        double summatory=0,costProduct;
        int totalProduct=0;
        do {
            totalProduct+=1;
            System.out.println("input the price of product "+totalProduct+" :");
            costProduct=keyboard.nextDouble();
            summatory+=costProduct;
            System.out.println("the temporal bill is: "+summatory);
        }while (summatory<500000);
        summatory-=costProduct;
        totalProduct-=1;
        System.out.println(" \n"+"The total of product: "+totalProduct+"\nThe total of bill: "+summatory);
    }
    public static void f_menu() {
        //This method show thw menu of the software
        System.out.println(" ___________________________________");
        System.out.println("|  SoftMakeMarket                   |");
        System.out.println("| Version 1.0 22-04-2020            |");
        System.out.println("| Created by Santiago Hernández     |");
        System.out.println("|___________________________________|");
        System.out.println("                                     ");
    }
}
