package claseMath;
/*
 *
 * Dentro de la clase “Ejercicio4”, realizar los siguientes pasos en su respectivo orden.
 * - Generar 2 números con decimales aleatorios entre 1 y 50, que serán almacenados 
 *   en dos variables.
 * - Redondear las dos variables anteriormente creadas por medio del método Math.round, 
 *   Math.floor o Math.ceil.
 * - Calcular el número mayor por medio de Math.max.
 * - Mostrar el número mayor entre ambas variables.
 * 
*/

public class Ejercicio4 {

	public static void main(String[] args) {
		double numero1 = (Math.random() * 50) + 1;
		double numero2 = (Math.random() * 50) + 1;
		
		numero1 = Math.floor(numero1);
		numero2 = Math.floor(numero2);
		
		double max = Math.max(numero1, numero2);
		

		System.out.println("El número aleatorio mayor es: " + max);

	}

}
