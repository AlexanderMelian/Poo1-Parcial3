
import java.util.TreeMap;

public class Main {
	public static void main(String[] args) {
		TreeMap<Float, String> Arbolito = Lectura_De_Archivos.LeerDatos();
		Creacion_De_Archivos.Crear_Archivo(Arbolito);
	}
}
