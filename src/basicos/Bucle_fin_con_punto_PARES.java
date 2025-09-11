package basicos;

import java.util.Scanner;

public class Bucle_fin_con_punto_PARES {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Dame un numero");
		int numero1= sc.nextInt();
		System.out.println("Dame otro numero y te muestro los pares que hay entre ellos");
		int numero2= sc.nextInt();
		
		/// asegurar que el numero1 es par, si es impar se suma 1 para que lo sea 
		if (numero1 %2 != 0) {
			numero1++;
		}
		
		//Se crea la variable 'primero' para saber que estamos en el primer numero
		boolean primero = true;
		
		
		//Se ejecuta el bucle mientras sea el numero1 menor que el 2
		while (numero1 <= numero2) {
		
		//Si es el primer numero, lo imprime sin coma al principio, y cambia a FALSE
			if (primero) {
				System.out.print( numero1);
				primero=false;
			}
			
			/*Si el nimero en bucle (sumandole 2) es mayor que numero 2 imprime numero1 y '.' 
			para evitar pasarme*/
			else if (numero1 + 2 > numero2) {
				System.out.print(", "+numero1+". ");
			}
			
			else
				System.out.print(", "+ numero1);
		
			numero1 += 2;
			sc.close();
			}
		
		}
	
}//class
