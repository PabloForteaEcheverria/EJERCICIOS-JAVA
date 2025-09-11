package ejercicios;

import java.util.Scanner;

public class Es_primo_BOOLEAN {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		boolean esPrimo= true;
	
		System.out.println("Dame un numero y te digo si es o no primo: ");     
		int num = sc.nextInt();
		
		if (num <= 1) {   // cero y uno no son primos
			esPrimo = false;		
		}
		else {
				for (int i=2; i <= Math.sqrt(num); i++  ) {
					if (num % i == 0) {
						esPrimo = false;
						break;
					}
				}	
			
			}
		
		if (esPrimo) {					
				System.out.println(num + " Es primo");
			}
		else {
				System.out.println(num + " No es primo");
			}
	
	
	}

}
