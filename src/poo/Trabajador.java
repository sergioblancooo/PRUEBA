package poo;

import clases.ClasificacionSalario;
import clases.Sexo;

public class Trabajador extends Persona{
	String numSS;
	double salario;
	ClasificacionSalario cSalario;
	protected Double horasTrabajadas;
	protected Double eurosPorHora;
	
	/*CONSTRUCTORES*/
	public Trabajador(String vDni, String vNombre, Sexo vSexo, String numSS, double salario) {
		super(vDni,vNombre,vSexo);
		this.setNumSS(numSS);
		this.setSalario(salario);
	}
	
	/*SET/GET*/
	public void setNumSS(String numSS) {
		this.numSS = numSS;
	}
	public String getNumSS() {
		return this.numSS;
	}
	public void setSalario(double salario) {
		if (this.salario < 0) {
			System.out.println("No puede haber un sueldo negativo");
		}
		else{
			this.salario = salario;
		}
	}
	public double getSalario() {
		return this.salario;
	}
	public ClasificacionSalario clasificarSalario() {
		if (this.salario < 1200.0) {
			this.cSalario = ClasificacionSalario.bajo;
		}
		else if (this.salario >= 1200.0 && this.salario <= 2000.0){
			this.cSalario = ClasificacionSalario.medio;
		}
		else if (this.salario > 2000.0 && this.salario <= 4000.0){
			this.cSalario = ClasificacionSalario.alto;
		}
		else {
			this.cSalario = ClasificacionSalario.muyAlto;
		}
		return this.cSalario;
	}
	public void setClasificacionSalario(ClasificacionSalario cSalario) {
		this.setClasificacionSalario(cSalario);
	}
	public ClasificacionSalario getClasificacionSalario() {
		return this.cSalario;
	}
	public String toString() {
		return "Dni: "+this.getDni()+", Nombre: "+super.getNombre()+", sexo: "+this.getSexo()+", numSS: "+this.getNumSS()+", salario: "+this.getSalario();
	}
	public void subirSalario(ClasificacionSalario clasif) {
		if(clasif == ClasificacionSalario.medio) {
			this.salario=this.salario + 10;
		}
	}
	public Double calcularSalario() {
		this.salario = this.horasTrabajadas * this.eurosPorHora;
		return this.salario;
	}
	public void setEurosPorHora(Double euros) {
		if(euros>=0) {
			this.eurosPorHora=euros;
		}
	}
	public Double getEurosPorHora() {
		return this.eurosPorHora;
	}
	public void setHorasTrabajadas(Double horasTrabajadas) {
		if(horasTrabajadas>=0) {
			this.horasTrabajadas = horasTrabajadas;
		}
	}
	public Double getHorasTrabajadas() {
		return this.horasTrabajadas;
	}
}
