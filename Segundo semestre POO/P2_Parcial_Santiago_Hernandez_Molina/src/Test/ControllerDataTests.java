package Test;

import Controllers.StundentController;


import java.util.Arrays;


public class ControllerDataTests {
    public static void main(String[] args) {
        System.out.println("Student:");
        StundentController oc = new StundentController();

        //Insertando el dato
        oc.save(0, "2280552", "Santiago","Hernandez", "19-11-2002", "01-01-2020","ing de sistemas",2);
        System.out.println(Arrays.toString(oc.list()));

        //Actualizando el dato
        oc.update(0, "2280552", "santiago","Molina","18-11-2001","02-02-2020","ing de sistemas",2);
        System.out.println(Arrays.toString(oc.list()));

        //Eliminando el dato
        oc.delete(0);
        System.out.println(Arrays.toString(oc.list()));

    }
}
