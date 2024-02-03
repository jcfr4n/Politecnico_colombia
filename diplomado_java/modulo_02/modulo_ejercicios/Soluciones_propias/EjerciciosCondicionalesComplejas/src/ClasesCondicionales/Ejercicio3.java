package ClasesCondicionales;

import java.util.Scanner;

public class Ejercicio3 {
	/*
	 * - Desarrollar un programa que, por medio de 3 números enteros,
	 * determinar cuál es el mayor.
	 * 
	 */

	public static void main(String[] args) {
		int numero1, numero2, numero3;
		int mayor; 
		String puesto;
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Vamos a calcular el mayor de tres números");
		System.out.print("\nIntroduce el primero: ");
		numero1 = sc.nextInt();
		System.out.print("\nIntroduce el segundo: ");
		numero2 = sc.nextInt();
		System.out.print("\nIntroduce el tercero: ");
		numero3 = sc.nextInt();

		mayor = numero1;
		puesto = "primero";
		
		if (numero2 > mayor) {
			mayor = numero2;
			puesto = "segundo";
		}
		if (numero3 > mayor) {
			mayor = numero3;
			puesto = "tercero";			
		}
		System.out.print("\n\n\nEl número mayor es el que introdujo " + puesto + " con un valor de: " + mayor);
		
		
	}

}
