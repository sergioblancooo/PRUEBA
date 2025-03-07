package poo;

import clases.Sexo;

public class Persona {
	private String nombre;
	private String dni;
	private Sexo sexo;
	
	public String getDni() {
		return this.dni;
	}
	public void setDni(String dni) {
		this.dni = dni;
	}
	public Persona(String dni) {
		this.dni = dni;
	}
	public Persona(String dni, String nombre) {
		this.dni = dni;
		this.nombre = nombre;
	}
	public Persona(String dni, String nombre, Sexo sexo) {
		this.dni = dni;
		this.nombre = nombre;
		this.sexo = sexo;
	}
	public String getNombre() {
		return this.nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public void setSexo(Sexo sexo) {
		this.sexo = sexo;
	}
	public Sexo getSexo() {
		return this.sexo;
	}
}

