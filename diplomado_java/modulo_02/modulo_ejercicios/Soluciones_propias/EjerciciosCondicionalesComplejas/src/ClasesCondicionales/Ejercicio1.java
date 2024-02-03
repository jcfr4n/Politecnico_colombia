package ClasesCondicionales;

import java.util.Scanner;

public class Ejercicio1 {
	/*
	 * - Desarrollar un programa que permita por medio de la edad de una
	 * persona, determinar la categoría en la que pertenece a raíz de la
	 * siguiente tabla:
	 * 
	 * Rango de edad						Categoría
	 * 
	 * 		0 - 5							Infante
	 * 		6 - 10							Niño
	 * 		11 - 15							Pre adolescente
	 * 		16 - 18							Adolescente
	 * 		19 - 25							Pre adulto
	 * 		26 - 40							Adulto
	 * 		41 - 55							Pre anciano
	 * 		56+								Anciano
	 * 
	 * •••Recuerda tener presente:
	 * -	Condicionales anidadas.
	 * -	Tabla de verdades.
	 * -	Tabla de operadores lógicos.
	 */

	public static void main(String[] args) {
		int edad;
		String categoria = "";
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Introduce la edad de la persona para determinar la categoría: ");
		edad = sc.nextInt();
		if (edad >0 && edad <= 5) {
			categoria = "Infante";
		}else if (edad > 5 && edad <= 10) {
			categoria = "Niño";
		}else if (edad >10 && edad <= 15) {
			categoria = "Pre adolescente";
		}else if (edad > 15 && edad <= 18) {
			categoria = "Adolescente";
		}else if (edad > 18 && edad <= 25) {
			categoria = "Pre adulto";
		}else if (edad > 25 && edad <= 40) {
			categoria = "Adulto";
		}else if (edad > 40 && edad <= 55) {
			categoria = "Pre anciano";
		}else if (edad > 55) {
			categoria = "Anciano";
		}
		
		System.out.println("\nLa persona está categorizada como: " + categoria);
		
		sc.close();
		System.exit(0);
	}

}
