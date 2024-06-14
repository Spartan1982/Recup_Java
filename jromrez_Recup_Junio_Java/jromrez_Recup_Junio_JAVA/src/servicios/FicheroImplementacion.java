package servicios;

import java.io.FileWriter;
import java.io.IOException;

public class FicheroImplementacion implements FicheroInterfaz{

	public void escribirFicheroLog() {
		
		
		String ficheroRuta = "C:\\Users\\Jaime\\Desktop\\recuperacion-java-workspace\\Logs";
		String nombreFichero = "vehiculosYpropietarios.txt";
		
		// Crear un objeto FileWriter
        FileWriter vehiculo = null;
		try {
			vehiculo = new FileWriter(nombreFichero);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		try {
			vehiculo.write("");
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		try {
			vehiculo.close();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
	}
}
