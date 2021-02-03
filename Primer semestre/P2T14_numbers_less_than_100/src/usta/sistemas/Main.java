package usta.sistemas;
import java.util.Scanner;
public class Main {

    public static void main(String[] args) {
        // AUTHOR: Santiago Hernández Molina
        //DATE: 21-04-2020
        //DESCRIPTION: this software show the numbers less than 100
        f_menu();
        Scanner keyboard = new Scanner(System.in);
        int total_number=1;
        double summatory=0,average=0,number;
        System.out.println("input a number");
        number = keyboard.nextInt();
        while (number>100){
            summatory+=number;
            total_number+=1;
            System.out.println("input a number");
            number = keyboard.nextInt();
        }
        if (total_number!=0){
            average=summatory/total_number;
        }
        System.out.println("the total numbers are: "+total_number+" the average is: "+average+" the summatory is: "+summatory);

    }
    public static void f_menu(){
        //This method show thw menu of the software
        System.out.println(" ___________________________________");
        System.out.println("|  SoftSummatory                    |");
        System.out.println("| Version 1.0 21-04-2020            |");
        System.out.println("| Created by Santiago Hernández     |");
        System.out.println("|___________________________________|");
        System.out.println("                                     ");
    }
}
