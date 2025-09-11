package IndexOf;

import java.util.Scanner;

public class Contador_de_vocale_con_while {
	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		String frase;
		
		int contadorA=0;
		int contadorE=0;
		int contadorI=0;
		int contadorO=0;
		int contadorU=0;
		int posicion;
		
		
		
		System.out.println("Escribe una frase y cuento vocales: ");
		frase=sc.nextLine().toLowerCase();
		
		
		/*
		 * 1. El bucle A recorre toda la frase buscando "a" (o cualquier variante si añades más).
2. Cuando ya no encuentra más, indexOf devuelve -1, y ese while termina.
3. Entonces pasa al siguiente bucle, el de la "e", que hace lo mismo desde el principio.
4. Y así con cada vocal.


		 */
		posicion=0;
		while (posicion != -1) {  // mientras la posicion devuelva 1,
								//	el bucle continua porque IndexOf devuelve 1 o -1
			posicion=frase.indexOf("a", posicion);
					if (posicion != -1) {
						contadorA ++;
						posicion ++;
					}
		}//while A
		
		posicion=0;
		while (posicion != -1) {	
			posicion=frase.indexOf("e", posicion);
					if (posicion != -1) {
						contadorE ++;
						posicion ++;
					}			
		}//while E
		
		posicion=0;
		while (posicion !=-1) {
			posicion=frase.indexOf("i", posicion);
					if(posicion != -1) {
						contadorI ++;
						posicion ++;
					}
			
		}//while I
		
		posicion=0;
		while (posicion != -1)  {
			posicion=frase.indexOf("o", posicion);
			if	(posicion != -1) {
			contadorO ++;
			posicion ++;
			}
		}//while O
		
		posicion=0;
		while (posicion != -1) {
			posicion=frase.indexOf("u", posicion);
			if (posicion != -1) {
				contadorU ++;
				posicion ++;
			}
		}//while U
		

		System.out.println("hay: "+contadorA+" A" );
		System.out.println("hay: "+contadorE+" E" );
		System.out.println("hay: "+contadorI+" I" );
		System.out.println("hay: "+contadorO+" O" );
		System.out.println("hay: "+contadorU+" U" );
		sc.close();
	}
}
