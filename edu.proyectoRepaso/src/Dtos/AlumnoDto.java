package Dtos;

import java.time.LocalDate;

public class AlumnoDto {

	long id;
	String nombre = "aaaaa";
	String apellidos = "aaaaa";
	String dni = "aaaaa";
	LocalDate fechanac = LocalDate.now();
	String email = "aaaaa";
	String telefono = "aaaaa";
	
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getApellidos() {
		return apellidos;
	}
	public void setApellidos(String apellidos) {
		this.apellidos = apellidos;
	}
	public String getDni() {
		return dni;
	}
	public void setDni(String dni) {
		this.dni = dni;
	}
	public LocalDate getFechanac() {
		return fechanac;
	}
	public void setFechanac(LocalDate fechanac) {
		this.fechanac = fechanac;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getTelefono() {
		return telefono;
	}
	public void setTelefono(String telefono) {
		this.telefono = telefono;
	}
	public AlumnoDto() {
		super();
	}
	
	public AlumnoDto(long id, String nombre, String apellidos, String dni, LocalDate fechanac, String email,
			String telefono) {
		super();
		this.id = id;
		this.nombre = nombre;
		this.apellidos = apellidos;
		this.dni = dni;
		this.fechanac = fechanac;
		this.email = email;
		this.telefono = telefono;
	}
	@Override
	public String toString() {
		return "AlumnoDto [id=" + id + ", nombre=" + nombre + ", apellidos=" + apellidos + ", dni=" + dni
				+ ", fechanac=" + fechanac + ", email=" + email + ", telefono=" + telefono + "]";
	}
	
	
	
	
}
