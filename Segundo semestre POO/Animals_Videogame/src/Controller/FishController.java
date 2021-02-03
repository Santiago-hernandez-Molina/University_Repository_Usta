package Controller;

import model.Fish;

public class  FishController extends AbstractFacade<Fish> {

    //Constructors
    public FishController() {
        data = new Fish[1];
    }

    //Own methods
    public boolean save(int id, String animalName, boolean hostility, int health, int damage, int weight, int speed, boolean poisonous, String waterTipe) {
        try {
            if (findOne(id) == null) {
                Fish newFish = new Fish(id, animalName, hostility, health, damage, weight, speed,poisonous,waterTipe);
                data[id] = newFish;

            } else
                System.err.println("La llave primaria (índice) especificada ya existe");

            return true;

        } catch (NullPointerException e) {
            e.printStackTrace();
            System.err.println("Lo sentimos, no se pudo guardar el rol, porque la estructura es nula");
            return false;

        } catch (ArrayIndexOutOfBoundsException e) {
            System.err.println("Lo sentimos, no se pudo guardar el rol, porque se permiten máximo " + data.length + " Peces");
            return false;

        } catch (Exception e) {
            System.err.println("Lo sentimos, se presentó un error general");
            return false;
        }

    }

    public boolean update(int id, String animalName, boolean hostility, int health, int damage, int weight, int speed, boolean poisonous, String waterTipe) {
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
            data[id].setPoisonous(poisonous);
            data[id].setWaterTipe(waterTipe);

            return true;

        } catch (NullPointerException e) {
            e.printStackTrace();
            System.err.println("Lo sentimos, no se pudo actualizar el rol, porque la estructura es nula");
            return false;

        } catch (ArrayIndexOutOfBoundsException e) {
            System.err.println("Lo sentimos, no se pudo actualizar el rol, porque se permiten máximo " + data.length + " peces");
            return false;

        } catch (Exception e) {
            System.err.println("Lo sentimos, se presentó un error general");
            return false;
        }
    }
}
