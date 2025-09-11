package IndexOf;

import java.util.Scanner;

public class Contador_vocales {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		String vocales="aeiouáéíóú";
		String palabra;
		int contador=0;
		
		
		System.out.println("Dame una palabra y contare vocales: ");
		
		
		palabra = sc.nextLine().toLowerCase();
		
		for (int i=0 ; i<palabra.length(); i++) {
		
			// declaramos letra: caracter encontrado en posicion i de 'vocales'
			char letra = palabra.charAt(i); 
				
			// si en 'vocales' aparece la 'letra' la imprime
			if (vocales.indexOf(letra) != -1 ) {
				System.out.println(letra);
				
				contador++;
			}
			
		}
		System.out.println("Numero de vocales: " + contador);
		sc.close();
	}
}


