package usta.sistemas;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        // Author: Santiago Hernandez Molina
        //Date: 2020 MAY 13
        //Description:This software determinate the rating of a cafeteria
        f_menu();
        int i = total_student();
        int[][] rates = f_fill_rates(i);
        f_show_rating(rates);

    }

    public static void f_menu() {
        System.out.println(" ___________________________________");
        System.out.println("|  SoftRatingFood                 |");
        System.out.println("| Version 1.0 07-05-2020            |");
        System.out.println("| Created by Santiago Hernández     |");
        System.out.println("|___________________________________|");
        System.out.println("                                     ");
    }

    public static int total_student() {
        Scanner keyboard = new Scanner(System.in);
        int Students;
        do {
            System.out.println("input the total of student(The value must be greater than 0)");
            Students = keyboard.nextInt();
        } while (Students < 1);
        return Students;
    }

    public static int[][] f_fill_rates(int Students) {
        int[][] rates_matrix = new int[Students][20];
        for (int i = 0; i <Students; i++) {
            for (int r = 0; r < 20; r++) {
                rates_matrix[i][r] = (int) Math.floor((Math.random()*10) + 1);
            }
        }
        return rates_matrix;
    }

    public static void f_show_rating(int[][] matrix) {
        int TotalN = 0,TotalE=0;
        for (int[] ints : matrix) {
            for (int r = 0; r < 20; r++) {
                if (ints[r] <= 3) {
                    TotalN++;
                }
                if (ints[r]>7){
                    TotalE++;
                }
            }

        }
        int percent = (TotalN * 100) / (matrix.length * 20),percentE=(TotalE * 100) / (matrix.length * 20);
        System.out.println("the  negatives rates are "+TotalN+" the percentage is "+percent+"%");
        System.out.println("the regular rates are "+((matrix.length*20)-TotalN-TotalE)+" the percentage regular  is "+(100-percent)+"%");
        System.out.println("the excellent rates are "+TotalE+" the percentage is "+percentE+"%");
    }
}
