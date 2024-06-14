package controladores;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import servicios.FicheroImplementacion;
import servicios.FicheroInterfaz;
import servicios.MenuImplementacion;
import servicios.MenuInterfaz;
import servicios.OperativaImplementacion;
import servicios.OperativaInterfaz;

public class Inicio {

	public static void main(String[] args) throws IOException {

		MenuInterfaz mi =new MenuImplementacion();
		OperativaInterfaz oi = new OperativaImplementacion();
		FicheroInterfaz fi = new FicheroImplementacion();
		
		int opcionUsuario;
		boolean cerrarMenu=false;
		
		Scanner sc = new Scanner(System.in);
		List<Integer>ListaPropietarios = new ArrayList();

		
		do {
			opcionUsuario = mi.MostrarMenuPrincipal();
			switch(opcionUsuario) {
			
			
			case 0:
				System.out.println("Cerrar aplicacion");
				break;
			case 1:
				System.out.println("Venta de vehiculo");
				oi.ventaVehiculo(ListaPropietarios);
				break;
			default:
				break;
			}
				
			}while(!cerrarMenu);
				
	}
}