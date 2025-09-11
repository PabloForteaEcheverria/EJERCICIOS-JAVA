package BOOLEAN;

import java.util.Scanner;

public class Mayor_de_edad {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int edad;
	
		
		System.out.print("Que edad tienes? ");
		edad = sc.nextInt();
		if (edad >= 18) {
			System.out.println("eres mayor de edad.");
						
		}
		else {
			System.out.println("Eres menor de edad.");
		}
		sc.close();
	}

}
