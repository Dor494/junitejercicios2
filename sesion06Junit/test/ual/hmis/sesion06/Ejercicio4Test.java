package ual.hmis.sesion06;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

class Ejercicio4Test {

	@CsvSource({
		"hola,hola,hola",
		"hola,aloh,hola",
		"hello,hola,hllo",
		"yo,tu,''",
		"'','',''",
		"'',hola,''",
		"hola,'',''"})
	
	@ParameterizedTest(name = "Prueba {index} => Con cadena {0} y cadena {1} coinciden {2}")
	void testCompararCadenas_parametrized(String P1, String P2, String P3) {
		// Arrange
		Ejercicio4 e4 = new Ejercicio4();
		// Act
		// Assert
		assertEquals(P3, e4.compararCadenas(P1,P2));
	}

}
