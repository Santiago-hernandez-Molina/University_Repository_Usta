package usta.sistemas;
//Author: Guerrero Campos Diego
//DATE:JUNE 17 2020
//Description:This software simulate the SAC using GUI

import javax.swing.*;
import java.awt.*;

public class Form_show_students extends JDialog {


    public Form_show_students(java.awt.Frame parent) {


        super(parent, true);
        setLayout(new BorderLayout());
        JPanel panel_sup = new JPanel();
        JLabel label_m = new JLabel("List of students",SwingConstants.CENTER);
        label_m.setFont(new Font("Cooper Black",0,20));
        panel_sup.add(label_m);
        String[]columnsNames = {"Name","lastName","faculty"};
        file_data_students file_data_students=new file_data_students();
        JTable tabla_de_datos=new JTable(file_data_students.f_show_data(),columnsNames);
        tabla_de_datos.setBounds(10,50,590,300);
        JScrollPane panelC= new JScrollPane(tabla_de_datos);
        add(panel_sup,BorderLayout.NORTH);
        add(panelC,BorderLayout.CENTER);
        setSize(600,400);

        setVisible(true);
        setResizable(false);
        setLocationRelativeTo(null);
        pack();

    }
}