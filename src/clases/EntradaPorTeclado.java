package clases;

import java.util.Scanner;

import poo.Bombero;
import poo.Medico;
import poo.Peligrosidad;
import poo.Persona;
import poo.Trabajador;

public class EntradaPorTeclado {
	public void deLongAEntero(Scanner scanner, ConversionConParametros convPar) {
		System.out.println("Introduce un número");
		long longTecleado = scanner.nextLong();
		int entero = convPar.deLongAEntero(longTecleado);
		System.out.println(entero);
		
	}
	public void entradaPersona(Scanner scanner) {
		System.out.println("Teclea el DNI: ");
		String vDni = scanner.next();
		System.out.println("Teclea el nombre: ");
		String vNombre = scanner.next();
		Persona p = new Persona(vDni,vNombre);
		/*En este caso el sexo será femenino*/
		p.setSexo(Sexo.Femenino);
		System.out.println("Teclea el nombre: "+p.getNombre());
		System.out.println("Entrada Persona con sexo: "+p.getDni()+" "+p.getSexo());
	}
	public void entradaTrabajador(Scanner scanner) {
		System.out.println("Teclea el DNI: ");
		String vDni = scanner.next();
		System.out.println("Teclea el nombre: ");
		String vNombre = scanner.next();
		System.out.println("Teclea el numSS: ");
		String numSS = scanner.next();
		System.out.println("Teclea el salario: ");
		Double salario = scanner.nextDouble();
		System.out.println("Teclea el sexo (Masculino/Femenino): ");
		String sex = scanner.next();
		Sexo vSexo;
		vSexo = Sexo.valueOf(sex);
		Trabajador t = new Trabajador(vDni, vNombre, vSexo, numSS,salario);
		//System.out.println("Datos tecleados: "+t.getNombre()+" "+t.getDni()+" "+t.getSexo()+" "+t.getNumSS()+" "+t.getSalario());
		System.out.println(t.toString()); 
	}
	public void entradaMedico(Scanner scanner) {
		System.out.println("Teclea el DNI: ");
		String vDni = scanner.next();
		System.out.println("Teclea el nombre: ");
		String vNombre = scanner.next();
		System.out.println("Teclea el numSS: ");
		String numSS = scanner.next();
		System.out.println("Teclea el salario: ");
		Double salario = scanner.nextDouble();
		System.out.println("Teclea el sexo (Masculino/Femenino): ");
		String sex = scanner.next();
		Sexo vSexo;
		vSexo = Sexo.valueOf(sex);
		System.out.println("Teclea el número de colegiado: ");
		String nColegiado = scanner.next();
		System.out.println("Teclea el color de la bata: ");
		String colorBata = scanner.next();
		System.out.println("Teclea la especialidad: ");
		String esp = scanner.next();
		Especialidad especialidad;
		especialidad = Especialidad.valueOf(esp);
		System.out.println("Teclea las horas trabajadas: ");
		//Double horasTrabajadas = scanner.nextDouble();
		Medico m = new Medico(vDni, vNombre, vSexo, numSS, salario, nColegiado, colorBata, especialidad);
		//System.out.println("Datos tecleados: "+t.getNombre()+" "+t.getDni()+" "+t.getSexo()+" "+t.getNumSS()+" "+t.getSalario());
		System.out.println(m.toString()); 
	}
	public void entradaMedicos(Scanner scanner) {
		Medico joaquin = new Medico("111","Joaquin",Sexo.Masculino,"121221",0,"12","azul",Especialidad.Ginecología);
		joaquin.setHorasTrabajadas(40.0);
		joaquin.calcularSalario();
		ClasificacionSalario clasif = joaquin.clasificarSalario();
		joaquin.subirSalario(clasif);
		System.out.println("Salario de joaquin: "+joaquin.getSalario()+ ". Clasificación del salario: "+joaquin.clasificarSalario());
		
		Medico pepe = new Medico("111","pepe",Sexo.Masculino,"12121",0,"11","azul",Especialidad.Pediatría);
		//pepe.setHorasTrabajadas(40.0);
		//pepe.calcularSalario(0);
		//calcularSalario() con el método sobreescrito
		pepe.calcularSalario(40.0);
		System.out.println("Salario de pepe: "+pepe.getSalario()+ ". Clasificación del salario: "+pepe.clasificarSalario());
		
		Medico juan = new Medico("1311","juan",Sexo.Masculino,"1221",0,"10","azul",Especialidad.Podología);
		//juan.setHorasTrabajadas(40.0);
		juan.calcularSalario(40.0);
		System.out.println("Salario de juan: "+juan.getSalario()+ ". Clasificación del salario: "+juan.clasificarSalario());
	}
	
	public void entradaBombero(Scanner scanner) {
		Bombero juan = new Bombero("111","Bombero",Sexo.Masculino,"121221",1200.0,Peligrosidad.alta);
		System.out.println("Salario de Juan, bombero con peligrosidad alta: "+juan.subirSalario()+"€");
		
		Bombero pepe = new Bombero("111","Bombero",Sexo.Masculino,"121221",1200.0,Peligrosidad.media);
		System.out.println("Salario de Pepe, bombero con peligrosidad media: "+pepe.subirSalario()+"€");
		
		Bombero luis = new Bombero("111","Bombero",Sexo.Masculino,"121221",1200.0,Peligrosidad.baja);
		System.out.println("Salario de Luis, bombero con peligrosidad baja: "+luis.subirSalario()+"€");
	}
	
