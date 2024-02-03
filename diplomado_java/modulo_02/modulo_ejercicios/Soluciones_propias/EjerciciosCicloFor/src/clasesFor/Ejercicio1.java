package clasesFor;

import java.util.Scanner;

public class Ejercicio1 {
	/*
	 * Desarrolla un programa que permita mostrar el factorial de un número
	 * definido previamente.
	 * 
	 */

	public static void main(String[] args) {
		int numero;
		int resultado = 1;
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Introduce un número para calcular su factorial: ");
		numero = sc.nextInt();
		
		for (int i = 1; i <= numero; i++) {
			resultado *= i;
		}
		
		System.out.print("El resultado de factorial de " + numero + " es: " + resultado);		

	}

}
