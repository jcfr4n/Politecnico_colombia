package seguridad;

public class Main {

	public static void main(String[] args) {
		Password pwd = new Password();

		while (!pwd.validar(pwd.getPassword())) {
			pwd.generar();
		}

		System.out.println(pwd.getPassword());
	}

}
