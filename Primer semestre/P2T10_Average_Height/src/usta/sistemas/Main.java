package usta.sistemas;
import java.util.Scanner;
public class Main {

    public static void main(String[] args) {
	//AUTHOR:Santiago Hernandez Molina
        //DATE: 20/04/2020
        //DESCRIPTION:This software calculate the average height of a group of N children

        f_menu();
        int totalChildren=f_total_children();
        double sumatory=0,average;
        for (int i=1;i<=totalChildren;i=i+1){

            sumatory=sumatory+f_height_of_child(i);

        }
        average=sumatory/totalChildren;
        System.out.println("The total children is: "+totalChildren+"\nThe average height is: "+average);
    }
    public static void f_menu() {
        //This method show thw menu of the software
        System.out.println(" ___________________________________");
        System.out.println("||  SoftAverageHeight              ||");
        System.out.println("|| Version 1.0 14-04-2020          ||");
        System.out.println("|| Created by Santiago Hernández   ||");
        System.out.println("||_________________________________||");
        System.out.println("                                     ");
    }
    public static int f_total_children(){
        Scanner keyboard=new Scanner(System.in);
        System.out.println("Input the total children to calculate height");
        int totalChildren=keyboard.nextInt();
        while (totalChildren<1){
            System.err.println("ERROR,input more than one children");
            System.out.println("Input again the total children to calculate height");
            totalChildren=keyboard.nextInt();

        }

        return totalChildren;
    }
    public static double f_height_of_child(int i){
        //This method return the height of a children

        Scanner keyboard=new Scanner(System.in);
        System.out.println("Input the height of child("+i+")");
        double height = keyboard.nextDouble();
        while (height<0.2||height>2.00){
            System.err.println("ERROR,the values should be between 0.2 and 2 mts");
            System.out.println("Input again the height of child(mts):");
            height=keyboard.nextDouble();


        }
        return height;

    }

}

