package ual.hmis.sesion06;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

class Ejercicio2Test {

	@CsvSource({
		"user,Pass1,true",
		"'',Pass1,false",
		"user,'',false",
		"nombredeusuariossuperlagruisimomayorde30caraceteres,Pass1,false",
		"user,unsuperpasswordlarguisimoconmasde30caracteresgigantedelto,false",
		"user,pass,false",
		"user,Pass2,false",
		"usuario,Pass1,false",
		"usuario,Pass2,false"
	})
	
	@ParameterizedTest(name = "{index} => Con usuario ({0}) y password ({1}) sale {2}")
	void testLogin_parametrized(String username, String password, boolean result) {
		// Arrange
		Ejercicio2 e2 = new Ejercicio2();
		// Act
		// Assert
		assertEquals(result, e2.login(username, password));
	}
	
}
