package usta.sistemas;
// Author: Santiago Hernandez Molina
//Date:June 16 2020

import com.sun.istack.internal.NotNull;

import javax.swing.*;
import java.awt.*;

public class Form_acerca_de extends JFrame {

    fondo Fondo = new fondo();

    public Form_acerca_de(){
        setLayout(new BorderLayout());
        JPanel panel_supp = new JPanel();
        panel_supp.setBackground(Color.black);
        JLabel label_menu=new JLabel("Acerca de",SwingConstants.CENTER);
        label_menu.setForeground(Color.white);

        label_menu.setFont(new Font("Comic Sans MS",0,30));
        panel_supp.add(label_menu);
        JPanel panel_central = new fondo();
        JLabel label_maker = new JLabel("This software was maker by Santiago Hernandez");
        label_maker.setForeground(Color.white);
        panel_central.add(label_maker);
        JLabel label_maker2 = new JLabel("       Email: santiago.hernandez@usantoto.edu.co");
        label_maker2.setForeground(Color.white);
        panel_central.add(label_maker2);

        add(panel_central,BorderLayout.CENTER);
        add(panel_supp,BorderLayout.NORTH);
        //parametros del formulario

        setVisible(true);
        setResizable(false);
        setBounds(0,0,600,400);
        setLocationRelativeTo(null);


    }
    class fondo extends JPanel{
        private Image imagen;
        @Override
        public void paint(Graphics g){
            imagen = new ImageIcon(getClass().getResource("/imagenes/fondo.jpg")).getImage();
            g.drawImage(imagen,0,0,getWidth(),getHeight(),this);

            setOpaque(false);
            super.paint(g);
        }
    }

}
