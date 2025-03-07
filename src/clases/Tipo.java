package clases;

import java.time.Duration;
import java.time.LocalDate;
import java.time.LocalTime;
import java.time.Period;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;


public class Tipo {
	
	public void definicionTipos() {
		int edad = 12;
		System.out.println("Edad: "+edad);
		String cadena ="Esto es una cadena";
		System.out.println("Cadena: "+cadena);
		char caracter= 'A';
		System.out.println("Carácter: "+caracter);
	}
	public void definicionBooleano() {
		boolean booleano = true;
		System.out.println("Booleano: "+booleano);
		Double decimal=222.1;
		boolean booleano1=decimal.isNaN();
		boolean booleano2=(decimal>=0);
		System.out.println("Definición de booleano");
	}
	public void definicionShort() {
		short corto = 50;
		System.out.println("Short: "+corto);
	}
	public void definicionTipoConClases() {
		int entero = 0;
		Integer ent = 0;
		Double decimal=0.0;
		System.out.println("Compruebo decimal: "+decimal.isNaN());
	}

	public void definicionConstantes(){
		final double PI = 3.14;
	}
	
	public void definicionEnumeraciones() {
		enum DiasSemana{
			Lunes, Martes, Miércoles, Jueves, Viernes, Sábado, Domingo
		}
		DiasSemana diasSemana = DiasSemana.Lunes;
		String diaSemana = DiasSemana.Lunes.toString();
		//String diaSemana = diasSemana.toString();
		System.out.println("defnicionENumeraciones: "+diasSemana+" to.String: "+diaSemana);
	}
	public void definicionFecha() {
		LocalDate fecha = LocalDate.now();
		//System.out.println(fecha);
		LocalDate fechaNuestra = LocalDate.of(2024, 7, 19);
		//System.out.println(fechaNuestra);
		
		int año = fecha.getYear();
		int mes = fecha.getMonthValue();
		int dia = fecha.getDayOfMonth();
		System.out.println("Día, mes y año de hoy: "+dia+", "+mes+", "+año);
		LocalDate mañana = fecha.plusDays(1);
		System.out.println("Mañana: "+mañana);
		LocalDate ayer = fecha.minusDays(1);
		System.out.println("Ayer: "+ayer);
		boolean posterior = fechaNuestra.isAfter(fecha);
		System.out.println("FechaNuestra es posterior a Fecha?: "+posterior);
		boolean anterior = fechaNuestra.isBefore(fecha);
		System.out.println("FechaNuestra es anterior a Fecha?: "+anterior);
		//diferencias entre fechas
		Period period = Period.between(fechaNuestra, fecha);
		System.out.println("Diferencia de años entre dos fechas: "+period.getYears());
		System.out.println("Diferencia de meses entre dos fechas: "+period.getMonths());
		System.out.println("Diferencia de días entre dos fechas: "+period.getDays());
		//until
		Period hasta = fechaNuestra.until(fecha);
		System.out.println("Periodo until: "+hasta.getYears());
		//duration
		Duration duration = Duration.between(LocalTime.now(), LocalTime.now().minusMinutes(25679));
		System.out.println("Duration: "+duration.toMinutes());
		
		//DateTimeFormatter
		DateTimeFormatter formato = DateTimeFormatter.ofPattern("dd/MM/yyyy");
		String fechaFormateada = fechaNuestra.format(formato);
		System.out.println(fechaFormateada);
		
		LocalDate fechaFormateada2 = LocalDate.parse("10/01/2024", formato);
		System.out.println(fechaFormateada2);
		
		//chronounit
		long diferenciaDias = ChronoUnit.DAYS.between(fechaNuestra, fecha);
		System.out.println("ChronoUnit, diferencia de días: "+diferenciaDias);
		
		//Formatos fecha
		
	}
	public void definicionCadena() {
		String cadena = "esto es un proceso";
		//EQUALS
		boolean result = cadena.equals("Esto");
		System.out.println("Resultado del equals: "+result);
		//EqualsIgnoreCase
		boolean result2 = cadena.equalsIgnoreCase("Esto");
		System.out.println("Resultado del equalsIgnoreCase: "+result2);
		//length()
		System.out.println("La longitud de la cadena es: "+cadena.length());
		//lastIndexOf
		int result3 = cadena.lastIndexOf("o");
		System.out.println("Resultado del equalsIgnoreCase: "+result3);
		//startswith, endwith
		System.out.println("La longitud de la cadena es: "+cadena.startsWith("e"));
		//subcadenas
		System.out.println("Subcadena: "+cadena.substring(5));
		System.out.println("Subcadena: "+cadena.substring(5, 8));
		//uppercase -> mayúsculas
		System.out.println("A mayúsculas: "+cadena.toUpperCase());
		String split = "Hola, que tal, adios";
		String[] cadenas = split.split(",");
		for (String c:cadenas) {
			System.out.println(c);
		}
	}
}
