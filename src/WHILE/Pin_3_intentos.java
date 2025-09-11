/*
 * Crea un programa que:

Pida al usuario un número PIN (ejemplo: 4321).

El usuario tiene 3 intentos para acertarlo.

Si lo acierta, se muestra un mensaje: "Acceso concedido."

Si falla los 3 intentos, muestra: "Acceso denegado. Has superado el número de intentos."

*/

package WHILE;

import java.util.Scanner;

public class Pin_3_intentos {

	public static void main(String[] args) {
	
		Scanner sc= new Scanner(System.in);
				
		int pin =1234;
		int pin2=0;
		int intentos = 0;
		
		while (pin2 != pin && intentos < 3) {
			System.out.println("Introduce pin: ");
			pin2 = sc.nextInt();
			intentos ++;
			
				
				if (pin2 != pin && intentos < 3) {
					System.out.println("El pin no es correcto, prueba otra vez.");
				}
		}
				
			
		if  (pin2 == pin) {
					System.out.println("Estas dentro !");	
				}
				else {
					System.out.println("Has superado el limite de intentos.");	
				}
				sc.close();
	}	
}	
	
	


