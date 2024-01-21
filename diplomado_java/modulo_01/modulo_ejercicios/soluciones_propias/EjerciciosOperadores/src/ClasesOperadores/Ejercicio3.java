package ClasesOperadores;
/*
 * 
 * Dentro de la clase “Ejercicio3”, realizar los siguientes pasos en su
 * respectivo orden:
 * - Crear una variable entera de nombre “numeroUno” con el valor de 8.
 * - Crear una variable entera de nombre “numeroDos” con el valor de 2.
 * - Intercambiar los valores de ambas variables, de modo que “numeroUno”
 * valga 2, y “numeroDos” valga 8. (Utiliza una variable auxiliar).
 * Mostrar los resultados de ambas variables.
 * 
 */

public class Ejercicio3 {

	public static void main(String[] args) {
		int numeroUno = 8;
		int numeroDos = 2;
		
		int temp;
		
		// Intercambiar valores de las dos variables usando temp
		
		temp = numeroUno;
		numeroUno = numeroDos;
		numeroDos = temp;
		
		// Intercambiar valor sin la variable temp (Descomentar el bloque siguiente)
		
		/*
		 * numeroUno += numeroDos;n
		 * numeroDos = numeroUno-numeroDos;
		 * numeroUno -= numeroDos;
		 */
		
		System.out.println("Ahora la variable numeroUno vale: " + numeroUno + " y la variable numeroDos: " + numeroDos);
		

	}

}
