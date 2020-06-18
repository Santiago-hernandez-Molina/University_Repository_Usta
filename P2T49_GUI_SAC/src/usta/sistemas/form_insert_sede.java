package usta.sistemas;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class form_insert_sede extends JDialog {

    fondo Fondo = new fondo();

    public JTextField txt_code, txt_name, txt_sede,txt_direccion;

    public form_insert_sede() {

        setLayout(new BorderLayout());
        JPanel panel_supp = new JPanel();
        JLabel label_menu = new JLabel("Form Buildings", SwingConstants.CENTER);
        label_menu.setForeground(Color.white);/*This label show the
        title of the window*/
        label_menu.setFont(new Font("Comic Sans MS", Font.PLAIN, 20));
        panel_supp.add(label_menu);//This is the parameters of the label
        JPanel panel_central = new fondo();

        panel_central.setLayout(new GridLayout(8, 2));//this is the table that divide the spaces to input txt
        panel_central.add(new JLabel(""));
        panel_central.add(new JLabel(""));

        panel_central.add(new JLabel("codigo de el edificio : ",SwingConstants.CENTER)).setForeground(Color.white);
        panel_central.add(txt_code = new JTextField(""));
        panel_central.add(new JLabel(""));
        panel_central.add(new JLabel(""));

        panel_central.add(new JLabel("Nombre de el Edificio :  ",SwingConstants.CENTER)).setForeground(Color.white);
        panel_central.add(txt_name = new JTextField(""));

        panel_central.add(new JLabel(""));
        panel_central.add(new JLabel(""));

        panel_central.add(new JLabel("Sede : ",SwingConstants.CENTER)).setForeground(Color.white);
        panel_central.add(txt_sede = new JTextField(""));

        panel_central.add(new JLabel(""));
        panel_central.add(new JLabel(""));

        panel_central.add(new JLabel("Direccion  : ",SwingConstants.CENTER)).setForeground(Color.white);
        panel_central.add(txt_direccion = new JTextField(""));


        //panel_inferior
        JPanel panel_inf = new JPanel();
        JButton buttonI = new JButton("crear");
        buttonI.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {
                //Aqui va el codigo de el boton crear
                f_crear_nueva_sede(actionEvent);
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
        panel_supp.setBackground(Color.black);
        panel_inf.setBackground(Color.black);

    }
    public void f_crear_nueva_sede (java.awt.event.ActionEvent evt){
        //description: this method save the buildings descriptions
        final JDialog ventanaE = new JDialog(this,"saved data",true);
        if (txt_code.getText().length()<3) {
            ventanaE.add(new JLabel("el campo codigo debe tener minimo  3 caracteres"));
        }else if(txt_name.getText().length()<10) {
            ventanaE.add(new JLabel("el campo codigo debe tener minimo  10 caracteres"));
        }else if (txt_sede.getText().length()<5){
            ventanaE.add(new JLabel("el campo codigo debe tener minimo  5 caracteres"));
        }else{
            //grabamos en el archivo
            file_data_venues_sectionals file_data= new file_data_venues_sectionals();
            boolean rta =file_data_venues_sectionals.f_add_venue(txt_code.getText(),txt_name.getText(),txt_sede.getText(),txt_direccion.getText());
            if (rta==true){
                ventanaE.add(new JLabel("Datos guardados con exito"));
                txt_code.setText("");
                txt_name.setText("");
                txt_sede.setText("");
                txt_direccion.setText("");
            }else {
                ventanaE.add(new JLabel("no se pueden guardar los datos en el archivo D:/venues.txt"));

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
