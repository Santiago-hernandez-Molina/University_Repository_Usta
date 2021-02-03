package usta.sistemas;

//Author: Guerrero Campos Diego
//DATE:JUNE 17 2020
//Description:This software simulate the SAC using GUI

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JPanel;

public class form_principal extends JFrame {

    public form_principal() {

        setLayout(new BorderLayout());
        setTitle("SAC Java version 1.0");
        setLayout(new BorderLayout());


        JPanel panel_superior = new JPanel();
        JLabel label_menu = new JLabel("Principal menu", SwingConstants.CENTER);
        label_menu.setFont(new Font("Cooper Black", 0, 30));
        panel_superior.add(label_menu);
        /*
        the panel located the tittle on the top of the GUI
         */

        JPanel panel_left = new JPanel();
        panel_left.setLayout(new GridLayout(7, 1));//this panel create a grid to locate the buttons

        /*
        create the first button
         */

        panel_left.add(new JLabel(""));

        JButton formButton1 = new JButton("New Student");
        formButton1.setBounds(0, 0, 200, 30);
        formButton1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                form_insert_students form_students = new form_insert_students();
            }
        });
        panel_left.add(formButton1);


        JButton formButton2 = new JButton("List all Students");
        formButton2.setBounds(0, 0, 200, 30);
        formButton2.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {
                f_open_Form(actionEvent);
            }
        });
        panel_left.add(formButton2);


        JButton infoButton = new JButton("About");
        infoButton.setBounds(0, 0, 200, 30);
        infoButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                Form_acerca_de form_acerca_de = new Form_acerca_de();

            }
        });
        panel_left.add(infoButton);


        JButton buttoninsertGround = new JButton("input cultural space");
        buttoninsertGround.setBounds(0, 0, 200, 30);
        buttoninsertGround.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {
                form_insert_ground insert_playground = new form_insert_ground();
            }
        });
        panel_left.add(buttoninsertGround);


        JButton buttonShowGround = new JButton("Show cultural space");
        buttonShowGround.setBounds(0, 0, 200, 30);
        buttonShowGround.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {
                f_open_Form2(actionEvent);


            }
        });
        panel_left.add(buttonShowGround);
        panel_left.add(new JLabel(""));

        JPanel panel_bot = new JPanel();
        panel_bot .add(new Label("made by Diego Guerrero"));
        add(panel_superior, BorderLayout.NORTH);
        add(panel_left, BorderLayout.CENTER);
        add(panel_bot, BorderLayout.SOUTH);


        setVisible(true);
        setResizable(false);
        setBounds(0, 0, 600, 400);
        setLocationRelativeTo(null);

    }

    private void f_open_Form(java.awt.event.ActionEvent evt) {
        Form_show_students form_show_students1 = new Form_show_students(this);
    }

    private void f_open_Form2(java.awt.event.ActionEvent evt) {
        Form_show_data_buildings form_show_venue1 = new Form_show_data_buildings(this);
    }

}

