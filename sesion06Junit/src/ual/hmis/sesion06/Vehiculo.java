package ual.hmis.sesion06;

/**
 * @author Danielor
 */

public class Vehiculo {

	/** Numero de pasajeros. */
	private int numPasajeros;
	/** Numero de ruedas. */
	private int numRuedas;
	/** Peso del vehiculo. */
	private double pesoVehiculo;

	/**
	 * Devuelve numero de pasajeros.
	 * @return numPasajeros
	 */
	public int getNumPasajeros() {
		return numPasajeros;
	}

	/**
	 * Cambia el numero de pasajeros.
	 * @param pasajeros
	 */
	public void setNumPasajeros(final int pasajeros) {
		this.numPasajeros = pasajeros;
	}

	/**
	 * Devuelve numero de ruedas.
	 * @return numRuedas
	 */
	public int getNumRuedas() {
		return numRuedas;
	}

	/**
	 * Cambia el numero de ruedas.
	 * @param ruedas
	 */
	public void setNumRuedas(final int ruedas) {
		this.numRuedas = ruedas;
	}

	/**
	 * Devuelve peso del vehiculo.
	 * @return pesoVehiculo
	 */
	public double getPesoVehiculo() {
		return pesoVehiculo;
	}

	/**
	 * Cambia el peso del vehiculo.
	 * @param peso
	 */
	public void setPesoVehiculo(final double peso) {
		this.pesoVehiculo = peso;
	}
}
