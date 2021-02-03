package usta.sistemas;
import java.util.Scanner;
public class Main {

    public static void main(String[] args) {
// AUTHOR: Santiago Hernández Molina
        //DATE: 21-04-2020
        //DESCRIPTION:This software calculate the average salary total salary and highest salary
        f_menu();
        int N=f_number_employers();
        double highestSalary=0,totalSalary=0,averageSalary=0,salaryEmploye;
        for (int i=1;i<=N;i=i+1){
            salaryEmploye=f_salary(i);
            totalSalary=totalSalary+salaryEmploye;
            if (highestSalary<salaryEmploye){
                highestSalary=salaryEmploye;
            }

        }
        averageSalary=totalSalary/N;
        System.out.println("the total salary is: "+totalSalary+"the average salary is: "+averageSalary+"the highest salary is: "+highestSalary);

    }
    public static void f_menu() {
        //This method show thw menu of the software
        System.out.println(" ___________________________________");
        System.out.println("|  SoftSalary                       |");
        System.out.println("| Version 1.0 21-04-2020            |");
        System.out.println("| Created by Santiago Hernández     |");
        System.out.println("|___________________________________|");
        System.out.println("                                     ");
    }
    public  static  int f_number_employers(){
        //This method return the numbers of employers
        Scanner keyboard = new Scanner(System.in);
        int employes;
        do {
            System.out.println("input the total employers(input more than 1 employer)");
            employes = keyboard.nextInt();
        }while (employes<1);

        return employes;

    }
    public static double f_salary(int i){
        //This method return the salary of one employed
        Scanner keyboard=new Scanner(System.in);
        double sueldo,diasT,salary;
        do {
            System.out.println("input the wages(the value must be more than 0): ");
            sueldo=keyboard.nextDouble();

        }while (sueldo<1);
        do {
            System.out.println("input the days worked(the value must be between 1 and 30)");
            diasT=keyboard.nextDouble();
        }while(diasT<1||diasT>30);
      salary =(sueldo/30)*diasT;
        return salary;
    }
}
