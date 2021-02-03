package usta.sistemas;
// Author: Santiago Hernandez Molina
//Date:June 16 2020

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Form_Students extends JDialog {
    public JTextField txt_name, txt_lastNme, txt_faculty;

    public Form_Students() {
        setLayout(new BorderLayout());
        JPanel panel_supp = new JPanel();
        panel_supp.setBackground(Color.black);
        JLabel label_menu = new JLabel("Form Students", SwingConstants.CENTER);
        label_menu.setForeground(Color.white);
        label_menu.setFont(new Font("Comic Sans MS", Font.PLAIN, 20));
        panel_supp.add(label_menu);
        JPanel panel_central = new fondo();

        panel_central.setLayout(new GridLayout(8, 2));//this panel create a table for add students
        panel_central.add(new JLabel(""));
        panel_central.add(new JLabel(""));

        panel_central.add(new JLabel("Name: ",SwingConstants.CENTER)).setForeground(Color.white);
        panel_central.add(txt_name = new JTextField(""));//This JTextField allow input txt

        panel_central.add(new JLabel(""));
        panel_central.add(new JLabel(""));

        panel_central.add(new JLabel("LastName",SwingConstants.CENTER)).setForeground(Color.white);
        panel_central.add(txt_lastNme = new JTextField(""));//This JTextField allow input txt

        panel_central.add(new JLabel(""));
        panel_central.add(new JLabel(""));

        panel_central.add(new JLabel("Faculty",SwingConstants.CENTER)).setForeground(Color.white);
        panel_central.add(txt_faculty = new JTextField(""));//This JTextField allow input txt

        panel_central.add(new JLabel(""));
        panel_central.add(new JLabel(""));

        //panel_inferior
        JPanel panel_inf = new JPanel();
        panel_inf.setBackground(Color.black);
        JButton buttonI = new JButton("crear");//This button save the data in a document
        buttonI.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {
                //Aqui va el codigo de el boton crear
                f_crear_nuevo_estudiante(actionEvent);


            }
        });

        buttonI.setBounds(0, 0, 100, 50);
        panel_inf.add(buttonI);


        add(panel_supp, BorderLayout.NORTH);
        add(panel_central, BorderLayout.CENTER);
        add(panel_inf, BorderLayout.SOUTH);

        //parametros de el formulario
        setVisible(true);
        setResizable(false);
        setBounds(0, 0, 600, 400);
        setLocationRelativeTo(null);
        setBackground(Color.green);

    }
    public void f_crear_nuevo_estudiante (java.awt.event.ActionEvent evt){
        //description: this method
        final JDialog ventanaE = new JDialog(this,"saved data",true);
        if (txt_name.getText().length()<3 ||txt_lastNme.getText().length()<3||txt_faculty.getText().length()<3){
            ventanaE.add(new JLabel("todos los campos deben tener minimo 3 caracteres"));
        }else{
            //grabamos en el archivo
            file_data_students file_data_students= new file_data_students();
            boolean rta =file_data_students.f_add_students(txt_name.getText(),txt_lastNme.getText(),txt_faculty.getText());
            if (rta==true){
                ventanaE.add(new JLabel("Datos guardados con exito"));
                txt_name.setText("");
                txt_lastNme.setText("");
                txt_faculty.setText("");
            }else {
                ventanaE.add(new JLabel("no se pueden guardar los datos en el archivo D:/students.txt"));

            }
        }
        ventanaE.pack();
        ventanaE.setVisible(true);
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
