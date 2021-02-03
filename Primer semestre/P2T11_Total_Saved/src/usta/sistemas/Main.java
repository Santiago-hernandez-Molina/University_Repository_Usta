package usta.sistemas;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        // AUTHOR: Santiago Hernández Molina
        //DATE: 21-04-2020
        //DESCRIPTION:This software determinate the total saved per person

        Scanner keyboard=new Scanner(System.in);
        f_menu();
        int N = f_total_months();
        int total_saved=0,average_saved=0,money_saved;

        for (int i=1;i<=N;i=i+1) {
            do {
                System.out.println("input the money of the month "+i);
                money_saved = keyboard.nextInt();

            } while (money_saved<0);
            total_saved=total_saved+money_saved;
        }
        average_saved=total_saved/N;
        System.out.println("the total money saved is: "+total_saved+" the average saved is: "+average_saved );


    }
    public static void f_menu(){
        //This method show thw menu of the software
        System.out.println(" ___________________________________");
        System.out.println("|  SoftTotalSaved                   |");
        System.out.println("| Version 1.0 21-04-2020            |");
        System.out.println("| Created by Santiago Hernández     |");
        System.out.println("|___________________________________|");
        System.out.println("                                     ");

    }

    public static int f_total_months(){
        //Description: This method return the total months
        Scanner keyboard = new Scanner(System.in);
        int N_months;

        do{
            System.out.println("input the total moths(the value must be greater than zero): ");
            N_months=keyboard.nextInt();
        }while(N_months<1);
        return N_months;
    }
}
