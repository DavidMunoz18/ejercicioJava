package Controladores;

import java.util.ArrayList;
import java.util.List;

import Dtos.AlumnoDto;
import Servicios.MenuImplementacion;
import Servicios.MenuInterfaz;
import Servicios.OperativaImplementacion;
import Servicios.OperativaInterfaz;

public class Inicio {

	/**
	 * Clase de acceso a la aplicación
	 * @author dmp - 19/09/24
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		List<AlumnoDto> listaAlumnos = new ArrayList<AlumnoDto>();
		MenuInterfaz mi = new MenuImplementacion();
		OperativaInterfaz oi = new OperativaImplementacion();
		try {
			
		
		boolean cerrarMenu = false;
		int opcion;
		while(!cerrarMenu) {
			
			opcion = mi.mostrarMenuYSeleccion();
			switch (opcion) {
			case 0:
				System.out.println("La aplicación se va a cerrar");
				cerrarMenu = true;
				break;
			case 1:
				System.out.println("Has seleccionado alta usuario");
				oi.altaCliente(listaAlumnos);
				
				break;
			case 2:
				System.out.println("Has seleccionado editar usuario");
				oi.editarCliente(listaAlumnos);
				
				break;
			case 3:
				System.out.println("Has seleccionado dar de baja usuario");
				break;

			default:
				System.out.println("La opcion seleccionada no existe");
				break;
				}
			}
		}catch (Exception e) {
			// TODO: handle exception
	}
}
}
