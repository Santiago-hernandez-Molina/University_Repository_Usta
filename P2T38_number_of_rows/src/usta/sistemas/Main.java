package usta.sistemas;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        // Author: Santiago Hernandez Molina
        //Date: 2020 MAY 19
        //Description:This software
        Scanner keyboard = new Scanner(System.in);
        int number_rows = f_menu_total_rows();
        int columns = f_total_columns();
        int[][] matrix_number = new int[number_rows][columns];//The matrix is empty
        matrix_number = f_fill_matrix(matrix_number);
        int sum = 0;
        double average;
        while (number_rows >= 0 | number_rows < matrix_number.length) {
            for (int i = 0; i < number_rows; i++) {
                System.out.println("\n");
                for (int j = 0; j < matrix_number[0].length; j++) {
                    System.out.print(sum += matrix_number[i][j]);
                    System.out.print(" | ");
                }
            }
            average = sum / matrix_number[0].length;
            System.out.println("\nby number row is " + number_rows + " the sum is " + sum + " the average is " + average);
            System.out.println("input the other number of the row: ");
            number_rows = keyboard.nextInt();
        }
        System.out.println("------Thanks------");

    }

    public static int f_menu_total_rows() {
        Scanner keyboard = new Scanner(System.in);

        System.out.println(" ___________________________________");
        System.out.println("|  SoftNumbersRows                  |");
        System.out.println("| Version 1.0 19-05-2020            |");
        System.out.println("| Created by Santiago Hernández     |");
        System.out.println("|___________________________________|");
        System.out.println("                                     ");
        System.out.println("input the total rows");
        int totalR = keyboard.nextInt();
        while (totalR <= 0) {
            System.err.println("ERR: the number must be greater than 0");
            System.out.println("input the number again");
            totalR = keyboard.nextInt();
        }
        return totalR;
    }

    public static int f_total_columns() {
        //This method return the total columns of your matrix
        Scanner keyboard = new Scanner(System.in);
        System.out.println("input the total columns: ");
        int totalC = keyboard.nextInt();
        while (totalC <= 0) {
            System.err.println("ERR: the number must be greater than 0");
            System.out.println("input the number again");
            totalC = keyboard.nextInt();
        }
        return totalC;

    }

    public static int[][] f_fill_matrix(int[][] matrix_numbers) {
        //This method fill the matrix
        for (int i = 0; i < matrix_numbers.length; i++) {//for walk the rows
            for (int j = 0; j < matrix_numbers[0].length; j++) {
                matrix_numbers[i][j] = (int) Math.floor((Math.random() * 1000) + 1);

            }
        }
        return matrix_numbers;
    }
}