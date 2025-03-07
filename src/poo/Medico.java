package poo;

import clases.Especialidad;
import clases.Sexo;

public class Medico extends Trabajador{
	private String nColegiado;
	private String colorBata;
	private Especialidad especialidad;
	
	/*CONSTRUCTORES*/
	public Medico(String vDni, String vNombre, Sexo vSexo, String numSS, double salario, String nColegiado, String colorBata, Especialidad especialidad) {
		super(vDni,vNombre,vSexo, numSS, salario);
		this.setNColegiado(nColegiado);
		this.setColorBata(colorBata);
		this.setEspecialidad(especialidad);
		this.setEurosPorHora();
	}
	
	/*SET/GET*/
	public void setNColegiado(String nColegiado) {
		this.nColegiado = nColegiado;
	}
	public void setColorBata(String colorBata) {
		this.colorBata = colorBata;
	}
	public void setEspecialidad(Especialidad especialidad) {
		this.especialidad = especialidad;
	}
	public void setEurosPorHora() {
		if (this.especialidad==Especialidad.Ginecología) {
			this.eurosPorHora=30.0;
		}
		else if (this.especialidad==Especialidad.Pediatría) {
			this.eurosPorHora=32.5;
		}
		else {
			this.eurosPorHora=20.0;
		}
	}
	@Override
	public Double calcularSalario() {
		this.setEurosPorHora();
		return super.calcularSalario();
	}
	//sobrecarga de método para que pueda entrar las horas por teclado
	public Double calcularSalario(double numHoras) {
		this.setHorasTrabajadas(numHoras);
		this.setEurosPorHora();
		return super.calcularSalario();
	}
	public Especialidad getEspecialidad() {
		return this.especialidad;
	}
	public String getNColegiado() {
		return this.nColegiado;
	}
	public String getColorBata() {
		return this.colorBata;
	}
}
