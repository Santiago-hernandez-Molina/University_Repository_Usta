package usta.sistemas;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        // Author:Santiago Hernandez Molina
        //Date:07/05/2020
        //this software show the votes of N candidates
        int N = f_menu();
        int[] votes = f_votes(N);
        f_show_winner(votes);
    }

    public static int f_menu() {
        //This method show the menu of the software adn return the number of candidates
        System.out.println(" ___________________________________");
        System.out.println("|  SoftReverseOrder                 |");
        System.out.println("| Version 1.0 07-05-2020            |");
        System.out.println("| Created by Santiago Hernández     |");
        System.out.println("|___________________________________|");
        System.out.println("                                     ");
        Scanner keyboard = new Scanner(System.in);
        int N;
        do {
            System.out.println("input the number of candidates(the number of candidates must be greater than 1)");
            N = keyboard.nextInt();
        } while (N < 2);
        return N;
    }

    public static int[] f_votes(int N) {
        int[] votes = new int[N];
        for (int i = 0; i < N; i++) {
            votes[i] = (int) Math.floor(Math.random() * (5000) + 1);

        }
        return votes;
    }

    public static void f_show_winner(int[] votes) {
        int winner = 0, second = 0, parcialW=0, parcialS=0,totalV=0;
        for (int i = 0; i < votes.length; i++) {
            if (votes[i]>winner){
                winner=votes[i];
                parcialW=(i+1);
            }else if (votes[i]>second){
                votes[i]=second;
                parcialS=(i+1);
            }
            totalV+=votes[i];
        }
        System.out.println("the winner is the candidate " + parcialW);
        System.out.println("the second place is the candidate " + parcialS);
        System.out.println("the total votes are "+totalV);

    }

}
