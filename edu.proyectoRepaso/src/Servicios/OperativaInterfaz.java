package Servicios;

import java.util.List;

import Dtos.AlumnoDto;

public interface OperativaInterfaz {

	public void altaCliente(List<AlumnoDto> listaAlumnos);
	
	public void editarCliente(List<AlumnoDto> listaAlumnos);
	
	public void eliminarCliente(List<AlumnoDto> listaAlumnos);
}
