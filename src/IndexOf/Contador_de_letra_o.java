package IndexOf;

import java.util.Scanner;

public class Contador_de_letra_o {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Dame una frase y te cuento 'oes'");
		String frase=sc.nextLine().toLowerCase();
		
		
		int contador=0;
		
		for (int i=0; i<frase.length(); i++) {
			
		//tomo la letra de la posicion
			char letra = frase.charAt(i);
			
		//Compruebo si es 'o'
			if (letra == 'o') {
				contador ++;
			}

		}
		System.out.println("numero de oes: "+contador);
		sc.close();
	}
}