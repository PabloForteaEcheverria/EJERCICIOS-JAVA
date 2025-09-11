/*
 Instrucciones:

Pide al usuario que introduzca números enteros (uno a uno).

El programa termina cuando el usuario introduce el número 999.

Durante el proceso:

Cuenta cuántos números positivos se han introducido.

Cuenta cuántos números negativos se han introducido.

Cuenta cuántos ceros se han introducido.

Al finalizar, muestra el número total de positivos, negativos y ceros.


 * */
package WHILE;

import java.util.Scanner;

class Contador_positivos_negativos_cero {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int numero=0;
		int positivos=0;
		int negativos=0;
		int ceros=0;
		
		do {
			
			System.out.println("Introduce un numero: ");
			numero=sc.nextInt();
			
			if (numero !=999) {
					if(numero == 0) {
					ceros ++;
					}
					else if(numero >= 1) {
						positivos ++;
					}
					else {
						negativos++;
				}
			}
		}
		while(numero !=999);
			System.out.println("Numeros positivos: "+ positivos);
			System.out.println("Numeros negativos: "+ negativos);
			System.out.println("Ceros: "+ ceros);
			sc.close();
	}
	
}
