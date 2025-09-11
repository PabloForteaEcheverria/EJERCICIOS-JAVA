package basicos;

import java.util.Scanner;

public class practicas_Repaso {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Dame un numero y te doy informacion de el:");
			int numero=sc.nextInt();
			String tipo;
			
			if (numero %2 == 0) {
				tipo="es par.";
			}
			else {
				tipo="es impar.";
			}
			
			
			System.out.printf("El numero %d  es: %s%n ", numero , tipo);// % --> salto de linea
		sc.close();
	}
}
