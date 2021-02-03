package usta.sistemas;

import java.io.PrintWriter;

public class Main {

    public static void main(String[] args) {
        //Author: Santiago Hernández molina
        //Date: MAY 28 2020
        //Description: Create text file
        try {//perfect the action

            PrintWriter adminFiles=new PrintWriter("D:/prueba.txt");
            adminFiles.println("First Line");
            adminFiles.println("Second Line");
            adminFiles.close();

        } catch (Exception e) {
            System.err.println("The software crash because");//Show the err of the user
            e.printStackTrace();

        }

    }
}
