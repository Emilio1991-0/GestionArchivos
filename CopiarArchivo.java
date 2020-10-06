
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
	
	public boolean copiarFichero() {
		System.out.println("Introduce el path absoluto del archivo a copiar:");
		String pathOrigen = teclado.nextLine();
		System.out.println("Introduce el path absoluto donde quieres copiar:");
		String pathDestino = teclado.nextLine();
		origen = new File(pathOrigen);
        destino = new File(pathDestino);
        if (origen.exists()) {
            try {
                InputStream in = new FileInputStream(origen);
                OutputStream out = new FileOutputStream(destino);
                // Usamos un buffer para la copia.
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
