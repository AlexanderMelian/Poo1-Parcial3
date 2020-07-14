import java.io.File;
import java.io.IOException;
import java.util.TreeMap;
import java.io.FileWriter;

public class Creacion_De_Archivos {

	public static void Crear_Archivo(TreeMap<Integer, String> arbolito) {
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
			myWriter.write(arbolito.get(0)+"\n");
			for (Integer i : arbolito.keySet()) {
				if(i==0){continue;}
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