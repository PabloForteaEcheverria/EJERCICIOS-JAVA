package basicos;

public class Crear_metodo_sumar {

	public static void main(String[] args) {
		
		int a=5;
		int b=3;
		
		int resultado = sumar(a,b);
		
		System.out.printf("la suma de %d y %d es: %d"  , a, b, resultado);
		System.out.printf("\nla suma de " +a+" y "+b+" es: "+resultado);

	}

	private static int sumar( int a, int  b ) {
		return (a+b);
		
	}

}
