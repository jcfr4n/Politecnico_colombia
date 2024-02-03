package clasesFor;

import java.util.Scanner;

public class Ejercicio2 {
	/*
	 * 2. Desarrollar un programa que determine los divisores de un número
	 * definido previamente.
	 * 
	 */

	public static void main(String[] args) {
		int numero;
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Introduce un número para calcular sus divisores: ");
		numero = sc.nextInt();
		

		System.out.println("Los divisores de " + numero + " son: ");
		
		for(int i = 1; i <= numero; i++) {
			if (numero % i == 0) {
				System.out.println(i);
			}
		}

	}

}
