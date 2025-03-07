package poo;

import clases.Especialidad;
import clases.Sexo;

public class CopiaMedico extends Trabajador{
	private String nColegiado;
	private String colorBata;
	private Especialidad especialidad;
	private Double horasTrabajadas;
	private Double eurosPorHora;
	
	/*CONSTRUCTORES*/
	public CopiaMedico(String vDni, String vNombre, Sexo vSexo, String numSS, double salario, String nColegiado, String colorBata, Especialidad especialidad) {
		super(vDni,vNombre,vSexo, numSS, salario);
		this.setNColegiado(nColegiado);
		this.setColorBata(colorBata);
		this.setEspecialidad(especialidad);
		//this.setHorasTrabajadas(horasTrabajadas);
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
	public void setHorasTrabajadas(Double horasTrabajadas) {
		if(horasTrabajadas>=0) {
			this.horasTrabajadas = horasTrabajadas;
		}
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
	public Double calcularSalario() {
		this.salario = this.horasTrabajadas * this.eurosPorHora;
		return this.salario;
	}
	public Double getEurosPorHora() {
		return this.eurosPorHora;
	}
	public Double getHorasTrabajadas() {
		return this.horasTrabajadas;
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
	public String toString() {
		return "Dni: "+this.getDni()+", Nombre: "+super.getNombre()+", sexo: "+this.getSexo()+", numSS: "+this.getNumSS()+", salario: "+this.getSalario()+", numero de colegiado: "+this.getNColegiado()+", color de bata: "+this.getColorBata()+", especialidad: "+this.getEspecialidad();
	}
}
