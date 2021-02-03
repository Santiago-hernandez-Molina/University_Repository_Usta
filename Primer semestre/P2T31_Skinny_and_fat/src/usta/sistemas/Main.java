package usta.sistemas;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        // Author:Santiago Hernandez Molina
        //Date:07/05/2020
        //this software determinate who people is Skinny and fat
        int totalP = f_menu();
        double[] weight = f_weight(totalP);
        Skinny_and_fat(weight);
    }

    public static int f_menu() {
        //This method show thw menu of the software and return the total P
        System.out.println(" ___________________________________");
        System.out.println("|  SoftSkinnyAndFat                 |");
        System.out.println("| Version 1.0 07-05-2020            |");
        System.out.println("| Created by Santiago Hernández     |");
        System.out.println("|___________________________________|");
        System.out.println("                                     ");
        Scanner keyboard = new Scanner(System.in);
        int TotalP;
        do {
            System.out.println("input the total of people(The number must be greater than 0)");
            TotalP = keyboard.nextInt();

        } while (TotalP < 1);
        return TotalP;
    }

    public static double[] f_weight(int total) {
        //This method generate the weight of the persons
        double[] weight = new double[total];
        for (int i=0;i<total;i++) {
            weight[i] = (Math.random() * (120 - 20)) + 1;
        }
        return weight;
    }

    public static void Skinny_and_fat(double[] weight) {
        //This method show the people Skinny and fat people
        int i=0;
        for (double people : weight) {
            i +=1;
            if (people < 70) {
                System.out.println("the person ("+i+") with weight ("+people+") is Skinny");
            } else {
                System.out.println("the person ("+i+") with weight ("+people+ ") is fat");
            }
        }
    }
}