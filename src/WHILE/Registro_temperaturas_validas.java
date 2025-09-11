/*
Ejercicio: Registro de Temperaturas Válidas
Objetivo:
Pide al usuario que introduzca una temperatura (en grados Celsius). La temperatura debe estar entre -50 y 50 grados.

✅ Si la temperatura está dentro del rango, imprímela como válida.
❌ Si no lo está, muestra un mensaje de error y vuelve a pedirla.
El programa debe seguir pidiendo temperaturas hasta que se introduzca una válida.
*/
package WHILE;

import java.util.Scanner;

public class Registro_temperaturas_validas {

	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		double temperatura;
		
		do {
			System.out.println("Introduce una temperatura (-50 a 50): ");
			temperatura=sc.nextDouble();
			
				if (temperatura < -50 || temperatura >50) {
				System.out.println("Temperatura no valida, prueba otra vez.");
				}
		}
		while (temperatura < -50 || temperatura > 50) ;
			System.out.println("Temperatura registrada correctamente.");
	sc.close();
	}

}















