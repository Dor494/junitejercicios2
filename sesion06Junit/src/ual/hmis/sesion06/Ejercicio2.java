package ual.hmis.sesion06;

/**
 * @author Danielor
 */

public class Ejercicio2 {

	/**
	 * Variable que especifica los requisitos.
	 */
	private String requisitosPassword =
			"(?=.*[0-9])(?=.*[a-z])(?=.*[A-Z]).{3,}";

	/**
	 * Metodo para loguearse.
	 * @param username
	 * @param password
	 * @return true o false
	 */
	public boolean login(final String username, final String password) {
		final int treinta = 30;
		// comprobar que sean distintos de vacio
		if (username.isEmpty() || password.isEmpty()) {
			return false;
		}
		// comprobar que la longitud sea < 30
		if (username.length() >= treinta
				|| password.length() >= treinta) {
			return false;
		}
		// comprobar que la password contiene una mayuscula,
		// una minuscula y un numero
		if (!password.matches(requisitosPassword)) {
			return false;
		}
		// llamar al método de la bbdd
		return compruebaLoginEnBD(username, password);

	}

	/**
	 * Metodo que comprueba el login.
	 * @param username
	 * @param password
	 * @return true o false
	 */
	public boolean compruebaLoginEnBD(final String username,
			final String password) {
		// método mock (simulado)
		if (username.equals("user") && password.equals("Pass1")) {
			return true;
		}
		return false;
	}
}
