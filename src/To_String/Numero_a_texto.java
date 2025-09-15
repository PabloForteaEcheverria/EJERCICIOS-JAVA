package To_String;

import java.util.Scanner;

public class Numero_a_texto {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Dame un numero y te digo los digitos que tiene:");
		
		
		int numero= sc.nextInt();
		
		String numeroComoTexto = Integer.toString(numero);
		
		int digitos =numeroComoTexto.length();
		
		System.err.println("El numero tiene "+digitos+" digitos.");
	
			sc.close();
	}
}
