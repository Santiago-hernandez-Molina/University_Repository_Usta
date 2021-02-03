package Controller;

public abstract class AbstractFacade<T> {

    //Attributes
    T[] data;

    public boolean delete(int id){
        try {
            if(findOne(id) == null){
                //No longer necesary because is being shwowing on findOne method System.err.println("La llave primaria (índice) especificada no existe o no tiene ningún objeto asociado");

                return false;
            }

            data[id] = null;

            return true;

        }catch(NullPointerException e){
            e.printStackTrace();
            System.err.println("Lo sentimos, no se pudo eliminar el rol, porque la estructura es nula");
            return false;

        }catch(ArrayIndexOutOfBoundsException e){
            System.err.println("Lo sentimos, no se pudo eliminar el rol, porque se permiten máximo " + data.length + " propietarios");
            return false;

        }catch(Exception e){
            System.err.println("Lo sentimos, se presentó un error general");
            return false;
        }
    }


    public T findOne(int id){
        for(int i=0; i < data.length; i++){
            if(data[i] != null && id == data[i].hashCode()){
                return data[i];
            }else{

            }
        }

        return null;
    }


    public T[] list(){
        try {

            return data;

        } catch (Exception e) {
            System.err.println("Lo sentimos, ocurrió un error al tratar de listar");
            return null;
            //return "";
        }
    }
}