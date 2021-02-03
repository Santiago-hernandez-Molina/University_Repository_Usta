package usta.sistemas;

        import java.io.BufferedWriter;
        import java.io.File;
        import java.io.FileWriter;
        import java.util.Scanner;

public class file_data_students {

    /*
    Author: Santiago Hernandez Molina
    DATE: 16 June 2020
     Description: this Class save the info of the students
    */
    public boolean f_add_students(String p_name, String p_lastName, String p_faculty) {
        //This method create new line into a file Students.txt
        boolean result;
        try {
            File myFile = new File("D:/students.txt");
            if (myFile.exists()) {
                //instanciamos el archivo con true para agregar nuevas lineas
                FileWriter myFile2 = new FileWriter(myFile, true);
                //Cargar la dat de el archivo en memoria
                BufferedWriter dataMyFile = new BufferedWriter(myFile2);
                dataMyFile.write("\n" + p_name + "|" + p_lastName + "|" + p_faculty);
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
        //This method return all data of file students.txt
        String[][] matrix_e;
        String linea_de_txt, linea_tmp;
        int row = 0, total_lines = 0, separador1, separador2;
        try {
            File myFile = new File("d:/students.txt");
            if (myFile.exists()) {
                Scanner myFile2 = new Scanner(myFile);
                while (myFile2.hasNextLine()) {
                    total_lines++;
                    myFile2.nextLine();
                }
                myFile2.close();
                myFile2=null;
                matrix_e=new String[total_lines][3];
                myFile2 = new Scanner(myFile);
                while (myFile2.hasNextLine()){//while the document has line of txt myFile2 read the document
                    linea_de_txt=myFile2.nextLine();
                    separador1=linea_de_txt.indexOf("|");
                    if (separador1!=-1) {
                        matrix_e[row][0] = linea_de_txt.substring(0, separador1);
                        linea_tmp = linea_de_txt.substring(separador1 + 1);
                        separador2 = linea_tmp.indexOf("|");
                        matrix_e[row][1] = linea_tmp.substring(0, separador2);
                        matrix_e[row][2] = linea_tmp.substring(separador2 + 1);
                        row++;
                    }
                }
                myFile2.close();
                return matrix_e;
            }else {
                return null;
            }
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }
}
