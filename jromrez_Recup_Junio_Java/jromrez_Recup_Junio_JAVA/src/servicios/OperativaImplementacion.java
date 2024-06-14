package servicios;

import java.util.List;
import java.util.Scanner;


import dtos.PropietarioDto;

public class OperativaImplementacion  implements OperativaInterfaz{

	
	

	@Override
	public void ventaVehiculo(List<PropietarioDto> listaPropietarios) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("ingrese la matricula del vehiculo");
		String matricula=sc.nextLine();

		for (PropietarioDto vehiculo:listaPropietarios) {
			
			if(matricula.equals(listaPropietarios)==true) {
			System.out.println("Ingrese su dni por favor");
			String dni = sc.nextLine();
			}else {
				System.out.println("Vuelva a introducir su matricula");
			}
		}
	}
	
	private long calcularNuevoId(List<PropietarioDto> listaPropietarios) {
		
		long nuevoId;
		int tamanioLista=listaPropietarios.size();
		if (tamanioLista == 0)
        {
			nuevoId = 100;
        }
        else
        {
        	nuevoId = listaPropietarios.get(tamanioLista+1).getId() - 1;
        }

        return nuevoId;
	}
	
}
