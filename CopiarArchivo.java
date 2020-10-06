import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.Scanner;

public class CopiarArchivo {
	
	static Scanner teclado = new Scanner(System.in);
	private static File origen;
	private static File destino;
	private static InputStream in;
	private static OutputStream out;
	
	public static boolean Copiar() {
		
		System.out.println("Escribe la ruta absoluta incluyendo el nombre del archivo que quieres copiar.");
		System.out.println("EJEMPLO: 'C:/../../../archivo.txt");
		String pathOrigen = teclado.nextLine();
		System.out.println("Escribe la ruta absoluta incluyendo el nombre donde quieres copiar el archivo.");
		System.out.println("EJEMPLO: 'C:/../../../archivo.txt");
		String pathDestino = teclado.nextLine();
		
		origen = new File(pathOrigen);
        destino = new File(pathDestino);
        
        if (origen.exists()) {
            try {
                InputStream in = new FileInputStream(origen);
                OutputStream out = new FileOutputStream(destino);
                byte[] buf = new byte[1024];
                int len;
                while ((len = in.read(buf)) > 0) {
                    out.write(buf, 0, len);
                }
                in.close();
                out.close();
                return true;
            } catch (IOException ioe) {
                ioe.printStackTrace();
                return false;
            }
        } else {
            return false;
        }
		
	}
}
