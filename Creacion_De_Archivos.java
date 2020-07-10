import java.io.File;
import java.io.IOException;
import java.util.TreeMap;
import java.io.FileWriter;

public class Creacion_De_Archivos {

	public static void Crear_Archivo(TreeMap<Float, String> arbolito) {
		try {
			File Archivo = new File("file2.txt");
			if (Archivo.createNewFile()) {
				System.out.println("Nuevo archivo creado");
			} else {
				System.out.println("El nuevo archivo estaba creado");
			}
		} catch (IOException x) {
			System.out.println("Ocurrió un error: ");
			x.printStackTrace();
		}
		try {
			FileWriter myWriter = new FileWriter("file2.txt");
			for (Float i : arbolito.keySet()) {
				String dato = arbolito.get(i);
				myWriter.write(dato + "\n");
			}
			myWriter.write((arbolito.size()-1)+" alumnos");
			myWriter.close();
		} catch (IOException x) {
			System.out.println("An error occurred.");
			x.printStackTrace();
		}

	}
}