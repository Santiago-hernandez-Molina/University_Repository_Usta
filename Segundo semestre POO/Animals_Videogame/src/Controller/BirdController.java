package Controller;

import model.Bird;

/*
 author Santiago Hernandez Molina
 */
public class BirdController extends AbstractFacade<Bird>{


    public BirdController() {
        data = new Bird[1];
    }


    public boolean save(int id, String animalName, boolean hostility, int health, int damage, int weight, int speed, boolean flying){
        try{
            if(findOne(id) == null ){
                Bird newBird = new Bird(id, animalName, hostility, health, damage, weight, speed,flying);
                data[id] = newBird;

            }else
                System.err.println("La llave primaria (índice) especificada ya existe");

            return true;

        }catch(NullPointerException e){
            e.printStackTrace();
            System.err.println("Lo sentimos, no se pudo guardar el rol, porque la estructura es nula");
            return false;

        }catch(ArrayIndexOutOfBoundsException e){
            System.err.println("Lo sentimos, no se pudo guardar el rol, porque se permiten máximo " + data.length + " aves");
            return false;

        }catch(Exception e){
            System.err.println("Lo sentimos, se presentó un error general");
            return false;
        }

    }

    public boolean update(int id, String animalName, boolean hostility, int health, int damage, int weight, int speed, boolean flying){
        try {
            if(findOne(id) == null){
                //No longer necesary because is being shwowing on findOne method System.err.println("La llave primaria (índice) especificada no existe o no tiene ningún objeto asociado");

                return false;
            }


            data[id].setAnimalName(animalName);
            data[id].setHostility(hostility);
            data[id].setHealth(health);
            data[id].setDamage(damage);
            data[id].setWeight(weight);
            data[id].setSpeed(speed);
            data[id].setFlying(flying);

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