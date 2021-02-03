package usta.sistemas;
// Author: Santiago Hernandez Molina
//Date:June 16 2020

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Form_Menu_java extends JFrame {

    fondo Fondo= new fondo();

    public Form_Menu_java() {
        //etiqueta del nombre del software

        this.setContentPane(Fondo);

        JLabel label_menu = new JLabel("SAC version java", SwingConstants.CENTER);
        label_menu.setForeground(Color.white);
        label_menu.setBounds(150, 20, 350, 100);
        label_menu.setFont(new Font( "Comic Sans MS",0,34));
        add(label_menu);
        //etiqueta de quien lo creo
        JLabel label_maker = new JLabel("Creado por Santiago Hernandez ", SwingConstants.CENTER);
        label_maker.setBounds(120, 200, 350, 100);
        label_maker.setForeground(Color.white);
        add(label_maker);
        JButton botonI = new JButton("Iniciar");
        botonI.setBounds(200, 180, 200, 50);
        botonI.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                //va el codigo que el boton va a hacer
                Form_Principal form_principal= new Form_Principal();
            }
        });
        add(botonI);
        //propiedades del formulario
        setLayout(null);
        setVisible(true);
        setBounds(0,0,600,440);
        setLocationRelativeTo(null);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setResizable(false);

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
