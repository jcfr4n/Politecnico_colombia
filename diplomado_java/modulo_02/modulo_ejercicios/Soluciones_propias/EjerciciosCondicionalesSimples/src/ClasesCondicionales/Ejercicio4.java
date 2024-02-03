package ClasesCondicionales;

import java.util.Scanner;

public class Ejercicio4 {
	/*
	 * 4. Dados dos números enteros, determinar si uno es múltiplo del otro (Por
	 * medio del módulo).
	 * 
	 */

	public static void main(String[] args) {
		int numero1;
		int numero2;
		String multiplo = "no";
		Scanner sc = new Scanner(System.in);
		System.out.println("Vamos a determinar si uno es múltiplo del otro.");
		System.out.print("Introduce el primer número: ");
		numero1 = sc.nextInt();
		System.out.print("Introduce el segundo número: ");
		numero2 = sc.nextInt();
		if (numero1 % numero2 == 0)  multiplo = "si";
		System.out.println(numero1 + " " + multiplo + " es multiplo de " + numero2 + ".");
		sc.close();

	}

}
