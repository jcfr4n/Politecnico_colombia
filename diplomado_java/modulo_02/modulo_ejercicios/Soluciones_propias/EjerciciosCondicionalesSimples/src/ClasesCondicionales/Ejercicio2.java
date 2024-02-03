package ClasesCondicionales;

public class Ejercicio2 {
	/*
	 * 2. Dados dos números enteros, determinar cuál es el mayor por medio de
	 * una condicional y realizar una potencia con el número menor como
	 * exponente (Math.pow).
	 */

	@SuppressWarnings("unused")
	public static void main(String[] args) {

		final int numero1 = 3;
		final int numero2 = 9;
		
		double result = 0;
		
		if (numero1 > numero2) {
			result = Math.pow(numero1, numero2);
		}else {
			result = Math.pow(numero2, numero1);
		}
		
		System.out.println("El resultado es: " + result);

	}

}
