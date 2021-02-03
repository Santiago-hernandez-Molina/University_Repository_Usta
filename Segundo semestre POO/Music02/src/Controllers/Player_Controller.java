package Controllers;

import model.Player;


/**
 * @author Diego Alexander Guerrero Campos
 */
public class Player_Controller extends Abstract_Facade<Player> {

    //Constructors
    public Player_Controller() {
        data = new Player[1];
    }


    public boolean save(int id, String name, int age, boolean qualification) {
        try {
            if (findOne(id) == null) {
                Player newAuthor = new Player( id, name, age, qualification);
                data[id] = newAuthor;

            } else
                System.err.println("La llave primaria (índice) especificada ya existe");

            return true;

        } catch (NullPointerException e) {
            e.printStackTrace();
            System.err.println("Lo sentimos, no se pudo guardar el rol, porque la estructura es nula");
            return false;

        } catch (ArrayIndexOutOfBoundsException e) {
            System.err.println("Lo sentimos, no se pudo guardar el rol, porque se permiten máximo " + data.length + " carateres");
            return false;

        } catch (Exception e) {
            System.err.println("Lo sentimos, se presentó un error general");
            return false;
        }

    }

    public boolean update(int id, String name, int age, boolean qualification) {
        try {
            if (findOne(id) == null) {
                //No longer necesary because is being shwowing on findOne method System.err.println("La llave primaria (índice) especificada no existe o no tiene ningún objeto asociado");

                return false;
            }

            data[id].setId(id);
            data[id].setName(name);
            data[id].setAge(age);
            data[id].setQualification(qualification);



            return true;

        } catch (NullPointerException e) {
            e.printStackTrace();
            System.err.println("Lo sentimos, no se pudo actualizar el rol, porque la estructura es nula");
            return false;

        } catch (ArrayIndexOutOfBoundsException e) {
            System.err.println("Lo sentimos, no se pudo actualizar el rol, porque se permiten máximo " + data.length + " caracteres");
            return false;

        } catch (Exception e) {
            System.err.println("Lo sentimos, se presentó un error general");
            return false;
        }
    }

}
