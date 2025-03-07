package clases;

public class ConversionConParametros {
	public int deLongAEntero(long enteroLong) {
		int entero = (int)enteroLong;
		return entero;
	}
	public boolean deStringABooleano(String stringBool) {
		boolean bool = Boolean.parseBoolean(stringBool);
		return bool;
	}
	public String deFloatAString(Float floatString) {
		String cadena = String.valueOf(floatString);
		return cadena;
	}
}
