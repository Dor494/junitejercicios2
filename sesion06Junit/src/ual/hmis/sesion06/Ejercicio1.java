package ual.hmis.sesion06;

/**
 * @author Danielor
 */

public class Ejercicio1 {

/**
* Clase que tranforma los numeros.
* @param x
* @return resultado
*/
	public int transformar(final int x) {
		final int tres = 3;
		final int cinco = 5;
		int resultado = 0;
		if (x % 2 == 0) {
			resultado = transformar(x / 2);
			} else if (x % tres == 0) {
				resultado = transformar(x / tres);
				} else if (x % cinco == 0) {
					resultado = transformar(x / cinco);
					} else {
						return x;
						}
		return resultado;
	}
}
