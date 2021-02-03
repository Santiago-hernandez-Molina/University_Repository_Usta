package Controller;

import model.Landmammal;

/**
 * @author Santiago Hernandez
 */
public class LandmammalController extends AbstractFacade<Landmammal> {

    //Constructors
    public LandmammalController() {
        data = new Landmammal[1];
    }

    //Own methods
    public boolean save(int id, String animalName, boolean hostility, int health, int damage, int weight, int speed, int strenght, boolean domesticable) {
        try {
            if (findOne(id) == null) {
                Landmammal newLandmammal = new Landmammal(id, animalName, hostility, health, damage, weight, speed, strenght,domesticable);
                data[id] = newLandmammal;

            } else
                System.err.println("La llave primaria (índice) especificada ya existe");

            return true;

        } catch (NullPointerException e) {
            e.printStackTrace();
            System.err.println("Lo sentimos, no se pudo guardar el rol, porque la estructura es nula");
            return false;

        } catch (ArrayIndexOutOfBoundsException e) {
            System.err.println("Lo sentimos, no se pudo guardar el rol, porque se permiten máximo " + data.length + " Mamiferos");
            return false;

        } catch (Exception e) {
            System.err.println("Lo sentimos, se presentó un error general");
            return false;
        }

    }

    public boolean update(int id, String animalName, boolean hostility, int health, int damage, int weight, int speed, int strenght, boolean domesticable) {
        try {
            if (findOne(id) == null) {
                //No longer necesary because is being shwowing on findOne method System.err.println("La llave primaria (índice) especificada no existe o no tiene ningún objeto asociado");

                return false;
            }

            data[id].setAnimalName(animalName);
            data[id].setHostility(hostility);
            data[id].setHealth(health);
            data[id].setDamage(damage);
            data[id].setWeight(weight);
            data[id].setSpeed(speed);
            data[id].setStrenght(strenght);
            data[id].setDomesticable(domesticable);

            return true;

        } catch (NullPointerException e) {
            e.printStackTrace();
            System.err.println("Lo sentimos, no se pudo actualizar el rol, porque la estructura es nula");
            return false;

        } catch (ArrayIndexOutOfBoundsException e) {
            System.err.println("Lo sentimos, no se pudo actualizar el rol, porque se permiten máximo " + data.length + " mamiferos");
            return false;

        } catch (Exception e) {
            System.err.println("Lo sentimos, se presentó un error general");
            return false;
        }
    }

}
