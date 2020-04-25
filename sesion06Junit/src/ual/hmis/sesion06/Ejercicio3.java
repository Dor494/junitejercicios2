package ual.hmis.sesion06;

/**
 * @author Danielor
 */

public class Ejercicio3 {

	/**
	 * Metodo que crea una cadena de *.
	 * @param x
	 * @return cadena de *
	 */
	public String cadena(final int x) {
		final int cinco = 5;
		final int doce = 12;
		String cadena = "";
		if (x < 0) {
			cadena = "numero erroneo";
		} else if (x < cinco) {
			cadena = "*****";
		} else if (x > doce) {
			cadena = "************";
		} else {
			for (int i = 1; i <= x; i++) {
				cadena += "*";
			}
		}
		return cadena;
	}
}
