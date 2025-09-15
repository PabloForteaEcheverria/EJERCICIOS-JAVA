package To_String;

public class Libro {

	String titulo;
	String autor;
	double precio;
	int paginas;
	
	public Libro (String titulo, String autor, double precio, int paginas) {
		this.titulo=titulo;
		this.autor=autor;
		this.precio=precio;
		this.paginas=paginas;
	}
	@Override
	public String toString() {
		return "Titulo: "+titulo+"\n"
				+"Autor: "+autor+"\n"
				+String.format("Precio: %.2f euros.", precio)+"\n"
				+"Paginas: "+paginas+" paginas."+"\n";
	}
	
	
	public static void main(String[] args) {
	
		Libro libro1 = new Libro("Titulo1","autor1",25.23,302);
		Libro libro2 = new Libro("Titulo2","autor2",32.5,456);
		
		System.out.println(libro1);
		System.out.println(libro2);
		
	}

}
///////////////////////////////////////////////////////
//   Ojo, String.format() para mostrar 2 decimales.  //
///////////////////////////////////////////////////////
