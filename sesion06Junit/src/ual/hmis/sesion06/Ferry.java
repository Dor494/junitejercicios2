package ual.hmis.sesion06;

import java.util.ArrayList;

public class Ferry {

	private int maxNumPasajeros;
	private int maxNumVehiculos;
	private double maxPesoVehiculos;
	private int numTotalPasajeros;
	private int numTotalVehiculos;
	private double pesoTotalVehiculos;
	private ArrayList<Vehiculo> Vehiculos = new ArrayList<Vehiculo>();
	
	public void setMaxNumPasajeros(int pasajeros) {
		this.maxNumPasajeros = pasajeros;
	}
	
	public void setMaxNumVehiculos(int vehiculos) {
		this.maxNumVehiculos = vehiculos;
	}
	
	public void setMaxPesoVehiculos(int pesos) {
		this.maxPesoVehiculos = pesos;
	}
	
	public boolean embarcarVehiculo(Vehiculo v) {
		numTotalPasajeros += v.getNumPasajeros();
		if(numTotalPasajeros > maxNumPasajeros)
			return false;
		numTotalVehiculos++;
		if(superadoMaximoVehiculos())
			return false;
		pesoTotalVehiculos += v.getPesoVehiculo();
		if(superadoMaximoPeso())
			return false;
		Vehiculos.add(v);
		return true;
	}
	
	public int totalVehiculos() {
		return numTotalVehiculos;
	}
	
	public boolean vacio() {
		return Vehiculos.isEmpty();
	}
	
	public boolean superadoMaximoVehiculos() {
		if(totalVehiculos() > maxNumVehiculos) {
			return true;
		}
		return false;
	}
	
	public boolean superadoMaximoPeso() {
		if(pesoTotalVehiculos > maxPesoVehiculos) {
			return true;
		}
		return false;
	}
}
