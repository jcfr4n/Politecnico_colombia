package casa2;

public class Main {

	public static void main(String[] args) {
		Casa miCasa = new Casa("Medellín", "Belén", "Azul");
		Casa miRancho = new Casa("Belén", "Azul", 3);
		Casa miDepartamento = new Casa(3, 5, 2, 1);

		System.out.println("Objeto1 miCasa:");
		System.out.println("Ciudad: " + miCasa.getCiudad());
		System.out.println("Barrio: " + miCasa.getBarrio());
		System.out.println("Color: " + miCasa.getColor());
		
		System.out.println("Objeto2 miRancho:");
		System.out.println("Barrio: " + miRancho.getBarrio());
		System.out.println("Color: " + miRancho.getColor());
		System.out.println("Pisos: " + miRancho.getPisos());
		
		System.out.println("Objeto3 miDepartamento:" + miDepartamento.toString());
		System.out.println("Pisos: " + miDepartamento.getPisos());
		System.out.println("Habitaciones: " + miDepartamento.getHabitaciones());
		System.out.println("Baños: " + miDepartamento.getbanios());
		System.out.println("Cocinas: " + miDepartamento.getCocinas());

	}

}
