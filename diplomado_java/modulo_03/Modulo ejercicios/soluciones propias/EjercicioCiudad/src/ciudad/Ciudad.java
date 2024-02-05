package ciudad;

public class Ciudad {
	/*
	 * - Clase ciudad, cuenta con cuatro atributos: nombre, población, país,
	 * presidente, además de los Getters y Setters con los constructores que
	 * creas necesarios.
	 * - Inicializar los atributos por medio de los Setters.
	 * -En la clase principal mostrar los datos almacenados de la ciudad por
	 * medio de los getters.
	 * 
	 */
	private String nombre; 
	private int población; 
	private String país;
	private String presidente;
	
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public int getPoblación() {
		return población;
	}
	public void setPoblación(int población) {
		this.población = población;
	}
	public String getPaís() {
		return país;
	}
	public void setPaís(String país) {
		this.país = país;
	}
	public String getPresidente() {
		return presidente;
	}
	public void setPresidente(String presidente) {
		this.presidente = presidente;
	}

}
