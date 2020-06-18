package usta.sistemas;
// Author: Santiago Hernandez Molina
//Date:June 16 2020

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.ImageIcon;
import javax.swing.JPanel;

public class Form_Principal extends JFrame {

    fondo Fondo = new fondo();//this is the object that allow insert image

    public Form_Principal() {

        this.setContentPane(Fondo);//this line put the image background


        setLayout(new BorderLayout());
        setTitle("SAC Java version 1.0");
        setLayout(new BorderLayout());

        //This panel show the tittle of the window
        JPanel panel_sup = new JPanel();
        panel_sup.setBackground(Color.black);
        JLabel label_menu = new JLabel("Principal menu", SwingConstants.CENTER);
        label_menu.setFont(new Font("Comic Sans MS", 0, 30));
        label_menu.setForeground(Color.white);
        panel_sup.add(label_menu);

        //panel izq donde van a estar los botones
        JPanel panel_izq = new fondo();
        panel_izq.setLayout(new GridLayout(4, 3));

        //creamos el primer boton
        panel_izq.add(new JLabel(""));
        panel_izq.add(new JLabel(""));
        panel_izq.add(new JLabel(""));
        JButton formButton1 = new JButton("New Student");
        formButton1.setBounds(0, 0, 200, 30);
        formButton1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                //Aqui va el codigo de el boton formButton1
                Form_Students form_students = new Form_Students();

            }
        });
        panel_izq.add(formButton1);//añadimos el primer botón

        //creamos el segundo boton
        panel_izq.add(new JLabel(""));
        JButton formButton2 = new JButton("List all Students");
        formButton2.setBounds(0, 0, 200, 30);
        formButton2.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {
                //Aqui va el codigo de el boton formButton2
                f_open_Form(actionEvent);
            }
        });
        panel_izq.add(formButton2);

        //creamos el 3er boton
        panel_izq.add(new JLabel(""));
        JButton infoButton = new JButton("Acerca de");
        infoButton.setBounds(0, 0, 200, 30);
        infoButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                //Aqui va el codigo de el boton infoButton
                Form_acerca_de form_acerca_de = new Form_acerca_de();

            }
        });
        panel_izq.add(infoButton);


        //creamos el 4to boton
        panel_izq.add(new JLabel(""));
        JButton buttonCS = new JButton("ingresar edificio");
        buttonCS.setBounds(0, 0, 200, 30);
        buttonCS.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {
                //Aqui va el codigo de el boton buttonCS
                form_insert_sede insert_sede = new form_insert_sede();
            }
        });
        panel_izq.add(buttonCS);


        //creamos el quinto boton
        panel_izq.add(new JLabel(""));
        JButton buttonShowS = new JButton("Mostrar edificio");
        buttonShowS.setBounds(0, 0, 200, 30);
        buttonShowS.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {
                //Aqui va el codigo de el boton buttonShowS
                f_open_Form2(actionEvent);


            }
        });
        panel_izq.add(buttonShowS);

        JPanel panel_inf = new JPanel();
        panel_inf.add(new Label("creado por Santiago Hernandez"));
        JPanel panel_der = new JPanel();
        add(panel_sup, BorderLayout.NORTH);
        add(panel_izq, BorderLayout.CENTER);
        add(panel_inf, BorderLayout.SOUTH);


        setVisible(true);
        setResizable(false);
        setBounds(0, 0, 600, 400);
        setLocationRelativeTo(null);
        panel_inf.setBackground(Color.black);

    }

    private void f_open_Form(java.awt.event.ActionEvent evt) {
        Form_show_students form_show_students1 = new Form_show_students(this);
    }

    private void f_open_Form2(java.awt.event.ActionEvent evt) {
        Form_show_data_venue form_show_venue1 = new Form_show_data_venue(this);
    }

    class fondo extends JPanel {//This class import the image to the code
        private Image imagen;

        @Override
        public void paint(Graphics g) {
            imagen = new ImageIcon(getClass().getResource("/imagenes/fondo.jpg")).getImage();
            g.drawImage(imagen, 0, 0, getWidth(), getHeight(), this);

            setOpaque(false);//This code is for visualize the text
            super.paint(g);
        }
    }
}
