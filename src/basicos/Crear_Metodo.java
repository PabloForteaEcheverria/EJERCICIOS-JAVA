package basicos;

public class Crear_Metodo {

	public static void main(String[] args) {
		
		saludar("Pablo");
		saludar("Saida");
		despedirse("Pablo");
		despedirse("Saida");


	}

	private static void despedirse(String nombre) {
		System.out.println("¡Adios, " + nombre + "!");	
	
		
	}

	private static void saludar(String nombre) {
		
		System.out.println("¡Hola, " + nombre + "!");	
	}
}