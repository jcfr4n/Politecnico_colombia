package agenda;

public class Agenda {
	private Contacto[] agenda = new Contacto[10];

	public boolean registrarContacto(Contacto contacto) {
		boolean result = false;
		for (int i = 0; i < agenda.length; i++) {
			if (agenda[i] == null) {
				agenda[i] = contacto;
				result = true;
				break;
			}
		}
		return result;
	}

	public void listarContactos() {
		for (int i = 0; i < agenda.length; i++) {
			if (agenda[i] != null) {
				System.out.println(
						"Nombre: " + agenda[i].getNombre() + "\t\t\tNúmero: " + agenda[i].getNumero() + "  " + i);
			}
		}
	}

	public void buscarContacto(String nombre) {
		for (int i = 0; i < agenda.length; i++) {
			if (agenda[i] != null && agenda[i].getNombre().equals(nombre)) {
				System.out.println("El número de contacto es: " + agenda[i].getNumero());
			}
		}
	}

	public int disponibles() {
		int aux = 0;
		while (agenda[aux] != null && aux <= agenda.length) {
			aux++;
		}
		return 10 - aux;
	}
}
