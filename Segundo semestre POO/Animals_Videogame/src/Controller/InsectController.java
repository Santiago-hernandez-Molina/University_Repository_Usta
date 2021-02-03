package Controller;

import model.Insect;

import java.util.Arrays;


public class InsectController extends AbstractFacade<Insect> {

    public InsectController() {
        data = new Insect[1];
    }

    //Own methods
    public boolean save(int id, String animalName, boolean hostility, int health, int damage, int weight, int speed, boolean poisonous) {
        try {
            if (findOne(id) == null) {
                Insect newInsect = new Insect(id, animalName, hostility, health, damage, weight, speed, poisonous);
                data[id] = newInsect;

            } else
                System.err.println("La llave primaria (índice) especificada ya existe");

            return true;

        } catch (NullPointerException e) {
            e.printStackTrace();
            System.err.println("Lo sentimos, no se pudo guardar el rol, porque la estructura es nula");
            return false;

        } catch (ArrayIndexOutOfBoundsException e) {
            System.err.println("Lo sentimos, no se pudo guardar el rol, porque se permiten máximo " + data.length + " insectos");
            return false;

        } catch (Exception e) {
            System.err.println("Lo sentimos, se presentó un error general");
            return false;
        }

    }

    public boolean update(int id, String animalName, boolean hostility, int health, int damage, int weight, int speed, boolean poisonous) {
        try {
            if (findOne(id) == null) {
                //No longer necesary because is being shwowing on findOne method System.err.println("La llave primaria (índice) especificada no existe o no tiene ningún objeto asociado");

                return false;
            }


            data[id].setAnimalName(animalName);
            data[id].setHostility(hostility);
            data[id].setDamage(damage);
            data[id].setHealth(health);
            data[id].setDamage(damage);
            data[id].setSpeed(speed);
            data[id].setWeight(weight);
            data[id].setPoisonous(poisonous);

            return true;

        } catch (NullPointerException e) {
            e.printStackTrace();
            System.err.println("Lo sentimos, no se pudo actualizar el rol, porque la estructura es nula");
            return false;

        } catch (ArrayIndexOutOfBoundsException e) {
            System.err.println("Lo sentimos, no se pudo actualizar el rol, porque se permiten máximo " + data.length + " insectos");
            return false;

        } catch (Exception e) {
            System.err.println("Lo sentimos, se presentó un error general");
            return false;
        }
    }
}
