package agenda;

public class Contacto {
	private String nombre;
	private String numero;

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getNumero() {
		return numero;
	}

	public void setNumero(String numero) {
		this.numero = numero;
	}

	public Contacto() {

	}

	public Contacto(String nombre) {
		setNombre(nombre);
	}

	public Contacto(String nombre, String numero) {
		setNombre(nombre);
		setNumero(numero);
	}

}
