package usta.sistemas;
// Author: Santiago Hernandez Molina
//Date:June 16 2020

import javax.swing.*;
import java.awt.*;

public class Form_show_data_venue extends JDialog {
    //description: this class show all data of venue.txt

    public Form_show_data_venue(java.awt.Frame parent) {
        super(parent, true);
        setLayout(new BorderLayout());
        JPanel panel_sup = new JPanel();
        JLabel label_m = new JLabel("List of building",SwingConstants.CENTER);
        label_m.setFont(new Font("Comic Sans MS",0,20));
        panel_sup.add(label_m);
        String[]columnsNames = {"codigo","nombre","ciudad","direccion"};
        file_data_venues_sectionals file_data_venue=new file_data_venues_sectionals();
        JTable tabla_de_datos=new JTable(file_data_venues_sectionals.f_show_data(),columnsNames);
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
