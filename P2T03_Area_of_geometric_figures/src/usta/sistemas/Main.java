package usta.sistemas;
import java.util.Scanner;
public class Main {

    public static void main(String[] args) {
	//AUTHOR: Santiago Hernandez Molina
        //DATE: 14/04/2020
        //Description: This software calculate de area of geometric figures
        Scanner keyboard =new Scanner(System.in);
        f_menu();
        int option=0;

        System.out.println("this software calculate the area of a geometric figures, Choose an option\n1.circle\n2.square\n3.triangle");
        option =keyboard.nextInt();
        if (option==1){
            f_area_circle();
        }else if (option==2){
            f_area_square();
        }else if (option==3){
            f_area_triangle();
        }else{
            System.err.println("this option doesn't exist please choose the option of the menu");
        }

    }

    public static void f_menu(){
        //This method show thw menu of the software

        System.out.println(" ___________________________________");
        System.out.println("|  SoftConvert                      |");
        System.out.println("| Version 1.0 14-04-2020            |");
        System.out.println("| Created by Santiago Hernández     |");
        System.out.println("|___________________________________|");
        System.out.println("                                     ");

    }
    public static void f_area_circle(){
        Scanner keyboard =new Scanner(System.in);
        System.out.println("the area of the circle is necessary the radius please input it (cm)");
        double radius = keyboard.nextDouble();
        double area= 3.1416*(radius*radius);
        System.out.println("the area of the circle is: "+area+"cm");
    }
    public static void f_area_square(){
        Scanner keyboard =new Scanner(System.in);
        System.out.println("to calculate the area of a square input it side(cm)");
        double side = keyboard.nextDouble();
        double area =side*side;
        System.out.println("the area of the square is: "+area+"cm");
    }
    public static void f_area_triangle(){

        Scanner keyboard =new Scanner(System.in);
        System.out.println("to calculate the area of a triangle input it height(cm)");
        double height= keyboard.nextDouble();
        System.out.println("input the base of the triangle(cm)");
        double base = keyboard.nextDouble();
        double area =(base*height)/2;
        System.out.println("the area of the triangle is: "+area+"cm");

    }


}
