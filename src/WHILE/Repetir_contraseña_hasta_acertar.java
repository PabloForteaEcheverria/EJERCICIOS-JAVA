package WHILE;

import java.util.Scanner;

public class Repetir_contraseña_hasta_acertar {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		String contraseña1;
		String contraseña2;
		
		System.out.println("Escribe una contraseña: ");
		
		contraseña1=sc.nextLine();
		
		do {
			System.out.println("Repite tu contraseña: ");
			contraseña2=sc.nextLine();
			
			if (!contraseña1.equals(contraseña2)) {
				System.out.println("Las contraseñas no son iguales");	
			}
		}while (!contraseña1.equals(contraseña2)); 
			System.out.println("Las contraseñas  son iguales");
			sc.close();
		
	
	}

}
