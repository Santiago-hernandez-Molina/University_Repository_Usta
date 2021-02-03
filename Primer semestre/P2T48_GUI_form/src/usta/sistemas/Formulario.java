package usta.sistemas;

import javax.swing.*;

public class Formulario extends JFrame {
    public Formulario() {
        JLabel label1 = new JLabel("este es el primer programa con GUI");
        label1.setBounds(5, 5, 300, 30);
        add(label1);
        JButton button1 = new JButton("Aceptar");
        button1.setBounds(150,180,100,40);
        add(button1);
        setLayout(null);
        setVisible(true);
        setBounds(0,0,400,400);
        setLocationRelativeTo(null);
        setDefaultCloseOperation(EXIT_ON_CLOSE);


    }
    public static void main(String[] args) {
        // write your code here
        Formulario Formulario=new Formulario();
    }
}
