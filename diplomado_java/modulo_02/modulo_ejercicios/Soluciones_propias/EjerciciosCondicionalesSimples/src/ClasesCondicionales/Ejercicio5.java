package ClasesCondicionales;

import java.util.Scanner;

public class Ejercicio5 {
	/*
	 * 5. Por medio de una nota decimal, determinar sí el estudiante aprobó o no
	 * la clase (0 – 6 = Perdió – 7 – 10 = Aprobó).
	 * 
	 */

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		float nota;
		System.out.println("Vamos a determinar si el estudiante aprobó o no la clase.");
		System.out.print("Introduce la nota: ");
		nota = sc.nextFloat();
		if (nota >= 7) {
			System.out.println("El estudiante aprobó la clase.");
		}else {
			System.out.println("El estudiante no aprobó la clase.");
		}
		sc.close();
		System.exit(0);
	}

}
