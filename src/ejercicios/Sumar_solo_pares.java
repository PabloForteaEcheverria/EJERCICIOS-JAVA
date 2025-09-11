package ejercicios;

import java.util.Scanner;

public class Sumar_solo_pares {

	public static void main(String[] args) {
	 
		Scanner sc = new Scanner(System.in);
		
		double num = Double.NEGATIVE_INFINITY;
		double sumaPares=0;
		double sumaImpares=0;
		
		while(true) {
			
			System.out.println("Introduce un numero: (-1 para salir)");
			num=sc.nextDouble();
			if (num == -1) {
				break;
			}
			
			if (num %2 == 0) {
				sumaPares += num;			
			}
			else {
				sumaImpares += num;
			}
			sc.nextLine();
		}
		sc.close();
		System.out.println("La suma de pares es: "+ sumaPares);
		System.out.println("La suma de impares es: "+ sumaImpares);
	
	}
	
}
