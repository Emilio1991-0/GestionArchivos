import java.io.File;
import java.util.Scanner;

public class EliminarArchivo {

	public static void main(String[] args) {
		
	}
	
	public static void Eliminar() {
		
		try {

			Scanner teclado = new Scanner(System.in);
			System.out.println("Escribe la ruta absoluta incluyendo el nombre del archivo que quieres eliminar.");
			System.out.println("EJEMPLO: 'C:/../../../archivo.txt");
			String ruta = teclado.nextLine();
			File archivo = new File(ruta);

            boolean estatus = archivo.delete();

            if (!estatus) {
                System.out.println("Error, no se ha podido eliminar el archivo");
                
            } else {
                System.out.println("Se ha eliminado el archivo correctamente");
            }

        } catch(Exception e) {
        	System.out.println(e);
        }
		
	}
	
}
