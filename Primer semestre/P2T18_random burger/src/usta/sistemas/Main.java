package usta.sistemas;
import java.util.Scanner;
import java.util.Random;
public class Main {

    public static void main(String[] args) {
        // Author:Santiago Hernandez Molina
        //Date:23/04/2020
        //Description: This software Generate a number between 1 and 100
        f_menu();
        int randomN=f_random_number();
        int input;
        int attemps=1;
        do {
            System.out.println("failed: the number is incorrect");
            attemps=attemps+1;
            input=f_answer();
        }while (randomN!=input&&attemps<=3);
        if (attemps>3){
            System.out.println("sorry don't won't the hamburger the number was:"+randomN);
        }else{
            System.out.println("congratulations you won one hamburger");
        }
    }
    public static void f_menu(){
        //This method show thw menu of the software
        System.out.println(" ___________________________________");
        System.out.println("|  SoftRandomBurger                 |");
        System.out.println("| Version 1.0 21-04-2020            |");
        System.out.println("| Created by Santiago Hernández     |");
        System.out.println("|___________________________________|");
        System.out.println("                                     ");
    }
    public static int f_random_number(){
        //This method return a number random
        int randomN=(int)Math.floor(Math.random()*100+1);
        if (randomN<50){
            System.out.println("Hint1: the number minor than 50");
        }else {
            System.out.println("the number is between 50 and 100");
        }
        if (randomN % 2 ==0){
            System.out.println("the number is pair");
        }else {
            System.out.println("the number is odd");
        }
        return  randomN;
    }
    public static int f_answer(){
        //This method return the answer of the user
        Scanner keyboard=new Scanner(System.in);
        int input;
        do {
            System.out.println("input the number follow the hints(the number is between 1 and 100)");
            input=keyboard.nextInt();
        }while (input<1||input>100);
        return  input;
    }



}
