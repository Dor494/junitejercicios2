package ual.hmis.sesion06;

/**
 * @author Danielor
 */

public class Ejercicio4 {

	/**
	 * Metodo que compara cadenas.
	 * @param cadenaA
	 * @param cadenaB
	 * @return cadena resultante
	 */
	public String compararCadenas(final String cadenaA,
			final String cadenaB) {
		String cadenaC = "";
		if (cadenaA.equals(cadenaB)) {
			return cadenaB;
		} else {
			for (int i = 0; i < cadenaA.length(); i++) {
				for (int j = 0; j < cadenaB.length(); j++) {
					if (cadenaA.charAt(i) == cadenaB.charAt(j)) {
						cadenaC += cadenaA.charAt(i);
					}
				}
			}
		}
		return cadenaC;
	}
}
