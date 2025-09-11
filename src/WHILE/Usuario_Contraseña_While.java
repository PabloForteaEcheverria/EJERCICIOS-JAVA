/* 
 * Crea un programa que:

Tenga guardado un nombre de usuario y un PIN numérico correcto 

(por ejemplo, "pablo" y 1234).

Pida al usuario que introduzca su nombre y su PIN.

Si el nombre o el PIN son incorrectos, muestra un mensaje de error y vuelve a pedirlos.

Cuando ambos sean correctos, muestra un mensaje de bienvenida y termina el programa.


 */
package WHILE;

import java.util.Scanner;

public class Usuario_Contraseña_While {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		
		String nombre="Pablo";
		int contraseña=7014;
		String nombre2;
		int contraseña2;
		
		do {
			
			System.out.println("Introduce tu nombre de usuario:");
			nombre2=sc.nextLine();
			
			System.out.println("Introduce tu PIN:");
			contraseña2=sc.nextInt();
			sc.nextLine(); // limpiar buffer (solo se usa despues de nextInt)
			
				if (   (!nombre2.equals(nombre)   ) || (   contraseña2 !=contraseña )     ) {
					System.out.println("Nombre de usuario incorrecto!");	
				}
			}
		while 	 (   (!nombre2.equals(nombre)   ) || (   contraseña2 !=contraseña )     );
		 System.out.println("estas dentro.");
		sc.close();
	}
}
