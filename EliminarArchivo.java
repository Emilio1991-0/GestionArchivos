import java.io.File;

public class EliminarArchivo {

    public static void Eliminar(String args[]){

        try{

            File archivo = new File("C:\\practicas\\Ejercicio1.txt");

            boolean estatus = archivo.delete();

            if (!estatus) {

                System.out.println("Error no se ha podido eliminar el  archivo");

           }else{

                System.out.println("Se ha eliminado el archivo exitosamente");

           }

        }catch(Exception e){

           System.out.println(e);

        }

    }

}