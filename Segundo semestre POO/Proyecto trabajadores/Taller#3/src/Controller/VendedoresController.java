package Controller;
import model.Vendedores;
import model.Programadores;
import java.util.Arrays;
//*Author: Juan David Neira Martinez
//*Date: 16/10/2020
public class VendedoresController extends AbstractFacade<Vendedor> {
    public VendedoresController() {
        data = new Vendedor[20];
    }

    //Vendedor methods
    public boolean save(int id, String name, int cc, int age, String sex, String telephone, double salary){
        try{
            if(findOne(id) == null ){
                Vendedor newVendedor = new Vendedor(id, name, cc, age, null, sex, telephone, salary);
                data[id] = newVendedor;

            }else
                System.err.println("La llave primaria (índice) especificada ya existe");

            return true;

        }catch(NullPointerException e){
            e.printStackTrace();
            System.err.println("Lo sentimos, no se pudo guardar el rol, porque la estructura es nula");
            return false;

        }catch(ArrayIndexOutOfBoundsException e){
            System.err.println("Lo sentimos, no se pudo guardar el rol, porque se permiten máximo " + data.length + " propietarios");
            return false;

        }catch(Exception e){
            System.err.println("Lo sentimos, se presentó un error general");
            return false;
        }

    }

    public boolean update(int id, String name, int cc, int age, String sex, String telephone, double salary){
        try {
            if(findOne(id) == null){
                Vendedor newVendedor = new Vendedor(id, name, cc, age, null, sex, telephone, salary);
                data[id] = newVendedor;
                return false;
            }
            //Optimal option
            data[id].setname(name);
            data[id].setcc(cc);
            data[id].setage(age);
            data[id].setsex(sex);
            data[id].settelephone(telephone);
            data[id].setsalary(salary);

            return true;

        }catch(NullPointerException e){
            e.printStackTrace();
            System.err.println("Lo sentimos, no se pudo actualizar el rol, porque la estructura es nula");
            return false;

        }catch(ArrayIndexOutOfBoundsException e){
            System.err.println("Lo sentimos, no se pudo actualizar el rol, porque se permiten máximo " + data.length + " propietarios");
            return false;

        }catch(Exception e){
            System.err.println("Lo sentimos, se presentó un error general");
            return false;
        }
    }
}
}
