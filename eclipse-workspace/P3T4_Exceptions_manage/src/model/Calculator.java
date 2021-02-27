package model;
/*
 *Author: Santiago Hernandez Molina
 * Date:16/02/2021
 * Description: This software simulate a calculator in a console
 */

import java.io.*;
import java.util.Arrays;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Calculator {

    public static void main(String[] args) {
        double[] saveInVector;
        boolean saveInTxt;
        Calculator calculator = new Calculator();
        saveInVector = calculator.saveResultVector();
        saveInTxt = calculator.saveInTxt(saveInVector);
        if (!saveInTxt) {
            System.out.println("No se pudo guardar en el archivo de texto, verifique su existencia en D:/operations");
        }

    }

    public int menu() {
        //This method Show a menu and return the option value
        Scanner keyboard = new Scanner(System.in);
        int opt;


        System.out.println("Bienvenido a la calculadora");
        System.out.println("ingresa una opcion para continuar: \n"
                + "1. Hacer una suma.\n"
                + "2. Hacer una resta.\n"
                + "3. Hacer una multiplicacion.\n"
                + "4. Hacer una division\n"
                + "5. salir ");
        opt = keyboard.nextInt();


        return opt;
    }

    public double[] saveResultVector() {
        //This method save the result of the operations in a vector a return the vector

        Scanner keyboard = new Scanner(System.in);
        int space = 0;
        double[] results = new double[3];
        int opt = 0;

        try {
            do {
                try {

                    Calculator calculator = new Calculator(); //called the calculator class to use this methods
                    Operation operation = new Operation(); //called the Operation class to find the results to save
                    opt = calculator.menu();
                    if (opt!=5) {
                        double result = operation.operation(opt); //assign the result of the operation to the variable

                        System.out.println("el resultado es: " + result + "\n"
                                + "Desea guardarlo?(1 para si,2 para no)");

                        int opt2 = keyboard.nextInt();//this option is for the user decide if wants to save the result
                        if (opt2 == 1) {

                            results[space] = result;
                            space++;

                        }
                    }

                } catch (InputMismatchException e) {
                    System.err.println("ingrese valores enteros, no se pudo guardar el dato \n" +
                            "ingrese cualquier tecla para continuar.");
                    keyboard.nextLine();
                }
                System.out.println("resultados " + Arrays.toString(results));

            } while (opt != 5);
        } catch (ArrayIndexOutOfBoundsException e) {
            System.err.println("el vector esta lleno, el programa terminara (No se guardo el ultimo resultado)");
        }

        return results;

    }

    public boolean saveInTxt(double[] vector) {
        boolean result;
        try {
            File myFile = new File("D:/operations.txt");
            if (myFile.exists()) {

                FileWriter myFile2 = new FileWriter(myFile, true);

                BufferedWriter dataMyFile = new BufferedWriter(myFile2);

                dataMyFile.write("\n" + Arrays.toString(vector) + "|");

                dataMyFile.close();
                myFile2.close();
                result = true;
            } else {
                result = false;
            }
            return result;
        } catch (IOException e) {
            e.printStackTrace();
            return false;
        }
    }


}
