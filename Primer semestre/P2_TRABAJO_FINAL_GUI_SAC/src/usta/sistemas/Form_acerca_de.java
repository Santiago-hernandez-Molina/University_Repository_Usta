package usta.sistemas;
//Author: Guerrero Campos Diego
//DATE:JUNE 17 2020
//Description:This software simulate the SAC using GUI

import com.sun.istack.internal.NotNull;

import javax.swing.*;
import java.awt.*;

public class Form_acerca_de extends JFrame {


    public Form_acerca_de() {
        setLayout(new BorderLayout());
        JPanel panel_supp = new JPanel();

        JLabel label_menu = new JLabel("Acerca de", SwingConstants.CENTER);


        label_menu.setFont(new Font("Cooper Black", 0, 30));
        panel_supp.add(label_menu);
        JPanel panel_central = new JPanel();
        JLabel label_maker = new JLabel("This software was maker by Diego Guerrero ");
        panel_central.add(label_maker);
        JLabel label_maker2 = new JLabel("I am student of Santo tomas University");
        panel_central.add(label_maker2);
        JLabel label_maker3 = new JLabel("number +57 313 3913841");
        panel_central.add(label_maker3);

        add(panel_central, BorderLayout.CENTER);
        add(panel_supp, BorderLayout.NORTH);


        setVisible(true);
        setResizable(false);
        setBounds(0, 0, 600, 400);
        setLocationRelativeTo(null);


    }

}
