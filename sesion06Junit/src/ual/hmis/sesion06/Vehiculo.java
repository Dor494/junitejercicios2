package ual.hmis.sesion06;

public class Vehiculo {

	private int numPasajeros;
	private int numRuedas;
	private double pesoVehiculo;
	
	public int getNumPasajeros() {
		return numPasajeros;
	}
	
	public void setNumPasajeros(int pasajeros){
		this.numPasajeros = pasajeros;
	}
	
	public int getNumRuedas() {
		return numRuedas;
	}
	
	public void setNumRuedas(int ruedas){
		this.numRuedas = ruedas;
	}
	
	public double getPesoVehiculo() {
		return pesoVehiculo;
	}
	
	public void setPesoVehiculo(double peso){
		this.pesoVehiculo = peso;
	}
}
