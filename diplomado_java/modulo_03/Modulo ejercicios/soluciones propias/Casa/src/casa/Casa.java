package casa;

public class Casa {
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

	private final String ciudad = "Medellín";
	private final String barrio = "Belén";
	private final String color = "Azul";
	private final int pisos = 3;
	private final int habitaciones = 5;
	private final int baños = 2;
	private final int cocinas = 1;
	
	public String getCiudad() {
		return ciudad;
	}
	public String getBarrio() {
		return barrio;
	}
	public String getColor() {
		return color;
	}
	public int getPisos() {
		return pisos;
	}
	public int getHabitaciones() {
		return habitaciones;
	}
	public int getBaños() {
		return baños;
	}
	public int getCocinas() {
		return cocinas;
	}
	
	

}
