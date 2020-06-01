package usta.sistemas;


import java.util.Scanner;

public class Main {
    //Author: Santiago Hernández molina
    //Date: MAY 26 2020
    /*Description: This Software determinate the salaries of 12 employees and determinate the highest salary
    the Total salary and the average salary*/

    public static int[][] matrix; //This the matrix that need be fill with salaries
    public static int Most_greater_S; //This variable determinate the number of employee with the highest salary
    public static int TotalS = 0; //This variable determinate the sum of all salaries
    public static int Psalaray = 0; //This variable determinate the  Highest Winner
    public static int SalaryW = 0; //This variable determinate the partial highest salary
    public static int Average = 0;//This variable determinate the average


    public static void main(String[] args) {
        f_menu();
        f_fill_matrix();
        f_show_salary();
        f_show_MostGreater_s_and_Average();
    }

    public static void f_menu() {
        //This method print the menu of software and determinate the N employees
        System.out.println(" ___________________________________");
        System.out.println("|  SofSmartPeople.inc              |");
        System.out.println("| Version 2.0 26-05-2020            |");
        System.out.println("| Created by Santiago Hernández     |");
        System.out.println("|___________________________________|");
        System.out.println("                                     ");
        Scanner keyboard = new Scanner(System.in);
        System.out.println("Input the number of employees: ");
        int N = keyboard.nextInt();
        matrix = new int[N][12];
    }

    public static void f_fill_matrix() {
        //Description: this method fills the matrix with salaries
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < 12; j++) {
                matrix[i][j] = (int) Math.floor((Math.random() * ((980657 * 5) - 980657)) + 1);//random numbers between 980657*5 and 980657
                TotalS += matrix[i][j];
            }
        }
    }

    public static void f_show_salary() {
        //This method Show the matrix values
        for (int i = 0; i < matrix.length; i++) {
            System.out.println("  ");
            System.out.println("\n The salary of employee " + (i + 1) + " is");
            for (int j = 0; j < 12; j++) {
                System.out.print("$"+matrix[i][j]);
                System.out.print("| ");

            }
        }
    }

    public static void f_show_MostGreater_s_and_Average() {
        //This method determinate the highest salary, the average and show the total salary
        for (int i = 0; i < matrix.length; i++) {
            SalaryW = 0;
            for (int j = 0; j < matrix[0].length; j++) {
                SalaryW += matrix[i][j];
                if (SalaryW > Psalaray) {//This conditional determinate de highest salary
                    Most_greater_S = (i + 1);
                    Psalaray = SalaryW;
                }

            }
        }
        Average = (TotalS / matrix.length);
        System.out.println("\n ");
        System.out.println("The highest salary is of the employee number" + Most_greater_S + " with a total of $" + Psalaray);
        System.out.println("The total Salaries paid are: $" + TotalS);
        System.out.println("The average of Salaries paid per person  are: $" + Average);
    }

}
