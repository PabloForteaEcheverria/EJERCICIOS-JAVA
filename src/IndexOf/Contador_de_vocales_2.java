package IndexOf;

import java.util.Scanner;

public class Contador_de_vocales_2 {

	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		String frase;
			
		int contadorA=0;
		int contadorE=0;
		int contadorI=0;
		int contadorO=0;
		int contadorU=0;
		
		System.out.println("Escribe una frase: ");
		frase = sc.nextLine().toLowerCase();
		
		System.out.println("El numero de vocales es: ");
		
		for (int i=0 ; i<frase.length(); i++) {
			
			char letra=frase.charAt(i);
			
			 if ((letra == 'a') || (letra == 'á')) {
				contadorA++;
			}if ((letra == 'e') || (letra == 'é')) {
				contadorE++;
			}if ((letra == 'i') || (letra == 'í')) {
				contadorI++;
			}if ((letra == 'o') || (letra == 'ó')) {
				contadorO++;
			}if ((letra == 'u') || (letra == 'ú')) {
				contadorU++;
			}
		}
		
		System.out.println("A: "+ contadorA);
		System.out.println("E: "+ contadorE);
		System.out.println("I: "+ contadorI);
		System.out.println("O: "+ contadorO);
		System.out.println("U: "+ contadorU);
	
		sc.close();
	}
	
}
