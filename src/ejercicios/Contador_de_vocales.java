package ejercicios;

import java.util.Scanner;

public class Contador_de_vocales {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Dame una frase:");
		String frase=sc.nextLine().toLowerCase();
		
		int contadorVocales=0;
		
		for (int i=0; i<frase.length(); i++) {
			char letra=frase.charAt(i);
			
			switch (letra) {
			
			case 'a': 
			case 'e': 
			case 'i': 
			case 'o': 
			case 'u': 
			case 'á': 
			case 'é': 
			case 'í': 
			case 'ó': 
			case 'ú': 
				contadorVocales++;
				break;
			}
		}
		sc.close();
		System.out.println("Numero de vocales: "+ contadorVocales);		
	}
}
