package clasesFor;

import java.util.ArrayList;
import java.util.Scanner;

public class Ejercicio4 {
	/*
	 * 4. Desarrollar un programa que realice la sumatoria de todas las
	 * iteraciones de un ciclo desde 0 hasta un número entero definido
	 * previamente, al resultado de la suma realizar las siguientes operaciones.
	 * - Raíz cuadrada.
	 * - Generar un número aleatorio entre 1 y la sumatoria de las iteraciones.
	 * - Determinar los divisores.
	 * - Hallar la factorial.
	 * - Definir si es un número perfecto.
	 * 
	 */

	public static void main(String[] args) {
		final int NUMERO = 5;
		int suma = 0;
		for (int i = 0; i <= NUMERO; i++) {
			suma += i;
		}
		System.out.println("El número a analizar es: " + NUMERO);
		System.out.println("La suma de todas las iteraciones es: " + suma);
		System.out.println("La raíz cuadrada de la suma es: " + raizSuma(suma));
		System.out.println("Número aleatorio entre 1 y la sumatoria de las iteraciones: " + alea(suma));
		System.out.println("Determinar los divisores de la sumatoria de las iteraciones: " + divisores(suma));
		System.out.println("Hallar el factorial de la sumatoria de las iteraciones: " + factorial(suma));
		System.out.println("Definir si es un número perfecto. " + perfect(suma));
	}

	public static int alea(int suma) {
		return (int)(Math.floor(Math.random() * suma + 1));
	}
	
	public static double raizSuma(int suma) {
		return (double)(Math.sqrt(suma));
	}

	private static String divisores(int suma) {
		ArrayList<String> response = new ArrayList<String>();
		for (int i = 1; i <= suma; i++) {
			if (suma % i == 0) {
				response.add("" + i);
			}
		}
		
		return response.toString();
	}

	private static int factorial(int suma) {
		int result = 1;
		for (int i = 1; i < suma; i++) {
			result *= i;
		}
		return result;
	}

	private static void perfect(int suma) {
		
		int numero;
		int comprobacion = 0;
		String esPerfecto = "";
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Introduce un número para calcular si es un número perfecto o no: ");
		numero = sc.nextInt();
		
		for(int i = 1; i < numero; i++) {
			if (numero % i == 0) {
				comprobacion += i;
			}
		}
		
		esPerfecto = (numero == comprobacion) ? "si" : "no";
		
		
		System.out.println("El numero " + numero + " " + esPerfecto + " es un número perfecto");
	}

}
