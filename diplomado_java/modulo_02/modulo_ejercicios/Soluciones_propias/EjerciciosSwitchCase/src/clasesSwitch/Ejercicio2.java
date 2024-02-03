package clasesSwitch;

import java.util.Scanner;

public class Ejercicio2 {
	/*
	 * 2. Desarrollar una calculadora, la cual, en base a un operador, realice una
	 * operación con dos números enteros ya definidos y mostrar el resultado,
	 * los operadores a tener en cuenta son los vistos en la tabla de
	 * operadores aritméticos, sí deseas agregar más operadores, siéntete en
	 * libertad de hacerlo.
	 * 
	 */
	public static void main(String[] args) {
		double resultado = 0;
		String opcion = "";
		String operacion = "";
		Scanner sc = new Scanner(System.in); 
		int numero1 = 8; 
		int numero2 = 2;
		
		System.out.println("Introduzca alguno de los siguientes operadores para "
				+ "realizar la correspondiente operación sobre 8 y 2");
		System.out.println("\t \"+\"\tSuma");
		System.out.println("\t \"-\"\tResta");
		System.out.println("\t \"*\"\tMultiplicación");
		System.out.println("\t \"/\"\tDivisión");
		System.out.println("\t \"%\"\tMódulo");
		System.out.println("\nIntroduce tu opción: ");
		opcion = sc.next();
		
		switch(opcion) {
		case "+":
			resultado = numero1 + numero2;
			operacion = "suma";
			break;
		case "-":
			resultado = numero1 - numero2;
			operacion = "resta";
			break;
		case "*":
			resultado = numero1 * numero2;
			operacion = "multiplicación";
			break;
		case "/":
			resultado = numero1 / numero2;
			operacion = "división";
			break;
		case "%":
			resultado = numero1 % numero2;
			operacion = "módulo";
			break;
		default:
			operacion = "error";
		}
		
		if(operacion.equals("error")) {
			System.out.println("Ha habido un error");
		}else {
			System.out.println("Ud. ha seleccionado el operador de " + operacion + " y el resultado es: " + resultado);
		}
	}
}
