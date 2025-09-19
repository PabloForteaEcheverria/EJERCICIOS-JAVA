/*### Ejercicio: Imprimir Nombres
Crea un programa que defina un array de 5 nombres y los imprima uno por uno.
*/

package Ejercicios_con_ARRAYS;

import java.util.ArrayList;
import java.util.Scanner;

public class Imprimir_nombre {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String nombre;
		
		ArrayList <String> nombres = new ArrayList <>() ;

		System.out.println("Nombre a añadir: ('s' para salir)");
		
		while (!(nombre=sc.nextLine()).equals("s")) {			
		nombres.add(nombre);
		
		System.out.println("Nombre a añadir: ('s' para salir)");
		
		}

		sc.close();
		
		System.out.println("Los nombres son: ");
		for (String n: nombres) {
			System.out.println(n);
		}
	
	}
}		
	
	
		

