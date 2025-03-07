package poo;

import clases.Sexo;

public class Bombero extends Trabajador {
	private Peligrosidad peligrosidad;
	
	public Bombero(String vDni, String vNombre, Sexo vSexo, String numSS, double salario, Peligrosidad peligrosidad) {
		super(vDni, vNombre, vSexo, numSS, salario);
		this.setPeligrosidad(peligrosidad);
	}
	public Peligrosidad getPeligrosidad() {
		return peligrosidad;
	}
	public void setPeligrosidad(Peligrosidad peligrosidad) {
		this.peligrosidad = peligrosidad;
	}
	public double subirSalario() {
		if(this.peligrosidad==Peligrosidad.alta) {
			this.salario = this.salario * 1.30;
		} 
		else if(this.peligrosidad==Peligrosidad.media) {
			this.salario = this.salario * 1.20;
		}
		else if(this.peligrosidad==Peligrosidad.baja) {
			this.salario = this.salario * 1.10;
		}
		return this.salario;
	} //hola
}
