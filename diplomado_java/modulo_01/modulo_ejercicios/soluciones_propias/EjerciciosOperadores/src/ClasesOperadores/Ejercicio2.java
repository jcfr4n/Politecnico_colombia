package ClasesOperadores;

public class Ejercicio2 {
	/*
	 * 
	 * Dentro de la clase “Ejercicio2”, realizar los siguientes pasos en su
	 * respectivo orden:
	 * - Crear una variable entera con el valor de 9.
	 * - Crear una variable entera con el valor de 7.
	 * - Calcular la suma de la variable número uno más la variable número dos.
	 * - Calcular la resta de la variable número uno menos la variable número
	 * dos.
	 * - Calcular la multiplicación de la variable número uno por la variable
	 * número dos.
	 * - Calcular la división de la variable número uno dividida la variable número
	 * dos.
	 * - Mostrar los resultados de cada operación.
	 * 
	 */

	public static void main(String[] args) {
		int var1 = 9;
		int var2 = 7;

		System.out.println("El valor de la suma es: " + (var1 + var2));
		System.out.println("El valor de la resta es: " + (var1 - var2));
		System.out.println("El valor de la multiplicación es: " + (var1 * var2));
		System.out.println("El valor de la división es: " + (var1 / var2));
		
		// System.out.println("El valor de la división es: " + ((double) var1 / var2)); // Paso una de las variables a tipo double para que el resultado de la división también se exprese como double y ver así los decimales. 

	}

}
