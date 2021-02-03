package usta.sistemas;
//Author: Guerrero Campos Diego
//DATE:JUNE 17 2020
//Description:This software simulate the SAC using GUI

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class form_menu extends JFrame {

    public form_menu() {

        JLabel label_menu = new JLabel("SAC java version", SwingConstants.CENTER);
        label_menu.setBounds(150, 20, 350, 100);
        label_menu.setFont(new Font( "Cooper Black",0,30));
        add(label_menu);
        //this label show the tittle and configure it parameters



        JLabel label_maker = new JLabel("made by Diego Guerrero ");
        label_maker.setBounds(30, 300, 350, 100);
        add(label_maker);
        //this label show the creator and configure it parameters


        JButton botonStart = new JButton("Start");
        botonStart.setBounds(200, 180, 200, 50);
        botonStart.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                //This is the command of the button
                form_principal form_principal= new form_principal();
            }
        });
        add(botonStart);
        //This button initialize the principal menu

        //form Properties
        setLayout(null);
        setVisible(true);
        setBounds(0,0,600,440);
        setLocationRelativeTo(null);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setResizable(false);

    }

}
