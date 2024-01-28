package ClasesCondicionales;

import java.util.Scanner;

public class Ejercicio3 {
	/*
	 * 3. Dado un número entero, determinar por medio de un condicional si es
	 * negativo o no (Menor a cero).
	 * 
	 */

	public static void main(String[] args) {
		
		int numero;
		String valor = "positivo";
		Scanner sc = new Scanner(System.in);
		System.out.print("Introduce un entero y te digo si es positivo o negativo: ");
		numero = sc.nextInt();
		if(numero == 0) {
			System.out.println("Has introducido el cero");
		}else if(numero > 0) {
			System.out.println("El número introducido es positivo");
		}else {
			System.out.println("El número introducido es negativo");
		}

	}

}
