package IndexOf;

import java.util.Scanner;

public class Contador_de_consonantes {
	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		String frase;
		String consonantes="qwrtypñlkjhgfdszxcvbnm";
		
		
		System.out.println("Dame una frase, contare consonantes: ");
		frase=sc.nextLine().toLowerCase();
		
		int contadorConsonantes = 0;
		
		for (int i=0 ; i<frase.length(); i++) {
			char letra = frase.charAt(i);
			
			if (Character.isLetter(letra) && consonantes.indexOf(letra) != -1) {
				
				
				contadorConsonantes++;
			}
			
		}
		System.out.println("Consonantes: "+contadorConsonantes);
		sc.close();
	}
}
