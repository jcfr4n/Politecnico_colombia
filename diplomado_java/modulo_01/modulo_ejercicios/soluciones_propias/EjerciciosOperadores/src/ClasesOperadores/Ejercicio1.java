package ClasesOperadores;

/*
 * Dentro de la clase “Ejercicio1”, realizar los siguientes pasos en su
 * respectivo orden:
 * - Crear una variable para almacenar el nombre de un estudiante.
 * - Crear 5 variables de tipo double para almacenar 5 diferentes notas
 * decimales.
 * - Calcular el promedio final del estudiante a partir de las 5 notas decimales.
 * (Recuerda que un promedio se calcula sumando todos los valores y
 * dividiendo el resultado por el número de valores).
 * - Mostrar el resultado y el nombre del estudiante.
 * 
 */

public class Ejercicio1 {

	public static void main(String[] args) {
		
		String nombreEstudiante = "Juan Carlos Francisco";
		double nota1 = 8.50;
		double nota2 = 9.50;
		double nota3 = 9.00;
		double nota4 = 9.50;
		double nota5 = 10.00;

		double promedio = (nota1 + nota2 + nota3 + nota4 + nota5)/5;
		
		System.out.println("El alumno " + nombreEstudiante + " tiene un promedio de: " + promedio + " puntos");

	}

}
