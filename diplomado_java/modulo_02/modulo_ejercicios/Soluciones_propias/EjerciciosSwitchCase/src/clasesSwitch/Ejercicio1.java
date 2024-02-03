package clasesSwitch;

import java.util.Scanner;

public class Ejercicio1 {
	/*
	 * 1. Desarrolla un programa donde por medio del tipo de un motor,
	 * determinar qué tipo de fluido puede trasportar éste según las siguientes
	 * condiciones:
	 * 
	 * Si el tipo de motor es 0, mostrar un mensaje por consola indicando “No
	 * hay establecido un valor definido para el tipo”.
	 * Si el tipo de motor es 1, mostrar un mensaje por consola indicando “Agua”.
	 * Si el tipo de motor es 2, mostrar un mensaje por consola indicando “Gasolina”.
	 * Si el tipo de motor es 3, mostrar un mensaje por consola indicando “Hormigón”.
	 * Si no se cumple ninguno de los valores anteriores mostrar el mensaje “No 
	 * existe un valor válido”.
	 * 
	 */

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int tipoMotor;
		String respuesta = "";
		
		System.out.println("Introduzca el tipo de motor: ");
		tipoMotor = sc.nextInt();
		
		switch(tipoMotor) {
		case 0:
			respuesta = "No hay establecido un valor definido para el tipo";
			break;
		case 1:
			respuesta = "Agua";
			break;
		case 2:
			respuesta = "Gasolina";
			break;
		case 3:
			respuesta = "Hormigón";
			break;
		default:
			respuesta = "No existe un valor válido";
		}
		
		System.out.println(respuesta);

	}

}
