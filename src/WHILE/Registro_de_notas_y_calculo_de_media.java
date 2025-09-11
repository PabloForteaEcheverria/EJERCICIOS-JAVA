/*
 Crea un programa en Java que:

Pida al usuario introducir notas (valores entre 0 y 10).

Siga pidiendo notas hasta que se introduzca un número negativo.

Al final, muestre:

El número total de notas válidas introducidas.

La media de esas notas.


 */
package WHILE;

import java.util.Scanner;

public class Registro_de_notas_y_calculo_de_media {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int suma=0;
		int contador=0;
		int nota;
		double media;
		
		do {
			System.out.println("Introduce nota: ");
			nota=sc.nextInt();
			if  (nota>=0) {
			suma += nota;
			contador++;
			}
		}
		while (nota >=0);
			media=(double)suma/contador;
			System.out.println("Se han introducido "+ contador+" notas");
			System.out.println("La media de esas notas es: "+ media);
			
		sc.close();
	}

}
