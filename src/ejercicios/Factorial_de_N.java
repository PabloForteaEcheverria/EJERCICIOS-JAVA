package ejercicios;

import java.util.Scanner;

public class Factorial_de_N {

	public static void main(String[] args) {
		
		
		
		
		while (true) {
			Scanner sc = new Scanner(System.in);
			System.out.println("Dame un numero y te calculo el Factorial: (-1 para salir)");
			int numero=sc.nextInt();
			int resultado=1;
					if (numero == -1) {
						System.out.println("Saliendo, hasta otra...");
						break;
					}
					
			
				for (int i=1 ; i<=numero ; i++) {
					if (numero < 0) {
						System.out.println("El numero debe ser positivo.");
					}
					resultado *= i;
					
				}
		
		System.out.printf("El factorial de %d es %d%n", numero, resultado);
		sc.close();
		}
		
	}

}

