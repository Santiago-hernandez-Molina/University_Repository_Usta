package Test;

import java.util.Arrays;

import Controller.GameController;
public class ControllerTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		 System.out.println("Game:");
	       GameController gc = new GameController();

	        //Insertando el dato
	        gc.save(0, "Apex",32.6);
	        System.out.println(Arrays.toString(gc.list()));

	        //Actualizando el dato
	        gc.update(0, "Apex Legends",34.7);
	        System.out.println(Arrays.toString(gc.list()));

	        //Eliminando el dato
	        gc.delete(0);
	        System.out.println(Arrays.toString(gc.list()));

	}

}
