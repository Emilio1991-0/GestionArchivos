import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Menu();
		int opcion = 0;
		
		switch (opcion) {
		case 1:
			copiar
			
			break;
		case 2:
			CrearArchivo cr = new CrearArchivo();
			cr.main(args);
			break;
		case 3:
			EliminarArchivo el = new EliminarArchivo();
			el.Eliminar(args);
			
			break;
		case 4:
			LeerArchivo le = new LeerArchivo();
			le.main(args);
			
			break;
		case 5:
		salir
			
			break;

		default:
			break;
		}		
	}

	static void Menu() {
		Scanner teclado = new Scanner(System.in);
		boolean salir = false;
		int opcion; // Guardaremos la opcion del usuario

		while (!salir) {

			System.out.println("Opcion 1: Copiar archivos");
			System.out.println("Opcion 2: Crear un fichero");
			System.out.println("Opcion 3: Borrar un fichero");
			System.out.println("Opcion 4: Contenido de un fichero de texto");
			System.out.println("Opcion 5: Salir");
			 opcion = teclado.nextInt();
			 teclado.close();
		}
	}
}
