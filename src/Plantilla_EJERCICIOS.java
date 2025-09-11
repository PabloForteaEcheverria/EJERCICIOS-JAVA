import java.util.Scanner;

public class Plantilla_EJERCICIOS {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		double conteo=0; /// para iniciar la cantidad de numeros para calculo de la media
		double suma=0;   /// para iniciar la suma de  numeros
		double maximo=Double.NEGATIVE_INFINITY;  // inizializa con el minimo infinito 
		// el numero cualquiera que inserte pasa a ser el maximo
		double minimo=Double.POSITIVE_INFINITY;  // inicializa con el maximo infinito
		// el numero cualquiera que inserte pasa a ser el minimo
		
		
		
		while (true) {
			
			System.out.println("Ingresa un numero: (-1 para terminar)");
			
			double numero= sc.nextDouble();
			
			if (numero == -1) {
				break;
			}
		    suma += numero;
		  
			conteo ++;
			
			if (numero > maximo) {
				maximo = numero;
			}
			if (numero < minimo) {
				minimo = numero;
			}
		}	
			System.out.println("La suma es= "+ suma);
			System.out.println("El numero maximo es "+ maximo);
			System.out.println("El numero minimo es "+ minimo);
			System.out.println("La media de los numeros introducidos es: "+ (double)suma/conteo);
			
			
			
		sc.close();
	}
}
