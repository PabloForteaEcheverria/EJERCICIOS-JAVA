/*
 * Crea un programa que pida al usuario un número entero N 
 * y luego calcule la suma de todos los números del 1 al N.
 */
package ejercicios;

import java.util.Scanner;

public class Suma_del_1_al_N {

	public static void main(String[] args) {
		int suma=0;
		int numero;
		Scanner sc = new Scanner(System.in);
		System.out.println("Dame un numero y te sumo los incluidos entre 1 y ese  numero: ");
		numero = sc.nextInt();
		
		for (int i=1 ; i<=numero ; i++) {
				suma += i;
		}
		
		System.out.printf("La suma de los numeros comprendidos entre 1 y %d es: %d", numero, suma);
		sc.close();
	}

}
