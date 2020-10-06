import java.io.IOException;
import java.util.Scanner;

public class main {

	public static void main(String[] args) throws IOException {
		
		Menu();
		
	}

	static void Menu() throws IOException {
		
		Scanner teclado = new Scanner(System.in);
		boolean salir = false;
		int opcion;

		while (!salir) {

			System.out.println("1: Copiar un fichero");
			System.out.println("2: Crear un fichero");
			System.out.println("3: Eliminar un fichero");
			System.out.println("4: Mostrar contenido de un fichero");
			System.out.println("5: Salir");
			opcion = teclado.nextInt();
			
			switch (opcion) {
			case 1:
				CopiarArchivo.Copiar();
				
				break;
			case 2:
				CrearArchivo.Crear();
				break;
			case 3:
				EliminarArchivo.Eliminar();
				
				break;
			case 4:
				LeerArchivo.Leer();
				
				break;
			case 5:
				salir = true;
				
				break;
			}		
			
		}
		
	}

}
