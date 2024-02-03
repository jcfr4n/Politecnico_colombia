package ClasesCondicionales;

import java.util.Scanner;

public class Ejercicio2 {
	/*
	 * - Desarrollar un programa que permita determinar la cantidad de cifras
	 * de un número X teniendo en cuenta que el número únicamente puede
	 * tener 4 cifras. Mostrar un mensaje por defecto si el número supera las
	 * 4 cifras.
	 * 
	 */

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		final int CANT_CIFRAS = 4;
		int numero;
		int cifras;
		
		System.out.print("Introduce un número entero: ");
		numero = sc.nextInt();
		cifras = (int)(Math.log10(numero) + 1);
		
		if (cifras < 0 || cifras > CANT_CIFRAS) {
			System.out.println("El número no tiene una longitud válida");
		}else if (cifras < CANT_CIFRAS) {
			System.out.println("El número tiene " + cifras + " cifras");
		}else {
			System.out.println("El número tiene " + cifras + " cifras");
		}
		
	}

}