	public void deStringABooleano(Scanner scanner, ConversionConParametros convPar) {
		System.out.println("Introduce una cadena");
		String stringTecleado = scanner.next();
		boolean bool = convPar.deStringABooleano(stringTecleado);
		System.out.println(bool);
	}
	public void deFloatAString(Scanner scanner, ConversionConParametros convPar) {
		System.out.println("Introduce un float");
		Float floatTecleado = scanner.nextFloat();
		String cadena = convPar.deFloatAString(floatTecleado);
		System.out.println(cadena);
	}
	public void suma(Scanner scanner, Matematicas mate) {
		System.out.println("SUMA: ");
		System.out.println("Teclea el primer número: ");
		int x = scanner.nextInt();
		System.out.println("Teclea el segundo número: ");
		long y = scanner.nextLong();
		long resultadoSuma = mate.sumar(x, y);
		System.out.println("Resultado: "+resultadoSuma);
	}
	public void division(Scanner scanner, Matematicas mate) {
		System.out.println("DIVISIÓN: ");
		System.out.println("Teclea el primer número: ");
		float x = scanner.nextInt();
		System.out.println("Teclea el segundo número: ");
		float y = scanner.nextLong();
		float resultadoDivision = mate.dividir(x, y);
		System.out.println("Resultado: "+resultadoDivision);
	}
	public void posit(Scanner scanner, Matematicas mate) {
		System.out.println("POSITIVO O NEGATIVO: ");
		System.out.println("Teclea el número: ");
		float x = scanner.nextFloat();
		if(x<0) {
			System.out.println(x+" es un número negativo.");
		}
		else {
			System.out.println(x+" es un número positivo.");
		}
	}
	public void multiplos(Scanner scanner, Matematicas mate) {
		System.out.println("Múltiplos: ");
		System.out.println("Teclea el primer número: ");
		int x = scanner.nextInt();
		System.out.println("Teclea el segundo número: ");
		int y = scanner.nextInt();
		if(x%y==0) {
			System.out.println(x+" es múltiplo de "+y);
		}
		else if(y%x==0){
			System.out.println(y+" es múltiplo de "+x);
		}
		else {
			System.out.println(x+" y "+y+" no son múltiplos.");
		}
	}
	public void mayorAMenor(Scanner scanner, Matematicas mate) {
		System.out.println("De mayor a menor: ");
		System.out.println("Teclea el primer número: ");
		int x = scanner.nextInt();
		System.out.println("Teclea el segundo número: ");
		int y = scanner.nextInt();
		System.out.println("Teclea el tercer número: ");
		int z = scanner.nextInt();
		if (z==y || z==x || x==y) {
			System.out.println("Todos los números deben ser distintos");
		}
		else if(x>y && x>z) {
			if(y>z) {
				System.out.println("De mayor a menor: "+x+" "+y+" "+z);
			}
			else {
				System.out.println("De mayor a menor: "+x+" "+z+" "+y);
			}
		} else if(y>x && y>z) {
			if(x>z) {
				System.out.println("De mayor a menor: "+y+" "+x+" "+z);
			}
			else {
				System.out.println("De mayor a menor: "+y+" "+z+" "+x);
			}
		} else if(z>y && z>x) {
			if(y>x) {
				System.out.println("De mayor a menor: "+z+" "+y+" "+x);
			}
			else {
				System.out.println("De mayor a menor: "+z+" "+x+" "+y);
			}
		} 
	}
	public void alReves(Scanner scanner, Matematicas mate) {
		System.out.println("Al revés: ");
		System.out.println("Teclea el número: ");
		int x = scanner.nextInt();
		if(x>=0 && x<=9999) {
			String invertido = new StringBuilder(String.valueOf(x)).reverse().toString();
			System.out.println(invertido);
		}
	}
	public void notas(Scanner scanner,Matematicas mate) {
		System.out.println("Notas: ");
		System.out.println("Teclea la nota: ");
		float x = scanner.nextFloat();
		if(x<5) {
			System.out.println("Insuficiente");
		}else if(x<6 && x>=5){
			System.out.println("Suficiente");
		}else if(x<7 && x>=6){
			System.out.println("Bien");
		}else if(x<9 && x>=7){
			System.out.println("Notable");
		}else if(x<=10 && x>=9){
			System.out.println("Sobresaliente");
		}else {
			System.out.println("La nota debe ir entre 0 y 10");
		}
	}
	public void capicua(Scanner scanner, Matematicas mate) {
		System.out.println("Capicúa: ");
		System.out.println("Teclea el número: ");
		int x = scanner.nextInt();
		if(x>=0 && x<=9999) {
			String invertido = new StringBuilder(String.valueOf(x)).reverse().toString();
			int invertidoInt = Integer.valueOf(invertido);
			if(x==invertidoInt) {
				System.out.println(x+" es un número capicúa.");
			}
			else {
				System.out.println(x+" no es capicúa");
			}
		} else {
			System.out.println("El número debe estar entre 0 y 9999");
		}
	}
}
