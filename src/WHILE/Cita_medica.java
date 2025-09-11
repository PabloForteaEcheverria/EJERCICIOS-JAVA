/*
Crear un pequeño programa que:

Pida al usuario que introduzca su nombre completo (puede tener espacios).

Luego, pida su edad (solo aceptamos edades entre 1 y 120).

Si la edad es incorrecta, se repite la pregunta hasta que introduzca una válida.

Al final, muestra:
Hola [nombre], has sido registrado correctamente con [edad] años.
*/
package WHILE;

import java.util.Scanner;

public class Cita_medica {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		String nombre;
		int edad;
		
		do {
			System.out.println("Nombre: ");
			nombre=sc.nextLine();
			
			System.out.println("Edad: ");
			edad=sc.nextInt();
			sc.nextLine();
			if (edad <0 || edad>120) {
				System.out.println("Edad no valida.");
			}
			
		}	
		while (edad <0 || edad>120);
				System.out.println("hola "+nombre+", has sido registrado correctamente con "+ edad+" años.");
				System.out.printf("hola %s, has sido registrado correctamente con %d años.", nombre, edad);
			sc.close();	
			
		
		
	}

}
