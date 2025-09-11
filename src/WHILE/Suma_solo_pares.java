/*
 * Objetivo: El usuario introducirá números enteros.
 *  El programa solo aceptará y sumará los números pares positivos.
 *   El proceso termina si el usuario introduce 0 o un número negativo.
Al final, mostrará:
Cuántos números pares válidos se han introducido.
La suma total de esos números.
 */
package WHILE;

import java.util.Scanner;

public class Suma_solo_pares {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		
		int contadorpares = 0;
		int suma=0;
		int numero;	
		
		do {
			System.out.println("Introduce un numero: ");
			numero=sc.nextInt();
				if (numero>0 && numero % 2 == 0) {
					suma +=numero;
					contadorpares++;
				}
			
			
		}
		while (numero >0);
		
			System.out.println("Has introducido "+ contadorpares +" numeros validos.");
			System.out.println("La suma total es: "+ suma);
			sc.close();
	}

}
