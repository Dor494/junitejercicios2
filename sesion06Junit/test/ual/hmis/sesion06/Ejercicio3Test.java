package ual.hmis.sesion06;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

class Ejercicio3Test {

	@CsvSource({
		"-1,numero erroneo",
		"4,*****",
		"14,************",
		"8,********"})
	
	@ParameterizedTest(name = "Prueba {index} => Con valor {0} salen {1}")
	void testCadena_parametrized(int x, String cadena) {
		// Arrange
		Ejercicio3 e3 = new Ejercicio3();
		// Act
		// Assert
		assertEquals(cadena, e3.cadena(x));
	}
}
