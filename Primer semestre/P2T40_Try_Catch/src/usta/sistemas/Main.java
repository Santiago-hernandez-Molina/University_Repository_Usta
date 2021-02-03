package usta.sistemas;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        // write your code here

        boolean repeater=false;
        do {
            try {
                Scanner keyboard = new Scanner(System.in);
                System.out.println("input the number ");
                int N=keyboard.nextInt();
                repeater=true;
            } catch (Exception e) {
                System.err.println("Err the software accept only number ");
            }
        }while(repeater==false);
    }
}
