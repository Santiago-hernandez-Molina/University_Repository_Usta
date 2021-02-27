package view;

import Controller.GameController;
import util.Constants;
import util.IOManager;

import java.util.Arrays;


//Author:santiago Hernandez

public class MainView {

    private static GameController gc;

    public static void main(String[] args) {

       

        int menuOption;

        do{
            menuOption = IOManager.showCustomMenu(Constants.MAIN_MENU_TITLE, Constants.MAIN_MENU_INFO);

            //Main menu
            switch(menuOption){
                case 0:
                    break;

                case 1:
                    menuOption = GameModule();
                    break;

                default:
                    break;
            }

        }while(menuOption != 0);

    }

    //game module
    private static int GameModule(){
        int gameOption;
        do{
            gameOption = IOManager.showCustomMenu(Constants.Game_MENU_TITLE, Constants.Game_MENU_INFO);
            switch(gameOption){
              
                case 1:
                	
                    IOManager.showMessage(Arrays.toString(gc.list()));
            }
        }while(gameOption != 0);

        return -1;
    }



}