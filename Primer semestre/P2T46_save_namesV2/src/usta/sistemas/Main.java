package usta.sistemas;

import java.io.File;
import java.io.FileWriter;
import java.io.PrintWriter;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        //Name. Santiago Hernández Molina
        //Date: 2020 June 02
        //Description: This software saves, delete or rename new names i a text
        byte option = f_menu();

        while (option != 0) {
            if(option==1){

            }else if (option==2){
                f_DeleteNames();
            }else if(option==3){
                f_ShowNames();
            }
            option = f_menu();
        }
    }



    public static byte f_menu() {
        Scanner keyboard = new Scanner(System.in);
        try {


            System.out.println(" ___________________________________");
            System.out.println("|  SoftSaveNames                    |");
            System.out.println("| Version 2.0 02-06-2020            |");
            System.out.println("| Created by Santiago Hernández     |");
            System.out.println("|___________________________________|");
            System.out.println("                                     ");
            System.out.println("Select an option:" +
                    "\n1.Enter new Names" +
                    "\n2.Delete old names" +
                    "\n3.Visualize the archive" +
                    "\n0.Exit");

            byte option = keyboard.nextByte();

            while (option < 0 || option > 3) {
                System.err.println("ERROR, The input must be between 1 and 3, Retry:");
                option = keyboard.nextByte();
            }

            return option;
        } catch (Exception e) {
            System.err.println("ERROR, The method f_menu has an error because:");
            e.printStackTrace();
            return 0;
        }
    }

    public static void f_ShowNames() {
        try {
            Scanner myFile = new Scanner(new File("D:/pruebas Programacion/Names.txt"));

            System.out.println("The data of the archive Names.txt is:");

            while (myFile.hasNextLine()) {
                System.out.println(myFile.nextLine());
            }
        } catch (Exception e) {
            System.err.println("ERROR, The method f_ShowNames has an error because:");
            e.printStackTrace();
        }
    }

    public static void f_DeleteNames() {
        try {
            PrintWriter myFile = new PrintWriter("D:/pruebas Programacion/Names.txt", "UTF-8");

            myFile.println("");
            myFile.close();

            System.out.println("The data has deleted susessfully.");
        } catch (Exception e) {
            System.err.println("ERROR, The method f_DeleteNames has an error because:");
            e.printStackTrace();
        }
    }

    public static void f_AddNames() {
        try {
            File myfile = new File("D:/pruebas Programacion/Names.txt");
            if (myfile.exists()){
                FileWriter file= new FileWriter(myfile,true);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    public static String f_input_names(){
        Scanner keyboard= new Scanner(System.in);
        System.out.println("input the new name");
        String name=keyboard.nextLine();
        while(name.length()<5){
            System.err.println("ERR the name is very short(input a name greater than 5 characters");
            System.out.println("input again the name");
            name=keyboard.nextLine();
        }
        return name;
    }
}

