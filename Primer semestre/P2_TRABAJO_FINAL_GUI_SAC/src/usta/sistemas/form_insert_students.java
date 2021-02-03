package usta.sistemas;
//Author: Guerrero Campos Diego
//DATE:JUNE 17 2020
//Description:This software simulate the SAC using GUI

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class form_insert_students extends JDialog {
    public JTextField text_name, text_lastName, text_faculty;

    public form_insert_students() {

        setLayout(new BorderLayout());
        JPanel panel_supp = new JPanel();
        JLabel label_menu = new JLabel("Form Students", SwingConstants.CENTER);
        label_menu.setFont(new Font("Cooper Black", Font.PLAIN, 20));
        panel_supp.add(label_menu);
        JPanel panel_central = new JPanel();

        panel_central.setLayout(new GridLayout(8, 2));
        panel_central.add(new JLabel(""));
        panel_central.add(new JLabel(""));

        panel_central.add(new JLabel("Name: "));
        panel_central.add(text_name = new JTextField(""));//This JTextField allow input txt

        panel_central.add(new JLabel(""));
        panel_central.add(new JLabel(""));

        panel_central.add(new JLabel("LastName"));
        panel_central.add(text_lastName = new JTextField(""));//This JTextField allow input txt

        panel_central.add(new JLabel(""));
        panel_central.add(new JLabel(""));

        panel_central.add(new JLabel("Faculty"));
        panel_central.add(text_faculty = new JTextField(""));//This JTextField allow input txt

        panel_central.add(new JLabel(""));
        panel_central.add(new JLabel(""));


        JPanel panel_bot = new JPanel();
        JButton buttoncrear = new JButton("crear");//This button save the data in a document
        buttoncrear.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {

                f_crear_nuevo_estudiante(actionEvent);

            }
        });

        buttoncrear.setBounds(0, 0, 100, 50);
        panel_bot.add(buttoncrear);


        add(panel_supp, BorderLayout.NORTH);
        add(panel_central, BorderLayout.CENTER);
        add(panel_bot, BorderLayout.SOUTH);


        setVisible(true);
        setResizable(false);
        setBounds(0, 0, 600, 400);
        setLocationRelativeTo(null);

    }
    public void f_crear_nuevo_estudiante (java.awt.event.ActionEvent evt){

        final JDialog ventanaE = new JDialog(this,"saved data",true);
        if (text_name.getText().length()<3 ||text_lastName.getText().length()<3||text_faculty.getText().length()<3){
            ventanaE.add(new JLabel("the areas must be contain more than 3 characters"));
        }else{

            file_data_students file_data_students= new file_data_students();
            boolean rta =file_data_students.f_add_students(text_name.getText(),text_lastName.getText(),text_faculty.getText());
            if (rta==true){
                ventanaE.add(new JLabel("Datos saved correctly"));
                text_name.setText("");
                text_lastName.setText("");
                text_faculty.setText("");
            }else {
                ventanaE.add(new JLabel("the data can not save in D:/students.txt"));

            }
        }
        ventanaE.pack();
        ventanaE.setVisible(true);
    }
}