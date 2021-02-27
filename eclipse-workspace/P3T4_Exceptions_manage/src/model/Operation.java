package model;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Operation {
    static Scanner keyboard = new Scanner(System.in);


    public double operation(int option) {


        double result = 0;


        try {

            System.out.println("ingrese el primer valor");
            double numA = keyboard.nextDouble();
            System.out.println("ingrese el segundo valor");
            double numB = keyboard.nextDouble();

            switch (option) {
                case 1:
                    result = numA + numB;
                    break;
                case 2:
                    result = numA - numB;
                    break;
                case 3:
                    result = numA * numB;
                    break;
                case 4:
                    while (numB == 0) {
                        System.err.println("NO DIVIDA ENTRE CERO!!!!!");
                        System.out.println("ingrese el primer valor");
                        numA = keyboard.nextDouble();
                        System.out.println("ingrese el segundo valor");
                        numB = keyboard.nextDouble();
                    }
                    result = numA / numB;
                    break;

            }

        } catch (InputMismatchException ex) {
            System.err.println("ingrese valores enteros");
            keyboard.nextLine();

        }


        return result;

    }


}
