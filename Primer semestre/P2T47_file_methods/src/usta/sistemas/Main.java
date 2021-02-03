package usta.sistemas;

import java.io.File;


public class Main {

    public static void main(String[] args) {
        // write your code here
        f_menu();
        File myfile=new File("D:/pruebas Programacion/names.txt");
        //pra saber si el archivo existe devuelve un true o false
        System.out.println("file.exist(): "+myfile.exists());
        //para saber el directorio
        System.out.println("file is directory(): "+myfile.isDirectory());
        //para saber la ultima modificacion
        System.out.println("file lastModified(): "+myfile.lastModified());
        //
    }

    public static void f_menu() {

        System.out.println(" ___________________________________");
        System.out.println("|  SoftFileMethods                  |");
        System.out.println("| Version 1.0 03-06-2020            |");
        System.out.println("|___________________________________|");
        System.out.println("                                     ");
    }
}
