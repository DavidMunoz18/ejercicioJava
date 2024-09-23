package Servicios;

import java.util.Scanner;

public class MenuImplementacion implements MenuInterfaz {

	Scanner sc = new Scanner(System.in);
	@Override
	public int mostrarMenuYSeleccion() {
		
		
		
		int opcion;
		System.out.println("------------------------");
		System.out.println("0. Cerrar menu");
		System.out.println("1. Dar de alta un nuevo alumno");
		System.out.println("2. Editar a un alumno");
		System.out.println("3. Dar de baja a un alumno");
		System.out.println("------------------------");
		opcion = sc.nextInt(); 
		return opcion;
	}

	@Override
	public int menuEditarCampos() {
		
		int opcion;
		
		System.out.println("Introduzca el numero del campo a modificar");
		System.out.println("------------------------");
		System.out.println("1. Nombre");
		System.out.println("2. Apellidos");
		System.out.println("3. Dni");
		System.out.println("4. Fecha de nacimiento");
		System.out.println("5. Email");
		System.out.println("6. Telefono");
		System.out.println("------------------------");
		
		opcion = sc.nextInt();
		return opcion;
		
		
	
	}

}
