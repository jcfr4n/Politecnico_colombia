package ClasesVariables;

/*
 * Dentro de la clase “Ejercicio1”, crear las siguientes variables según 
 * su criterio:
 * - Una variable que me permita almacenar el nombre de una persona.
 * - Una variable “x” para almacenar un número con 2 decimales.
 * - Una variable constante para almacenar el valor del dólar.
 * - Una variable primitiva float para almacenar los primeros 7 decimales
 * de “pi”.
 * - Un variable de estructura tipo Double para almacenar los primeros 15
 * decimales de “Euler”.
 * 
 */

public class Ejercicio1 {

	public static void main(String[] args) {
		String nombrePersona = "Juan Carlos";
		double x = 9.50;
		final double valorDolar = 2200.00;
		float pi7decimales = 3.1415927f;
		Double euler15decimales = 2.718281828459045d;
		
		System.out.println("El nombre es: " + nombrePersona);
		System.out.println("El número con dos decimales es: " + x);
		System.out.println("El valor del dolar es: " + valorDolar);
		System.out.println("pi y sus primeros 7 decimales: " + pi7decimales);
		System.out.println("euler y sus primeros 15 decimales: " + euler15decimales);

	}

}
