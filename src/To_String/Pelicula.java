package To_String;

public class Pelicula {
	
	String titulo;
	String director;
	int año;
	double duracion;
	static int contadorPeliculas=0;
	int numeroPelicula;
	
	public Pelicula (String titulo, String director,int año,double duracion) {
		this.titulo=titulo;
		this.director=director;
		this.año=año;
		this.duracion=duracion;
		contadorPeliculas++;
		this.numeroPelicula=contadorPeliculas;
	}
	
	@Override
	public String toString() {
		return "Numero de pelicula: "+ numeroPelicula+"\n"
				+"Titulo: "+titulo+"\n"
				+"Director: "+director+"\n"
				+"Año de estreno: "+año+"\n"
				+String.format("Duracion (minutos): %.2f", duracion )+"\n";
				
	}

	public static void main(String[] args) {
		
		Pelicula pelicula1 = new Pelicula("Titulo1","Director1",1987,23.4);
		Pelicula pelicula2 = new Pelicula("Titulo2","Director2",1940,22.03);
		
		System.out.println(pelicula1);
		System.out.println(pelicula2);
	}

}
