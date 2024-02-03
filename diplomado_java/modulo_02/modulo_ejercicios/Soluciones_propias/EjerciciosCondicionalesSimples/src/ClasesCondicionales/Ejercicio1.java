package ClasesCondicionales;

public class Ejercicio1 {
	/*
	 * 1. Desarrollar un algoritmo que genere un número aleatorio de 1 a 100
	 * (Math.random) y por medio de una condicional determinar sí el número
	 * es menor a 50 o mayor.
	 * 
	 */

	public static void main(String[] args) {
		final int NUMERO_ALEATORIO = (int) Math.floor(Math.random() * 100 + 1);
		String valor = "";
		
		if (NUMERO_ALEATORIO == 50) {
			valor = "igual";
		}else if (NUMERO_ALEATORIO > 50) {
			valor = "mayor";
		}else {
			valor = "menor";
		}
		
		System.out.println("El número aleatorio es: " + NUMERO_ALEATORIO + " y es " + valor + " que 50.");
			
	}

}
