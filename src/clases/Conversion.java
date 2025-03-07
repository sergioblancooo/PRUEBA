package clases;

public class Conversion {
	public void deEnteroADouble() {
		System.out.println("De entero a doble");
		}
	public void deEnteroALong() {
		int entero = 5678;
		long enteroLong = entero;
		System.out.println("Entero long: "+enteroLong);
	}
	//conversion implicita de menor a mayor
		
	public void deLongAEntero() {
		long largo = 767469;
		int LongEntero = (int)largo;
		System.out.println("Long entero: "+LongEntero);
	}
	//conversion explicita de mayor a menor
		
	public void deEnteroAShort() {
		int entero2 = 3;
		short intShort = (short)entero2;
		System.out.println("Entero short: "+intShort);
	}
	//conversion explicita de mayor a menor
	
	public void deShortAEntero() {
		short pequeño = 1;
		int intShort = pequeño;
		System.out.println("Short entero: "+intShort);
	}
	//conversion implicita de menor a mayor
	
	public void deStringAEntero() {
		int numero = 0;
		String cadena ="900";
		int entero = Integer.valueOf(cadena);
		System.out.println("De cadena a entero: "+entero);
		numero = entero + 1;
		System.out.println("La suma es: "+numero);
	}
	public void deEnteroAString() {
		int ent = 20;
		String cadena = String.valueOf(ent);
		System.out.println("De entero a cadena: "+ cadena);
	}
	public void deCharAString() {
		char car = 'A';
		String cadena = String.valueOf(car);
		System.out.println("De char a cadena: "+cadena);
	}
	public void deStringAChar() {
		String cadena = "Asad";
		char car = cadena.charAt(1);
		System.out.println("String a char: " +car);
	}
	public void deStringADouble() {
		String cadena = "1.23";
		double decimal = Double.valueOf(cadena);
		System.out.println("De cadena a decimal: "+decimal);
	}
	public void deDoubleAString() {
		double doble = 1.23;
		String cadena = String.valueOf(doble);
		System.out.println("De decimal a string: "+cadena);
	}
	public void deStringAFloat() {
		String cadena = "1.23";
		float flota = Float.valueOf(cadena);
		//float flota = Float.parseFloat(cadena);
		System.out.println("De string a float: "+flota);
	}
	public void deFloatAString() {
		float flota = 1.23f;
		String cadena = String.valueOf(flota);
		//String cadena = Float.toString(flota);
		System.out.println("De float a string: "+cadena);
	}
	public void deStringABooleano() {
		String cadena = "true";
		//boolean bool = Boolean.valueOf(cadena);
		boolean bool = Boolean.parseBoolean(cadena);
		System.out.println("De string a booleano: "+bool);
	}
	public void deBooleanoAString() {
		boolean bool = true;
		//String cadena = String.valueOf(bool);
		String cadena = Boolean.toString(bool);
		System.out.println("De booleano a string: "+cadena);
	}
}

