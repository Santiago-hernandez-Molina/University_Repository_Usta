package Controllers;


import model.Student;


/**
 * @author Santiago Hernandez
 */
public class StundentController extends AbstractFacade<Student> {

    //Constructors
    public StundentController() {
        data = new Student[1];
    }


    public boolean save(int id, String code, String name, String lastName, String birthdate, String EnterDate, String faculty,int semester) {
        try {
            if (findOne(id) == null) {
                Student newStudent = new Student(id, code, name, lastName, birthdate, EnterDate, faculty,semester);
                data[id] = newStudent;

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

    public boolean update(int id, String code, String name, String lastName, String birthdate, String EnterDate, String faculty,int semester) {
        try {
            if (findOne(id) == null) {
                //No longer necesary because is being shwowing on findOne method System.err.println("La llave primaria (índice) especificada no existe o no tiene ningún objeto asociado");

                return false;
            }

            data[id].setCode(code);
            data[id].setName(name);
            data[id].setLastName(lastName);
            data[id].setBirthdate(birthdate);
            data[id].setEnterDate(EnterDate);
            data[id].setFaculty(faculty);
            data[id].setSemester(semester);

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
