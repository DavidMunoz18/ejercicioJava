package Servicios;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.List;
import java.util.Scanner;

import Dtos.AlumnoDto;

public class OperativaImplementacion implements OperativaInterfaz {

	Scanner sc = new Scanner(System.in);
	MenuInterfaz mi = new MenuImplementacion();
	DateTimeFormatter dTimeFormatter = DateTimeFormatter.ofPattern("dd-MM-yyyy");
	@Override
	public void altaCliente(List<AlumnoDto> listaAlumnos) {
		
		AlumnoDto alumno = crearAlumno(listaAlumnos);
		
		listaAlumnos.add(alumno);
		
		
	}
	private AlumnoDto crearAlumno(List<AlumnoDto> listaAlumnos) {
		
		AlumnoDto alumno = new AlumnoDto();
		
		alumno.setId(idAutogenerado(listaAlumnos));
		System.out.println("ID: " + alumno.getId());
		
		
		System.out.println("Introduce el nombre del alumno");
		alumno.setNombre(sc.next());
		
		System.out.println(alumno.getNombre());
		
	
		
		System.out.println("Introduce el apellido del alumno");
		alumno.setApellidos(sc.next());
		
		System.out.println(alumno.getApellidos()); 
		
		System.out.println("Introduce el dni");
		alumno.setDni(sc.next());
		
		System.out.println(alumno.getDni());
		
		System.out.println("Introduce la fecha de nacimiento (dd-MM-yyyy)");
		LocalDate fechaNacDate = LocalDate.parse(sc.next(), dTimeFormatter);
		
		System.out.println("Introduce el email");
		alumno.setEmail(sc.next());
		
		System.out.println("Introduce el telefono");
		alumno.setTelefono(sc.next());
		
		
		return alumno;
	}
	private long idAutogenerado(List<AlumnoDto> listaAlumnos) {
		
		long id;
		
		int tamanioLista = listaAlumnos.size();
		
		if(tamanioLista == 0) {
			
			id = 1;
			
		}else {
			
			id = listaAlumnos.get(tamanioLista - 1).getId() + 1;
		}
		
		return id;
		
	}
	@Override
	public void editarCliente(List<AlumnoDto> listaAlumnos) {
		
		int posicion = 0;
		
		System.out.println("Introduzca el dni del alumno a modificar");
		String dniAlumn = sc.next();
		
	  System.out.println(listaAlumnos.size());
		
		for (AlumnoDto alumno : listaAlumnos) {
			
			
			
			if(dniAlumn.equals(alumno.getDni())) {
				
			int menu =	mi.menuEditarCampos();
				
			switch (menu) {
			case 1:
				System.out.println("Introduce el nombre a cambiar");
				String nombreCambiar = sc.next();
				
				listaAlumnos.get(posicion).setNombre(nombreCambiar);
				
				
				
				break;
			case 2:
				System.out.println("Introduce el apellido a cambiar");
				String apellido = sc.next();
				
				alumno.setApellidos(apellido);
				break;
			case 3:
				System.out.println("Introduce el dni a cambiar");
				String dniC = sc.next();
				
				alumno.setDni(dniC);
				break;
			case 4:
				System.out.println("Introduce la fecha a cambiar (dd-MM-yyyy)");
				LocalDate fechaCamb = LocalDate.parse(sc.next(), dTimeFormatter);
				
				alumno.setFechanac(fechaCamb);
				break;
			case 5:
				System.out.println("Introduce el email a cambiar");
				String emailC = sc.next();
				
				alumno.setEmail(emailC);
				break;
			case 6:
				System.out.println("Introduce el telefono a cambiar");
				String telefonoC = sc.next();
				
				alumno.setTelefono(telefonoC);
				break;
			
				
			default:
				break;
				
			}
			System.out.println(alumno.toString());
				
			}else {
				posicion = posicion + 1;
				System.out.println("El alumno con ese dni no existe");
			}
		}
		
	}

}
