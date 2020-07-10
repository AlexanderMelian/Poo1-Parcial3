import java.io.File;
import java.io.FileNotFoundException;
import java.util.Collections;
import java.util.Scanner;
import java.util.TreeMap;

public class Lectura_De_Archivos {
	public static TreeMap<Float, String> LeerDatos() {
		TreeMap<Float, String> Arbol = new TreeMap<Float, String>(Collections.reverseOrder());
		String nombre, apellido, nomyape, todo;
		int legajo, i = 0;
		float nota1, nota2, nota3, promedio = 11;
		try {
			File Archivo = new File("file.txt");
			Scanner a = new Scanner(Archivo);
			while (a.hasNextLine()) {
				String data = a.nextLine();
				if (i != 0) {
					String[] partes = data.split(" ");
					legajo = Integer.parseInt(partes[0]);
					nombre = partes[1];
					apellido = partes[2];
					nota1 = Float.parseFloat(partes[3]);
					nota2 = Float.parseFloat(partes[3]);
					nota3 = Float.parseFloat(partes[3]);
					nomyape = nombre + " " + apellido;
					promedio = (nota1 + nota2 + nota3) / 3;
					todo = legajo + " " + nomyape + " " + promedio;
				} else {
					todo = data;
					i = 1;
				}
				Arbol.put(promedio, todo);

			}
			a.close();
			System.out.println("Primer achivo cerrado");
		} catch (FileNotFoundException x) {
			System.out.println(x);
			x.printStackTrace();
		}
		return Arbol;
	}

}