package clasesFor;

import java.util.Scanner;

public class Ejercicio3 {
	/*
	 * 3. Desarrollar un programa que permita definir si un número entero ya
	 * establecido es un número perfecto o no.
	 */

	public static void main(String[] args) {
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
		
		sc.close();
		System.exit(0);
		
	}

}
