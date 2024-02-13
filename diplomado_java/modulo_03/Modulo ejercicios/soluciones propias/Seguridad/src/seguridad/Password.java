package seguridad;

public class Password {

	private int longitud;
	private String password = "";
	private int ciclos = 1;

	public int getLongitud() {
		return longitud;
	}

	public void setLongitud(int longitud) {
		this.longitud = longitud;
	}

	public String getPassword() {
		return password;
	}

	public Password() {
		setLongitud(10);
	}

	public Password(int longitud) {
		setLongitud(longitud);
	}

	public void generar() {
		this.password = "";
		for (int i = 0; i < this.longitud; i++) {
			double aux = Math.random();
			int tipoCaracter = (int) Math.floor(aux * 3) + 1;
			int caracter;

			switch (tipoCaracter) {
			case 1:
				caracter = (int) Math.floor((Math.random() * (90 - 65 + 1)) + 65); // Letras mayúsculas (ASCII 65-90)
				break;
			case 2:
				caracter = (int) Math.floor((Math.random() * (122 - 97 + 1)) + 97); // Letras minúsculas (ASCII 97-122)
				break;
			case 3:
				caracter = (int) Math.floor((Math.random() * (57 - 48 + 1)) + 48); // Números (ASCII 48-57)
				break;
			default:
				throw new IllegalArgumentException("Unexpected value: " + tipoCaracter);
			}

			this.password += (char) caracter;
		}
	}

	public boolean validar(String password) {
		int cantidadMinuculas = 0;
		int cantidadMayusculas = 0;
		int cantidadNumeros = 0;

		if (password.equals(""))
			return false;

		for (char c : password.toCharArray()) {
			if (Character.isLowerCase(c)) {
				cantidadMinuculas++;
			} else if (Character.isUpperCase(c)) {
				cantidadMayusculas++;
			} else if (Character.isDigit(c)) {
				cantidadNumeros++;
			}
		}

		boolean esSegura = cantidadMinuculas >= 1 && cantidadMayusculas >= 2 && cantidadNumeros >= 5;

		System.out.println("Contraseña: " + password);
		System.out.println("Ciclo: " + this.ciclos++);
		System.out.println("Cantidad de minúsculas: " + cantidadMinuculas);
		System.out.println("Cantidad de mayúsculas: " + cantidadMayusculas);
		System.out.println("Cantidad de números: " + cantidadNumeros);
		System.out.println("Es segura: " + esSegura);

		return esSegura;
	}

}
