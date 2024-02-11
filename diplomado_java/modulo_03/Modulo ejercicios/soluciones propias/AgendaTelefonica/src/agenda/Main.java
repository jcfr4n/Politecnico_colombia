package agenda;

public class Main {

	public static void main(String[] args) {

		Agenda agendita = new Agenda();

		// Creamos tres contactos usando los distintos constructores de la clase
		// Contacto
		Contacto contacto_1 = new Contacto();
		Contacto contacto_2 = new Contacto("nombre_2");
		Contacto contacto_3 = new Contacto("nombre_3", "333-333-333");

		// Se completan los datos faltantes
		contacto_1.setNombre("Nombre_1");
		contacto_1.setNumero("111-111-111");
		contacto_2.setNumero("222-222-222");

		// Registramos los contactos
		agendita.registrarContacto(contacto_1);
		agendita.registrarContacto(contacto_2);
		agendita.registrarContacto(contacto_3);

		// Imprimimos un listado de contactos
		agendita.listarContactos();

		// Búsqueda de un contacto por su nombre
		agendita.buscarContacto("nombre_2");

		// Disponibilidad de lugares para anotar contactos
		System.out.println("Hay " + agendita.disponibles() + " contactos disponibles en la agendita");
		;
	}

}
