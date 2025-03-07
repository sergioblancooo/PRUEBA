package principal;

import clases.Tipo;
import java.util.Scanner;
import clases.Conversion;
import clases.ConversionConParametros;
import clases.EntradaPorTeclado;
import clases.Matematicas;
import poo.Persona;

public class Inicio {
	public static void main(String[] args) {
		/*System.out.println("HOLA");*/
		Tipo tipo = new Tipo();
		tipo.definicionCadena();
		/*tipo.definicionTipos();
		tipo.definicionBooleano();
		tipo.definicionShort();
		tipo.definicionTipoConClases();
		tipo.definicionEnumeraciones();*/
		//tipo.definicionFecha();
		
		/*Conversion conversion = new Conversion();
		conversion.deEnteroADouble();
		conversion.deEnteroALong();
		conversion.deLongAEntero();
		conversion.deShortAEntero();
		conversion.deEnteroAShort();
		conversion.deStringAEntero();
		conversion.deEnteroAString();
		conversion.deCharAString();
		conversion.deStringAChar();
		conversion.deStringADouble();
		conversion.deDoubleAString();
		conversion.deStringAFloat();
		conversion.deFloatAString();
		conversion.deBooleanoAString();
		conversion.deStringABooleano();*/
		
		
		//ConversionConParametros convPar = new ConversionConParametros();
		Scanner scanner = new Scanner(System.in);
		
		EntradaPorTeclado entrada = new EntradaPorTeclado();
		/*entrada.deFloatAString(scanner, convPar);
		entrada.deLongAEntero(scanner, convPar);
		entrada.deStringABooleano(scanner, convPar);*/
		
		Matematicas mate = new Matematicas();
		//entrada.suma(scanner, mate);
		//entrada.division(scanner, mate);
		
		//EJERCICIO 1: POSITIVO O NEGATIVO
		//entrada.posit(scanner,mate);
		
		//EJERCICIO 2: MÚLTIPLO DE OTRO
		//entrada.multiplos(scanner, mate);
		
		//EJERCICIO 3: ORDENAR DE MAYOR A MENOR
		//entrada.mayorAMenor(scanner, mate);
		
		//EJERCICIO 4: MOSTRAR AL REVÉS
		//entrada.alReves(scanner, mate);
		
		//EJERCICIO 5: NOTA
		//entrada.notas(scanner, mate);
		
		//EJERCICIO 6: CAPICÚA
		//entrada.capicua(scanner,mate);
		
		/*POO
		Persona messi = new Persona("111111");
		messi.setNombre("Leo Messi");
		System.out.println("Nombre y dni de Messi: "+messi.getNombre()+" "+messi.getDni());
		
		Persona bicho = new Persona("121212", "cr7");
		System.out.println("Nombre y dni del bicho: "+bicho.getNombre()+" "+bicho.getDni());
		
		/*Llamar entradaPersona con sexo*/
		//entrada.entradaPersona(scanner);
		//entrada.entradaTrabajador(scanner);
		//entrada.entradaMedico(scanner);
		//entrada.entradaMedicos(scanner);
		//entrada.entradaBombero(scanner);
	}
}