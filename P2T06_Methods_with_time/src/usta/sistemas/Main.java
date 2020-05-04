package usta.sistemas;
import java.util.Scanner;
public class Main {

    public static void main(String[] args) {
        //AUTHOR: Santiago Hernandez Molina
        //DATE: 15/04/2020
        //Description:

        f_menu();
        int option = f_option();
        if (option==1){
            f_covert_hours_to_second();
        }else if (option==2){
            f_covert_minutes_to_second();
        }else{
            f_convert_seconds_to_hours_and_minutes();
        }
    }
    public static void f_menu() {
        //This method show thw menu of the software
        System.out.println(" ___________________________________");
        System.out.println("||  SoftConvertTime                ||");
        System.out.println("|| Version 1.0 14-04-2020          ||");
        System.out.println("|| Created by Santiago Hernández   ||");
        System.out.println("||_________________________________||");
        System.out.println("                                     ");



    }
    public static int f_option(){
        //This method return the option
        System.out.println("input the option to covert: \n1.hours to second\n2.minutes to second\n3.seconds to hour and minutes");
        Scanner keyboard =new Scanner(System.in);
        int option = keyboard.nextInt();

        while (option<1|option>3){//if option is less than 1 or greater than 3
            System.err.println("ERROR the option doesn't exist");
            System.out.println("input the option to covert: \n1.hours to second\n2.minutes to second\n3.seconds to hour and minutes");
            option = keyboard.nextInt();

        }
        return option;

    }
    public static void f_covert_hours_to_second(){
        Scanner keyboard = new Scanner(System.in);
        System.out.println("input the hours to convert: ");
        double hours = keyboard.nextDouble();
        double seconds = hours*60*60;
        System.out.println(hours+" hours have: "+seconds+" seconds");
    }
    public static void f_covert_minutes_to_second(){
        Scanner keyboard = new Scanner(System.in);
        System.out.println("input the hours to convert: ");
        int minutes = keyboard.nextInt();
        int seconds = minutes*60;
        System.out.println(minutes+" minutes have: "+seconds+" seconds");
    }
    public static void f_convert_seconds_to_hours_and_minutes(){
        //Description: Convert seconds to hours and minutes.
        Scanner keyboard= new Scanner(System.in);
        System.out.println("Input the numbers seconds to convert:");
        int seconds= keyboard.nextInt();
        int minutes=seconds/60,hours=seconds/3600;
        System.out.println(seconds+" seconds are: "+hours+" hours and "+minutes+" minutes");
    }



}
