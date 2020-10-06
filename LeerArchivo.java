import java.io.File;
import java.util.Scanner;

public class LeerArchivo {
	
	public static void Leer() {
		
		File archivo = new File("archivo.txt");
		Scanner teclado = null;

		try {
			
			System.out.println("Leemos el contenido del fichero");
			teclado = new Scanner(archivo);
			
			while (teclado.hasNextLine()) {
				String linea = teclado.nextLine(); 
				System.out.println(linea); 
			}

		} catch (Exception e) {
			System.out.println("Mensaje: " + e.getMessage());
		} finally {			
			try {
				if (teclado != null)
					teclado.close();
			} catch (Exception e2) {
				System.out.println("Mensaje 2: " + e2.getMessage());
			}
		}
		
	}
	
}
