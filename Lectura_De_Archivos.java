import java.io.File;
import java.io.FileNotFoundException;
import java.util.Collections;
import java.util.Scanner;
import java.util.TreeMap;

public class Lectura_De_Archivos {
	
	public static TreeMap<Integer, Alumno> LeerDatos() {
		TreeMap<Integer, Alumno> Arbol = new TreeMap<Integer, Alumno>(Collections.reverseOrder());
		String nombre, apellido;
		int legajo=0, i = 0;
		float nota1, nota2, nota3;
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
					nota2 = Float.parseFloat(partes[4]);
					nota3 = Float.parseFloat(partes[5]);
					Arbol.put(legajo, new Alumno(nombre, apellido, nota1, nota2, nota3, legajo));
				}
				else{
					Arbol.put(0, new Alumno (data, data, 1,1,1,0));
					i = 1;
				}
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