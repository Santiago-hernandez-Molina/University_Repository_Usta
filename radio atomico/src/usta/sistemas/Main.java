package usta.sistemas;
import java.util.Scanner;
public class Main {

    public static void main(String[] args) {
	// Author:Santiago Hernandez Molina
        //Date:23/04/2020
        int opt;
        double r,v,pm,d;

        f_menu();
        opt = f_sc();
        if (opt==1){
            pm=f_pm();
            d=f_d();
            v=(2*pm)/((d)*1/(6.022*Math.pow(10,23)));
            System.out.println("el volumen es: "+v);
            r=f_r(v,2);
            System.out.println("el radio atomico es: "+r);
        }else if (opt==2){
            pm=f_pm();
            d=f_d();
            v=(4*pm)/((d)*1/(6.022*Math.pow(10,23)));
            System.out.println("el volumen es: "+v);
            r=f_r(v,2.83);
            System.out.println("el radio atomico es: "+r);
        }else if (opt==3){
            pm=f_pm();
            d=f_d();
            v=(2*pm)/((d)*1/(6.022*Math.pow(10,23)));
            System.out.println("el volumen es: "+v);
            r=f_r(v,2.31);
            System.out.println("el radio atomico es: "+r);
        }else{
            System.err.println("ERROR");
        }


    }
    public static void f_menu(){
        //This method show thw menu of the software
        System.out.println(" ___________________________________");
        System.out.println("|  SoftRadioAt                      |");
        System.out.println("| Version 1.0 21-04-2020            |");
        System.out.println("| Created by Santiago Hernández     |");
        System.out.println("|___________________________________|");
        System.out.println("                                     ");


    }

    public static int f_sc(){
        Scanner keyboard = new Scanner(System.in);
        int Sc;
        System.out.println("indique en que sistema cristaliza el elemento");
        System.out.println("1:Cs 2:fcc 3:bcc");
        Sc=keyboard.nextInt();
        return Sc;

    }
    public static double f_pm(){
        Scanner keyboard= new Scanner(System.in);
        double pm;
        System.out.println("indique el peso molecular");
        pm=keyboard.nextDouble();

        return pm;
    }
    public static double f_d(){
        Scanner keyboard= new Scanner(System.in);
        double d;
        System.out.println("indique la densidad");
        d=keyboard.nextDouble();
        return d;
    }
    public static double f_r (double a,double b){
        double c=(Math.cbrt(a))/b;
        return c;
    }
}
