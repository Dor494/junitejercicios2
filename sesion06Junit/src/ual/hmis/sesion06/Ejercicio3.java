package ual.hmis.sesion06;

public class Ejercicio3 {
	public String cadena(int x) {
		String cadena = "";
		if(x<0)
			cadena = "numero erroneo";
		else if(x<5)
			cadena = "*****";
		else if(x>12)
			cadena = "************";
		else for(int i = 1; i<=x; i++) {
			cadena += "*";
		}
		return cadena;
	}
}
