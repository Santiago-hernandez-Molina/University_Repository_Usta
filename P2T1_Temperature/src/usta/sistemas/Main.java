package usta.sistemas;
import java.util.Scanner;
public class Main {

    public static void main(String[] args) {
	// AUTHOR: Santiago Hernández Molina
        //DATE: 13-04-2020
        //DESCRIPTION: Program that use different methods to convert the temperature
        int kind_from, kind_to;
        f_menu();
        kind_from=f_kind_from_grades();
        if (kind_from!=0){
            kind_to=f_kind_to_grades(kind_from);
            if (kind_to!=0){
                f_convert(kind_from,kind_to);
            }
        }
    }
    public static void f_menu(){
        //This method show thw menu of the software
        System.out.println(" ___________________________________");
        System.out.println("|  SoftConvert                      |");
        System.out.println("| Version 1.0 13-04-2020            |");
        System.out.println("| Created by Santiago Hernández     |");
        System.out.println("|___________________________________|");
        System.out.println("                                     ");
        System.out.println("input the kind of option grades: \n1.Celsius \n2.Fahrenheit \n3.kelvin");

    }

    public static int f_kind_from_grades(){
        //Description: This method return from the kind of grades
        Scanner keyboard = new Scanner(System.in);
        int opt=keyboard.nextInt();
        if (opt==1 || opt==2 || opt==3){
            System.out.println("Started");
        }else{
            System.err.println("ERR:FINISH THE SOFTWARE, THE REASON IS THE CLASS DOES NOT EXIST");
            opt=0;
        }
        return opt;
    }
    public static int f_kind_to_grades(int kind_from){
        //Description: This method return to kinds grades
        System.out.println("Input of the kind do you want convert the grades:\n1-celsius\n2-fahrenheit\n3-kelvin:");
        Scanner keyboard = new Scanner(System.in);
        int opt=keyboard.nextInt();
        if (opt==1 || opt==2 || opt==3){
            if (opt==kind_from){
                System.err.println("ERR: THE CLASS ARE SAME");
                opt=0;
            }
        }else{
            System.err.println("ERR:FINISH THE SOFTWARE, THE REASON IS THE CLASS DOES NOT EXIST");
            opt=0;
        }
        return opt;
    }
    public static void f_convert(int kind_from, int kind_to) {
        //Description: This method kind grades
        System.out.println("Input the grades:");
        Scanner keyboard = new Scanner(System.in);
        int grades = keyboard.nextInt();
        double grades_convert;
        if (kind_from == 1 && kind_to == 2) {  // convert celsius to fahrenheit °F = °C x 1.8 + 32.
            grades_convert = grades * 1.8 + 32;
            System.out.println("The celsius:" + grades + " is same grades fahrenheit:" + grades_convert);
        } else if (kind_from == 1 && kind_to == 3) { // convert celsius to kelvin K = °C + 273.15
            grades_convert = grades + 273.15;
            System.out.println("The celsius:" + grades + " is same grades kelvin:" + grades_convert);
        } else if (kind_from == 2 && kind_to == 2) { // convert fahrenheit to celsius °C = (°F-32) ÷ 1.8
            grades_convert = (grades - 32) / 1.8;
            System.out.println("The fahrenheit:" + grades + " is same grades celsius:" + grades_convert);
        } else if (kind_from == 2 && kind_to == 3) { // convert fahrenheit to kelvin °K = ((°F-32) ÷ 1.8)+ 273.15
            grades_convert = ((grades - 32) / 1.8) + 273.15;
            System.out.println("The fahrenheit:" + grades + " is same grades kelvin:" + grades_convert);
        } else if (kind_from == 3 && kind_to == 1) { // convert kelvin to celsius °C = °K - 273.15
            grades_convert = grades - 273.15;
            System.out.println("The kelvin:" + grades + " is same grades celsius:" + grades_convert);
        } else if (kind_from == 3 && kind_to == 2) { // convert kelvin to fahrenheit °F = (°K - 273.15)*1.8+32
            grades_convert = (grades - 273.15) * 1.8 + 32;
            System.out.println("The kelvin:" + grades + " is same grades fahrenheit:" + grades_convert);
        }

    }

}
