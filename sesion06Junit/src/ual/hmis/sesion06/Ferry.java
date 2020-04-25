package ual.hmis.sesion06;

import java.util.ArrayList;

/**
 * @author Danielor
 */

public class Ferry {

	/** Numero maximo de pasajeros. */
	private int maxNumPasajeros;
	/** Numero maximo de vehiculos. */
	private int maxNumVehiculos;
	/** Peso maximo de vehiculos. */
	private double maxPesoVehiculos;
	/** Numero total de pasajeros. */
	private int numTotalPasajeros;
	/** Numero total de vehiculos. */
	private int numTotalVehiculos;
	/** Peso total de vehiculos. */
	private double pesoTotalVehiculos;
	/** Contenedor de vehiculos. */
	private ArrayList<Vehiculo> vehiculos = new ArrayList<Vehiculo>();

	/**
	 * Cambia maxNumPasajeros.
	 * @param pasajeros
	 */
	public void setMaxNumPasajeros(final int pasajeros) {
		this.maxNumPasajeros = pasajeros;
	}

	/**
	 * Cambia maxNumVehiculos.
	 * @param vehiculo
	 */
	public void setMaxNumVehiculos(final int vehiculo) {
		this.maxNumVehiculos = vehiculo;
	}

	/**
	 * Cambia maxPesoVehiculos.
	 * @param pesos
	 */
	public void setMaxPesoVehiculos(final int pesos) {
		this.maxPesoVehiculos = pesos;
	}

	/**
	 * Metodo que embarca un vehiculo.
	 * @param v
	 * @return true o false
	 */
	public boolean embarcarVehiculo(final Vehiculo v) {
		numTotalPasajeros += v.getNumPasajeros();
		if (numTotalPasajeros > maxNumPasajeros) {
			return false;
		}
		numTotalVehiculos++;
		if (superadoMaximoVehiculos()) {
			return false;
		}
		pesoTotalVehiculos += v.getPesoVehiculo();
		if (superadoMaximoPeso()) {
			return false;
		}
		vehiculos.add(v);
		return true;
	}

	/**
	 * Devuelve total de vehiculos.
	 * @return numTotalVehiculos
	 */
	public int totalVehiculos() {
		return numTotalVehiculos;
	}

	/**
	 * Devuelve si no hay vehiculos.
	 * @return true o false
	 */
	public boolean vacio() {
		return vehiculos.isEmpty();
	}

	/**
	 * Comprueba si hay demasidos vehiculos.
	 * @return true o false
	 */
	public boolean superadoMaximoVehiculos() {
		if (totalVehiculos() > maxNumVehiculos) {
			return true;
		}
		return false;
	}

	/**
	 * Comprueba si hay demasido peso.
	 * @return true o false
	 */
	public boolean superadoMaximoPeso() {
		if (pesoTotalVehiculos > maxPesoVehiculos) {
			return true;
		}
		return false;
	}
}
