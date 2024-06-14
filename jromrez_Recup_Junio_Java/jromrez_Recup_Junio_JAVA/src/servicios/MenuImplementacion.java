package servicios;

import java.util.Scanner;

public class MenuImplementacion implements MenuInterfaz{

	Scanner sc = new Scanner(System.in);

	

	@Override
	public int MostrarMenuPrincipal() {
		
		int opcion;
		System.out.println("0.Cerrar aplicacion");
		System.out.println("1.Venta vehiculo");
		System.out.println("Elija opcion");
		opcion = sc.nextInt();
		return opcion;
		
	
	}
}
