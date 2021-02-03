package usta.sistemas;
//Author: Guerrero Campos Diego
//DATE:JUNE 17 2020
//Description:This software simulate the SAC using GUI

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.util.Scanner;

public class file_data_ground {

    public static boolean f_add_space(String p_code, String p_name, String p_faculty, String p_topic) {

        boolean result;
        try {
            File myFile = new File("D:/ground.txt");
            if (myFile.exists()) {

                FileWriter myFile2 = new FileWriter(myFile, true);

                BufferedWriter dataMyFile = new BufferedWriter(myFile2);
                dataMyFile.write("\n" + p_code + "|" + p_name + "|" + p_faculty + "|" + p_topic);
                dataMyFile.close();
                myFile2.close();
                result = true;

            } else {
                result = false;
            }
            return result;
        } catch (Exception e) {
            e.printStackTrace();
            return false;
        }
    }

    public static String[][] f_show_data() {

        String[][] matrix;
        String linea_de_txt, linea_tmp;
        int row = 0, total_lines = 0, separador1, separador2, separador3;


        try {
            File myFile = new File("D:/ground.txt");
            if (myFile.exists()) {
                Scanner myFile2 = new Scanner(myFile);
                while (myFile2.hasNextLine()) {
                    total_lines++;
                    myFile2.nextLine();
                }
                myFile2.close();

                matrix = new String[total_lines][4];
                myFile2 = new Scanner(myFile);

                while (myFile2.hasNextLine()) {
                    linea_de_txt = myFile2.nextLine();
                    separador1 = linea_de_txt.indexOf("|");

                    if (separador1 != -1) {
                        matrix[row][0] = linea_de_txt.substring(0, separador1);
                        linea_tmp = linea_de_txt.substring(separador1 + 1);
                        separador2 = linea_tmp.indexOf("|");
                        matrix[row][1] = linea_tmp.substring(0, separador2);
                        linea_tmp = linea_tmp.substring(separador2 + 1);
                        separador3 = linea_tmp.indexOf("|");
                        matrix[row][2] = linea_tmp.substring(0, separador3);
                        matrix[row][3] = linea_tmp.substring(separador3 + 1);
                        row++;
                    }
                }

                myFile2.close();
                return matrix;

            } else {
                return null;
            }
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }
}


