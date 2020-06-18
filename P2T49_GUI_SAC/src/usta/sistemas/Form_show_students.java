package usta.sistemas;

import javax.swing.*;
import java.awt.*;

public class Form_show_students extends JDialog {
    //description: this class show all data of students.txt

    fondo Fondo = new fondo();

    public Form_show_students(java.awt.Frame parent) {


        super(parent, true);
        this.setContentPane(Fondo);
        setLayout(new BorderLayout());
        JPanel panel_sup = new JPanel();
        JLabel label_m = new JLabel("List of students",SwingConstants.CENTER);
        label_m.setFont(new Font("Comic Sans MS",0,20));
        panel_sup.add(label_m);
        String[]columnsNames = {"Name","lastName","faculty"};
        file_data_students file_data_students=new file_data_students();
        JTable tabla_de_datos=new JTable(file_data_students.f_show_data(),columnsNames);
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
