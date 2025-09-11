package basicos;

public class Crear_metodo_coche {

	public static void main(String[] args) {
		
		
		String coche = datosCoche( "opel",  1980);
		System.out.println(" El coche añadido es: "+ coche);
		
	}

	private static String datosCoche(String marca, int año) {
		
		return (marca +" del año "+ año);
	}

}
