package To_String;

public class Coche {

	String marca;
	String modelo;
	String color;
	int año;
	static int contadorCoches=0;  // estatico para compartir dato en todos los objetos.
	int cocheNumero;
	
	public Coche (String marca,String modelo,
	String color,int año) {
		this.marca=marca;
		this.modelo=modelo;
		this.color=color;
		this.año=año;
		contadorCoches++;
		this.cocheNumero=contadorCoches;
	}
	
	@Override
	public String toString() {
		return "Coche numero: "+cocheNumero+"\n"
			+"Marca: "+marca+"\n"
			+"Modelo: "+modelo+"\n"
			+"Color: "+color+"\n"
			+"Año: "+año+"\n";
			
	}
	
	
	
public static void main(String[] args) {

	
	Coche cocheNuevo = new Coche ("Opel","Vivaro","Azul",2006);
	Coche cocheNuevo2 = new Coche ("Citroen","C3","verde",2010);
	
	System.out.println(cocheNuevo);
	System.out.println(cocheNuevo2);
	
	}
}