package ClasesCondicionales;

import java.util.Scanner;

public class Ejercicio4 {
	/*
	 * - Un postulante a un empleo, realiza un test de capacitación, se obtuvo
	 * la siguiente información: cantidad total de preguntas que se le
	 * realizaron y la cantidad de preguntas que contestó correctamente.
	 * Desarrolle un programa que informe el nivel según el porcentaje de
	 * respuestas correctas que ha obtenido, y sabiendo que:
	 * 1. Nivel máximo:		Porcentaje >= 90%.
	 * 2. Nivel medio:		Porcentaje >= 75% y <90%.
	 * 3. Nivel regular:	Porcentaje >= 50% y <75%.
	 * 4. Fuera de nivel:	Porcentaje < 50%.
	 * 
	 */

	public static void main(String[] args) {
		double porcentaje;
		String nivel = "";
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Introduce el porcentaje de respuestas correctas obtenidas: ");
		porcentaje = sc.nextDouble();

		if (porcentaje >= 90) nivel = "nivel máximo";
		if (porcentaje >= 75 && porcentaje < 90) nivel = "nivel medio";
		if (porcentaje >= 50 && porcentaje < 75) nivel = "nivel regular";
		if (porcentaje < 50) nivel = "fuera de nivel";
		
		System.out.println("El postulante ha sido calificado como: " + nivel);

	}

}
