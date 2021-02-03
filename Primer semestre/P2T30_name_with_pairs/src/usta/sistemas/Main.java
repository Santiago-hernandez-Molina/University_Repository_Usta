package usta.sistemas;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        // Author:Santiago Hernandez Molina
        //Date:06 /05/2020
        //Description: this software show how many numbers are even and odd
        int[] t = f_fill_vector(f_menu());
        f_show_even_numbers(t);
    }

    public static int f_menu() {
        //This method show the menu of the software and return the total numbers
        System.out.println(" ___________________________________");
        System.out.println("|  SoftNumbersOddEven               |");
        System.out.println("| Version 1.0 06-05-2020            |");
        System.out.println("| Created by Santiago Hernández     |");
        System.out.println("|___________________________________|");
        System.out.println("                                     ");
        Scanner keyboard = new Scanner(System.in);
        int totalP;
        do {
            System.out.println("input the total numbers(the numbers must be greater than 0)");
            totalP = keyboard.nextInt();
        } while (totalP < 1);
        return totalP;
    }

    public static int[] f_fill_vector(int totalN) {
        //this method return a vector with vectors
        int[] numbers = new int[totalN];
        for (int i = 0; i < totalN; i++) {
            numbers[i] = (int) Math.floor((Math.random() * (1000 - 100)) + 1);
        }
        return numbers;
    }

    public static void f_show_even_numbers(int[] vector_number) {
        //Description: This method show the even number
        int total_even = 0, totalOdd = 0, total = 0;
        for (int number : vector_number) {
            total++;
            if ((number % 2) == 0) {
                total_even++;
                System.out.println("the number " + number + " is even");
            } else {
                totalOdd++;
                System.out.println("the number " + number + " is odd");
            }
        }
        System.out.println("the total of odd numbers is : " + totalOdd);
        System.out.println("the total of even numbers is : " + total_even);
        System.out.println("the total numbers are: " + total);
    }
}
