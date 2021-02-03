package usta.sistemas;

public class Main {

    public static void main(String[] args) {
        // Author:Santiago Hernandez Molina
        //Date:04/05/2020
        //this software saves two vector
        f_menu();
        int[] turn_morning = f_salary_turn();
        int[] turn_afternoon = f_salary_turn();
        int salary_morning = f_show_morning(turn_morning);
        int salary_afternoon = f_show_afternoon(turn_afternoon);
        System.out.println("The total salary is: " + (salary_afternoon + salary_morning));

    }

    public static void f_menu() {
        //This method show thw menu of the software
        System.out.println(" ___________________________________");
        System.out.println("|  SoftTwoVectors                   |");
        System.out.println("| Version 1.0 04-05-2020            |");
        System.out.println("| Created by Santiago Hernández     |");
        System.out.println("|___________________________________|");
        System.out.println("                                     ");
    }

    public static int[] f_salary_turn() {
        //This method return the salary of eight employees
        int[] salary = new int[8];
        for (int i = 0; i < 8; i++) {
            salary[i] = (int) Math.floor(Math.random() * (2000000 - 980657 + 1) + 980657);
        }
        return salary;
    }

    public static int f_show_morning(int[] turn_morning) {
        //This method show the salary of turn morning
        System.out.println("-------------turn of morning------------");
        int total_salary = 0;
        for (int i = 0; i < 8; i++) {
            total_salary += turn_morning[i];
            System.out.println("the salary of employed (" + (i + 1) + ") is :" + turn_morning[i]);


        }
        System.out.println("The total salary by turn morning is  " + total_salary);
        return total_salary;
    }

    public static int f_show_afternoon(int[] turn_afternoon) {
        //This method show the salary of turn morning
        System.out.println("-------------turn of afternoon------------");
        int total_salary = 0;
        for (int i = 0; i < 8; i++) {
            total_salary += turn_afternoon[i];
            System.out.println("the salary of employed (" + (i + 1) + ") is :" + turn_afternoon[i]);


        }
        System.out.println("The total salary by turn afternoon is  " + total_salary);
        return total_salary;
    }
}
