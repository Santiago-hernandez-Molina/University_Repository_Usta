
package Test;

/*
Author: Santiago Hernandez Molina
Date:16/10/2020
 */

import Controller.BirdController;
import Controller.InsectController;

import java.util.Arrays;


public class ControllerTest {

    public static void main(String[] args) {
        System.out.println("Bird:");
        BirdController bc = new BirdController();

        //Insertando el dato
        bc.save(0, "aguila", true, 70, 5, 30, 15,
                true);
        System.out.println(Arrays.toString(bc.list()));

        //Actualizando el dato
        bc.update(0, "aguila", true, 30, 10, 30, 15,
                true);
        System.out.println(Arrays.toString(bc.list()));

        //Eliminando el dato
        bc.delete(0);
        System.out.println(Arrays.toString(bc.list()));

        System.out.println("Insect:");
        InsectController ic = new InsectController();

        //Insertando el dato
        ic.save(0, "El bicho", true, 2, 50, 2, 5,
                true);
        System.out.println(Arrays.toString(ic.list()));

        //Actualizando el dato
        bc.update(0, "El bicho", false, 5, 0, 2, 5,
                true);
        System.out.println(Arrays.toString(ic.list()));

        //Eliminando el dato
        ic.delete(0);
        System.out.println(Arrays.toString(ic.list()));




    }
}

