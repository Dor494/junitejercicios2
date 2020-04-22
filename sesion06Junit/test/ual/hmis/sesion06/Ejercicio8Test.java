package ual.hmis.sesion06;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

class Ejercicio8Test {

	@CsvSource({
		"1,4,100,true",
		"6,4,100,false",
		"2,2,1200,false"})
	
	@ParameterizedTest(name = "Prueba {index} => Con pasajero {0}, numero de ruedas {1} y peso del vehiculo {2} sale {3}")
	void testCompararCadenas_parametrized(int pasajeros, int ruedas, double peso, boolean resultado) {
		Vehiculo v = new Vehiculo();
		v.setNumPasajeros(pasajeros);
		v.setNumRuedas(ruedas);
		assertEquals(ruedas,v.getNumRuedas());
		v.setPesoVehiculo(peso);
		
		Ferry f = new Ferry();
		f.setMaxNumPasajeros(5);
		f.setMaxNumVehiculos(1);
		f.setMaxPesoVehiculos(1000);
		assertTrue(f.vacio());
		
		assertEquals(resultado, f.embarcarVehiculo(v));
		
		Vehiculo v2 = new Vehiculo();
		v.setNumPasajeros(1);
		v.setNumRuedas(2);
		v.setPesoVehiculo(200);
		assertFalse(f.embarcarVehiculo(v2));
	}

}
