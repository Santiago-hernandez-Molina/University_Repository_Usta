package Controller;

import model.Game;

public class GameController extends AbstractFacade<Game> {

	public GameController() {
		data=new Game[3];
		
	}
	
	 public boolean save(int id, String name, double size){
	        try{
	            if(findOne(id) == null ){
	               Game newGame = new Game(id,name,size);
	                data[id] = newGame;
	                
	                

	            }else
	                System.err.println("La llave primaria (índice) especificada ya existe");

	            return true;

	        }catch(NullPointerException e){
	            e.printStackTrace();
	            System.err.println("Lo sentimos, no se pudo guardar el rol, porque la estructura es nula");
	            return false;

	        }catch(Exception e){
	            System.err.println("Lo sentimos, se presentó un error general");
	            return false;
	        }
	 }
	 
	 public boolean update(int id, String name, double size){
	        try {
	            if(findOne(id) == null){
	                //No longer necesary because is being shwowing on findOne method System.err.println("La llave primaria (índice) especificada no existe o no tiene ningún objeto asociado");

	                return false;
	            }


	            data[id].setName(name);
	            data[id].setSize(size);
	            

	            return true;

	        }catch(NullPointerException e){
	            e.printStackTrace();
	            System.err.println("Lo sentimos, no se pudo actualizar el rol, porque la estructura es nula");
	            return false;

	        }catch(ArrayIndexOutOfBoundsException e){
	            System.err.println("Lo sentimos, no se pudo actualizar el rol, porque se permiten máximo " + data.length + " aves");
	            return false;

	        }catch(Exception e){
	            System.err.println("Lo sentimos, se presentó un error general");
	            return false;
	        }
	    }
}
