package usta.sistemas;

public class Main {

    public static int matrix[][] = new int[123][8];
    public static int[] total_votes = new int[8];
    public static String[] vectorParties = new String[]{"Partido Liberal", "Partido verde", "Partido de la U", "Centro Democratico", "MIRA", "Polo", "Partido Conservador", "partido maiz"};
    public static int Winner_column = 0;
    public static int Loser_column = 0;
    public static int Winner_votes = 0;
    public static int Loser_votes = 0;
    public static String winner, loser;


    public static void main(String[] args) {
        // Author: Santiago Hernandez Molina
        //Date:21 05 2020
        //Description:Perform the simulation of a voting process for the Boyacá goverment

        f_menu();
        f_fill_matrix();
        f_total_votes();
        f_show_winner_and_seconds();
    }


    public static void f_menu() {
        System.out.println(" ___________________________________");
        System.out.println("|  SoftDemocracy                    |");
        System.out.println("| Version 1.0 21-05-2020            |");
        System.out.println("| Created by Santiago Hernández     |");
        System.out.println("|___________________________________|");
        System.out.println("                                     ");

    }

    public static void f_fill_matrix() {
        //Description: this method fills the matrix with votes
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[0].length; j++) {
                matrix[i][j] = (int) Math.floor((Math.random() * 1000) + 1);//random numbers between 1 and 1000
            }
        }
    }

    public static void f_total_votes() {
        //Description: this method
        for (int i = 0; i < matrix[0].length; i++)
            for (int j = 0; j < total_votes.length; j++) {
                total_votes[i] += matrix[i][j];
            }

    }

    public static void f_show_winner_and_seconds() {
        //Description: this method walks the vector total_votes
        for (int i = 0; i < total_votes.length; i++) {
            System.out.println("politic party " + vectorParties[i] + "; total votes " + total_votes[i]);
        }
        Winner_votes = total_votes[0];

        System.out.println("-----------");
        for (int i = 1; i < total_votes.length; i++) {
            if (Winner_votes < total_votes[i]) {
                Winner_votes = total_votes[i];
                winner = vectorParties[i];
                Winner_column = i;

            }
        }
        //----second place
        for (int i = 0; i < total_votes.length; i++) {
            if (Winner_column != i) {
                if (Loser_votes < total_votes[i]) {
                    Loser_votes = total_votes[i];
                    Loser_column = i;
                    loser = vectorParties[i];

                }
            }
        }
        System.out.println("the winner is: " + winner);
        System.out.println("the second place is: " + loser);
    }
}
