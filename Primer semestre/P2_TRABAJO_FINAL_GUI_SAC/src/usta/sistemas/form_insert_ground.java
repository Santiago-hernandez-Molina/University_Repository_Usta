package usta.sistemas;
//Author: Guerrero Campos Diego
//DATE:JUNE 17 2020
//Description:This software simulate the SAC using GUI

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class form_insert_ground extends JDialog {

    public JTextField text_code, text_name, text_faculty,txt_topics;

    public form_insert_ground() {

        setLayout(new BorderLayout());
        JPanel panel_supp = new JPanel();
        JLabel label_menu = new JLabel("Form Buildings", SwingConstants.CENTER);

        label_menu.setFont(new Font("Cooper Black", Font.PLAIN, 20));
        panel_supp.add(label_menu);
        JPanel panel_central = new JPanel();

        panel_central.setLayout(new GridLayout(8, 2));
        panel_central.add(new JLabel(""));
        panel_central.add(new JLabel(""));

        panel_central.add(new JLabel("code of Cultural space : ",SwingConstants.CENTER));
        panel_central.add(text_code = new JTextField(""));
        panel_central.add(new JLabel(""));
        panel_central.add(new JLabel(""));

        panel_central.add(new JLabel("Name of cultural space :  ",SwingConstants.CENTER));
        panel_central.add(text_name = new JTextField(""));

        panel_central.add(new JLabel(""));
        panel_central.add(new JLabel(""));

        panel_central.add(new JLabel("faculty of cultural space : ",SwingConstants.CENTER));
        panel_central.add(text_faculty = new JTextField(""));

        panel_central.add(new JLabel(""));
        panel_central.add(new JLabel(""));

        panel_central.add(new JLabel("topics of cultural space : ",SwingConstants.CENTER));
        panel_central.add(txt_topics = new JTextField(""));


        //panel_inferior
        JPanel panel_bot = new JPanel();
        JButton buttonCrear = new JButton("crear");
        buttonCrear.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {

                f_crear_nueva_sede(actionEvent);
            }
        });

        buttonCrear.setBounds(0, 0, 100, 50);
        panel_bot.add(buttonCrear);


        add(panel_supp, BorderLayout.NORTH);
        add(panel_central, BorderLayout.CENTER);
        add(panel_bot, BorderLayout.SOUTH);


        setVisible(true);
        setResizable(false);
        setBounds(0, 0, 600, 400);
        setLocationRelativeTo(null);


    }
    public void f_crear_nueva_sede (java.awt.event.ActionEvent evt){
        //description: this method save the buildings descriptions
        final JDialog ventanaE = new JDialog(this,"saved data",true);
        if (text_code.getText().length()<3) {
            ventanaE.add(new JLabel("the area 1 must have more than 3 characters"));
        }else if(text_name.getText().length()<10) {
            ventanaE.add(new JLabel("the area 2 must have more than 10 characters"));
        }else if (text_faculty.getText().length()<8){
            ventanaE.add(new JLabel("the area 3 must have more than 8 characters"));
        }else if (txt_topics.getText().length()<20){
            ventanaE.add(new JLabel("the area 4 must have more than 20 characters"));
        }else{
            //grabamos en el archivo
            file_data_ground file_data_ground= new file_data_ground();
            boolean rta = file_data_ground.f_add_space(text_code.getText(),text_name.getText(),text_faculty.getText(),txt_topics.getText());
            if (rta==true){
                ventanaE.add(new JLabel("Datos saved correctly"));
                text_code.setText("");
                text_name.setText("");
                text_faculty.setText("");
                txt_topics.setText("");
            }else {
                ventanaE.add(new JLabel("the data can not save in d:/ground.txt"));

            }
        }
        ventanaE.pack();
        ventanaE.setVisible(true);
    }

}
