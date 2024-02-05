package casa2;

public class Casa {
	/*
	 * Replique el ejercicio anterior y por medio constructores inicializar los
	 * atributos:
	 * - Primer constructor: recibe: la ciudad, el barrio y el color.
	 * - Segundo constructor: recibe: el barrio, el color y los pisos.
	 * - Tercer constructor: recibe: los pisos, las habitaciones, los banios y
	 * las cocinas.
	 * - En la clase principal mostrar la información de la casa generada
	 * por cada constructor por medio de los getters, para esto deberás
	 * crear 3 objetos diferentes en la clase principal para representar
	 * cada constructor.
	 * 
	 */

	//variables
	private String ciudad;
	private String barrio;
	private String color;
	private int pisos;
	private int habitaciones;
	private int banios;
	private int cocinas;
	
	//Constructores
	
	// Constructor 1
	public Casa(String ciudad, String barrio, String Color) {
		this.setCiudad(ciudad);
		this.setBarrio(barrio);
		this.setColor(Color);
	}
	
	// Constructor 2
	public Casa(String barrio, String Color, int pisos) {
		this.setBarrio(barrio);
		this.setColor(Color);
		this.setPisos(pisos);
	}
	
	// Constructor 3
	public Casa(int pisos, int habitaciones, int banios, int cocinas) {
		this.setPisos(pisos);
		this.setHabitaciones(habitaciones);
		this.setbanios(banios);
		this.setCocinas(cocinas);
	}
	
	//getters and setters
	public String getCiudad() {
		return ciudad;
	}

	public void setCiudad(String ciudad) {
		this.ciudad = ciudad;
	}

	public String getBarrio() {
		return barrio;
	}

	public void setBarrio(String barrio) {
		this.barrio = barrio;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public int getPisos() {
		return pisos;
	}

	public void setPisos(int pisos) {
		this.pisos = pisos;
	}

	public int getHabitaciones() {
		return habitaciones;
	}

	public void setHabitaciones(int habitaciones) {
		this.habitaciones = habitaciones;
	}

	public int getbanios() {
		return banios;
	}

	public void setbanios(int banios) {
		this.banios = banios;
	}

	public int getCocinas() {
		return cocinas;
	}

	public void setCocinas(int cocinas) {
		this.cocinas = cocinas;
	}

}
