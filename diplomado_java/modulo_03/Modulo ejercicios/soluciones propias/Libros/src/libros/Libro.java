package libros;

public class Libro {
	private String autor = "Desconocido";
	private String titulo = "Desconocido";
	private int paginas = 0;
	
	public String getAutor() {
		return autor;
	}
	public void setAutor(String autor) {
		this.autor = autor;
	}
	public String getTitulo() {
		return titulo;
	}
	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}
	public int getPaginas() {
		return paginas;
	}
	public void setPaginas(int paginas) {
		this.paginas = paginas;
	}
	
	public Libro(String autor, String titulo, int paginas) {
		setAutor(autor);
		setTitulo(titulo);
		setPaginas(paginas);		
	}
	
	public String mostrarLibro() {
		return "El libro " + getTitulo() + ", del autor " + getAutor() + ", tiene " + getPaginas() + " páginas";
	}
	
	public String compararLibros(Libro libro1, Libro libro2) {
		
		String response = "";
		
		if(libro1.getPaginas() > libro2.getPaginas()) {
			response = libro1.getTitulo() + " tiene más páginas";
		}else if(libro1.getPaginas() == libro2.getPaginas()) {
			response = libro1.getTitulo() + " y " + libro2.getTitulo() + " tienen las mismas páginas";			
		}else {
			response = libro2.getTitulo() + " tiene más páginas";			
		}
		
		return response;		
	}
	
}
