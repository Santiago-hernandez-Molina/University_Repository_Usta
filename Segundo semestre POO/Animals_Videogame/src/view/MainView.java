package view;

import Controller.BirdController;
import util.Constants;
import util.IOManager;

import java.util.Arrays;


//Author:santiago Hernandez
public class MainView {

    private static BirdController bc;

    public static void main(String[] args) {

        bc = new BirdController();

        int menuOption;

        do{
            menuOption = IOManager.showCustomMenu(Constants.MAIN_MENU_TITLE, Constants.MAIN_MENU_INFO);

            //Main menu
            switch(menuOption){
                case 0:
                    break;

                case 1:
                    menuOption = birdModule();
                    break;

                default:
                    break;
            }

        }while(menuOption != 0);

    }

    //bird module
    private static int birdModule(){
        int birdOption;
        do{
            birdOption = IOManager.showCustomMenu(Constants.Bird_MENU_TITLE, Constants.Bird_MENU_INFO);
            switch(birdOption){
                case 1:
                    bc.save(IOManager.getInt("Ingresa el ID"),
                            IOManager.getString("Ingresa el nombre"),
                            IOManager.getBoolean("Es hostil?"),
                            IOManager.getInt("cuanto daño tiene?"),
                            IOManager.getInt("cuanta vida tiene?"),
                            IOManager.getInt("Cuanto Pesa?"),
                            IOManager.getInt("Indique la velocidad"),
                            IOManager.getBoolean("vuela")

                    );

                    break;

                case 2:
                    IOManager.showMessage(Arrays.toString(bc.list()));
            }
        }while(birdOption != 0);

        return -1;
    }



}