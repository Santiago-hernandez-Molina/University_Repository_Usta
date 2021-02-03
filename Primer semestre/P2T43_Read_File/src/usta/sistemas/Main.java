package usta.sistemas;

import java.io.File;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        //Author: Santiago Hernandez Molina
        //Date: June 01 2020
        //Description: this program show the information of a file
        try {
            Scanner myfile = new Scanner(new File("D:/pruebas Programacion/pruebaLectura01.txt"));
            while (myfile.hasNextLine()) {
                System.out.println(myfile.nextLine());
            }
            myfile.close();
        } catch (Exception e) {
            System.err.println("----------The software has finished with err------------");
            e.printStackTrace();
        }
    }
}
