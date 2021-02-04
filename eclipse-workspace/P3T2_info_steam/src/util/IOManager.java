package util;

import javax.swing.JOptionPane;

public class IOManager {

    //Show messages
    public static void showMessage(String message) {
        JOptionPane.showMessageDialog(null, message);
    }

    //Get custom menu
    public static int showCustomMenu(String title, String menuInfo) {
        return Integer.parseInt(JOptionPane.showInputDialog(null, menuInfo, title, JOptionPane.QUESTION_MESSAGE));
    }
}