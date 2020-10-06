import java.io.File;
import java.util.Scanner;
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class CrearArchivo {
	
	public static void Crear() throws IOException {
		
		try {
			
			Scanner teclado = new Scanner(System.in);
			System.out.println("Escribe la ruta absoluta incluyendo el nombre del archivo que quieres crear.");
			System.out.println("EJEMPLO: 'C:/../../../archivo.txt");
			String ruta = teclado.nextLine();
			File archivo = new File(ruta);
			BufferedWriter bw;
			    
			if(archivo.exists()) {
				bw = new BufferedWriter(new FileWriter(archivo));
			    System.out.println("Error, el archivo ya existe");
			} else {
			    bw = new BufferedWriter(new FileWriter(archivo));
			    System.out.println("El archivo ha sido creado correctamente.");
			}
			
			bw.close();
			
		} catch(Exception e) {
			System.out.println(e);
	    }
	}

}
