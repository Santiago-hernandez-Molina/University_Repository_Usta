package Controllers;


import model.Author;


/**
 * @author Diego Alexander Guerrero Campos
 */
public class Author_Controller extends Abstract_Facade<Author> {

    //Constructors
    public Author_Controller() {
        data = new Author[1];
    }


    public boolean save(int id, String name, String fecha_de_nacimiento, int age) {
        try {
            if (findOne(id) == null) {
                Author newAuthor = new Author( id, name,fecha_de_nacimiento,age);
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

    public boolean update(int id, String name, String fecha_de_nacimiento, int age) {
        try {
            if (findOne(id) == null) {
                //No longer necesary because is being shwowing on findOne method System.err.println("La llave primaria (índice) especificada no existe o no tiene ningún objeto asociado");

                return false;
            }
            data[id].setName(name);
            data[id].setFecha_de_nacimiento(fecha_de_nacimiento);
            data[id].setId(id);
            data[id].getAge(age);



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