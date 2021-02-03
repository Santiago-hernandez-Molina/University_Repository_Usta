package usta.sistemas;

import java.io.BufferedReader;
import java.io.PrintWriter;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        // Author: Santiago Hernandez Molina
        //Date: June 06 2020
        //Description: This software create a file type txt and read it
            try {
                Scanner keyboard = new Scanner(System.in);
                System.out.println("Input your name ");
                String name = keyboard.nextLine();
                System.out.println("Input your Biography");
                String Biography = keyboard.nextLine();
                System.out.println("input your email");
                String email = keyboard.nextLine();
                System.out.println("input your number Phone ");
                String Phone = keyboard.nextLine();
                boolean saved=savedData(name,Biography,email,Phone);
                if (saved==true){
                    System.out.println("your info saved into D:/pruebas Programacion");
                }else {
                    System.out.println("!");
                }

            } catch (Exception e) {
                System.err.println("the software failed because");
                e.printStackTrace();
            }


    }

    public static boolean savedData(String name, String biography, String email, String phone) {
        boolean err;
            try {
                PrintWriter myFile =new PrintWriter("D:/pruebas Programacion/userdata.txt","UTF-8");
                myFile.println("Name: "+name);
                myFile.println("Biography : "+biography);
                myFile.println("Email: "+email);
                myFile.println("Phone: "+phone);
                myFile.close();
                err=true;
            } catch (Exception e) {
                e.printStackTrace();
                err=false;
            }
        return err;
    }
}