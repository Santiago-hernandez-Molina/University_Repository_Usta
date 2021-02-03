package usta.sistemas;

import java.io.PrintWriter;
import java.util.Scanner;

public class Main {
    //Author: Santiago Hernández Molina
    //Date: June 02 2020
    //description: ask to the user to enter N amount of names of people and these names are saved ina file called
    //names.txt the names must be saved one on each line (each name must have a minimum of 5 letters
    public static int totalN;
    private static Scanner keyboard = new Scanner(System.in);
    public static String[] vector_names;

    public static void main(String[] args) {
        f_menu();
        f_fill_vector();
        f_save_file();


    }

    public static void f_menu() {
        try {
            System.out.println(" ___________________________________");
            System.out.println("|  SoftSaveNames                    |");
            System.out.println("| Version 1.0 02-06-2020            |");
            System.out.println("| Created by Santiago Hernández     |");
            System.out.println("|___________________________________|");
            System.out.println("                                     ");
            System.out.println("input the total names ");
            totalN = keyboard.nextInt();
            while (totalN < 1) {
                System.out.println("sorry the total names should be greater than zero, please input again the value");
                totalN = keyboard.nextInt();
            }
            vector_names = new String[totalN];
        } catch (Exception e) {
            System.err.println("ERR: the software failed because: ");
            e.printStackTrace();
        }
    }

    public static void f_fill_vector() {
        //This method fill the vectors with Strings
        for (int i = 0; i < vector_names.length; i++) {
            vector_names[i]=f_input_String(i);
        }
    }

    public static String f_input_String(int i) {
        //description: This method return the name
        try {
            String name;
            do {
                System.out.println("Input the name for person (" + (i + 1) + ")");
                name = keyboard.nextLine();

            }while (name.length() < 5);
            return name;
        } catch (Exception e) {
            System.err.println("ERR: the software is finished because:");
            e.printStackTrace();
            return "";
        }
    }
    public static void f_save_file(){
        //This method to walks the vector and save the data into a file
        try{
            PrintWriter myfile = new PrintWriter("D:/pruebas Programacion/names.txt","UTF-8");
            for(String i_name:vector_names){
                myfile.println(i_name);
            }
            myfile.close();
            System.out.println("the data with names was saved in D:/pruebas Programacion");
        } catch (Exception e) {
            e.printStackTrace();
            System.err.println("the data don't saved");
        }

    }
}