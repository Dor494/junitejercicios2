package ual.hmis.sesion06;

public class Ejercicio2 {
	
	private String requisitosPassword = "(?=.*[0-9])(?=.*[a-z])(?=.*[A-Z]).{3,}";
	
	public boolean login (String username, String password){
		// comprobar que sean distintos de vacio
		if (username.isEmpty() || password.isEmpty())
			return false;
		// comprobar que la longitud sea < 30
		if (username.length()>= 30 || password.length()>=30)
			return false;
		// comprobar que la password contiene una mayuscula, una minuscula y un numero
		if(!password.matches(requisitosPassword)) 
			return false;
		// llamar al método de la bbdd
		return compruebaLoginEnBD(username, password);

	}

	public boolean compruebaLoginEnBD
	(String username, String password){
		// método mock (simulado)
		if (username.equals("user") && password.equals("Pass1"))
			return true;
		else
			return false;
	}
}
