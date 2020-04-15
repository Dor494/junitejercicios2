package ual.hmis.sesion06;

public class Ejercicio4 {

	public String compararCadenas(String P1, String P2) {
		String P3 = "";
		if(P1.equals(P2))
			return P2;
		else if(P1.isBlank() || P2.isBlank())
			return "";
		else
			for(int i = 0; i<P1.length(); i++) {
				for(int j = 0; j<P2.length(); j++) {
					if(P1.charAt(i)==P2.charAt(j)) {
						P3 += P1.charAt(i);
					}
				}
			}
		return P3;
	}
}
