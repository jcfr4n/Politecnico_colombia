package libros;

public class Main {

	public static void main(String[] args) {
		Libro libro1 = new Libro("Julio Cortázar", "Rayuela", 485);
		Libro libro2 = new Libro("Albert Camus", "El Extranjero", 210);
		
		System.out.println(libro1.mostrarLibro());
		System.out.println(libro2.mostrarLibro());
		System.out.println(libro1.compararLibros(libro1, libro2));
		
	}

}
