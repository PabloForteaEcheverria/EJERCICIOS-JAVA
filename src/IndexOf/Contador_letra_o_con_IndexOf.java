package IndexOf;

import java.util.Scanner;

public class Contador_letra_o_con_IndexOf {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
	
		String frase;
		String caracter;
		int contador=0;
		
		
		
		System.out.println("Escribe una frase: ");
		frase = sc.nextLine().toLowerCase();
	
		System.out.println("Que letra quieres buscar: ");
		caracter = sc.nextLine().toLowerCase();
	
		int posicion= frase.indexOf(caracter);   // buscamos la primera conincidencia.
		
		while (posicion != -1) {       //Si hay coincidencia suma 1 al contador
			contador ++;
			posicion = frase.indexOf(caracter,posicion +1);
		}
		System.out.println( caracter + " aparece " + contador + " veces.");
        
		sc.close();
	}

}
