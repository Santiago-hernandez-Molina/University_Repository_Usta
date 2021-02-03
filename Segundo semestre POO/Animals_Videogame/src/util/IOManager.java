package util;

import javax.swing.JOptionPane;

public class IOManager {

    //Show messages
    public static void showMessage(String message) {
        JOptionPane.showMessageDialog(null, message);
    }

    //Get int from GUI
    public static int getInt(String message) {
        return Integer.parseInt(JOptionPane.showInputDialog(null, message, JOptionPane.DEFAULT_OPTION));
    }

    //Get String from GUI
    public static String getString(String message) {
        return JOptionPane.showInputDialog(null, message, JOptionPane.DEFAULT_OPTION);
    }

    //Get Boolean from GUI
    public static Boolean getBoolean(String message) {
        return Boolean.valueOf(JOptionPane.showInputDialog(null, message, JOptionPane.DEFAULT_OPTION));
    }

    //Get Object from GUI
    public static Object getObjectFromArray(String title, String message, Object[] array) {
        return JOptionPane.showInputDialog(null, message, title, JOptionPane.QUESTION_MESSAGE, null, array, null);
    }

    //Get custom menu
    public static int showCustomMenu(String title, String menuInfo) {
        return Integer.parseInt(JOptionPane.showInputDialog(null, menuInfo, title, JOptionPane.QUESTION_MESSAGE));
    }
}