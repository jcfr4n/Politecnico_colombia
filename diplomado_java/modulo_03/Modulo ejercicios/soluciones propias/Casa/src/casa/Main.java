package casa;

public class Main {
	/*
	 * Crear un proyecto llamado Casa que permita simular la información
	 * básica sobre una casa, para esto se deberán crear dos clases: casa y la
	 * clase principal para ejecutar:
	 * - Clase casa, cuenta con siete atributos: ciudad, barrio, color,
	 * pisos, habitaciones, baños y cocinas, se deben inicializar todos los
	 * atributos dentro de la clase, de forma que serán atributos
	 * CONSTANTES y sólo se crearán los Getters.
	 * - En la clase principal mostrar la información de la casa por medio
	 * de los getters.
	 * 
	 */

	public static void main(String[] args) {
		Casa miCasa = new Casa();

		System.out.println("Ciudad:\t\t\t" + miCasa.getCiudad());
		System.out.println("Barrio:\t\t\t" + miCasa.getBarrio());
		System.out.println("Color:\t\t\t" + miCasa.getColor());
		System.out.println("Pisos:\t\t\t" + miCasa.getPisos());
		System.out.println("Habitaciones:\t\t" + miCasa.getHabitaciones());
		System.out.println("Baños:\t\t\t" + miCasa.getBaños());
		System.out.println("Cocinas:\t\t" + miCasa.getCocinas());
	}

}
