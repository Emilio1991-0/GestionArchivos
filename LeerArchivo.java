
import java.io.File;

import java.util.Scanner;

public class LeerArchivo {
	public static void main(String[] args) {
		
		File fichero = new File("Ejercicio1.txt");
		Scanner s = null;

		try {
			
			System.out.println("Leemos el contenido del fichero");
			s = new Scanner(fichero);
			
			while (s.hasNextLine()) {
				String linea = s.nextLine(); 
				System.out.println(linea); 
			}

		} catch (Exception ex) {
			System.out.println("Mensaje: " + ex.getMessage());
		} finally {			
			try {
				if (s != null)
					s.close();
			} catch (Exception ex2) {
				System.out.println("Mensaje 2: " + ex2.getMessage());
			}
		}
	}
}
