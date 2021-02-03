package GeneralTest;



import Controllers.Player_Controller;
import Controllers.Author_Controller;

import java.util.Arrays;


public class ControllerTest {

    public static void main(String[] args) {
        System.out.println("Player:");
        Player_Controller pc = new Player_Controller();

        //Insertando el dato
        pc.save(0,"snaptube",12,true);
        System.out.println(Arrays.toString(pc.list()));

        //Actualizando el dato
        pc.update(0,"RealHDPlayer",12,true);
        System.out.println(Arrays.toString(pc.list()));

        //Eliminando el dato
        pc.delete(0);
        System.out.println(Arrays.toString(pc.list()));

        System.out.println("Player:");
        Author_Controller ac = new Author_Controller();

        //Insertando el dato
        ac.save(0,"flowpe","12-11-2020",5);
        System.out.println(Arrays.toString(ac.list()));

        //Actualizando el dato
        ac.update(0,"flowpe","12-11-2020",5);
        System.out.println(Arrays.toString(ac.list()));

        //Eliminando el dato
        ac.delete(0);
        System.out.println(Arrays.toString(ac.list()));






    }
}
