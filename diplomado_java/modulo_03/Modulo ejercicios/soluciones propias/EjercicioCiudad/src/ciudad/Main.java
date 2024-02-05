package ciudad;

public class Main {
	/*
	 * - Clase ciudad, cuenta con cuatro atributos: nombre, población, país,
	 * presidente, además de los Getters y Setters con los constructores que
	 * creas necesarios.
	 * - Inicializar los atributos por medio de los Setters.
	 * -En la clase principal mostrar los datos almacenados de la ciudad por
	 * medio de los getters.
	 * 
	 */

	public static void main(String[] args) {
		Ciudad medellin = new Ciudad();
		
		medellin.setNombre("Medellín");
		medellin.setPoblación(4264751);
		medellin.setPaís("Colombia");
		medellin.setPresidente("Iván Duque Márquez");

		System.out.println("Ciudad:\t\t\t" + medellin.getNombre());
		System.out.println("Población:\t\t" + medellin.getPoblación());
		System.out.println("País:\t\t\t" + medellin.getPaís());
		System.out.println("Presidente:\t\t" + medellin.getPresidente());

	}

}
