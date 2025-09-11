package BOOLEAN;

import java.util.Scanner;

public class Mayor_de_edad_sin_ELSE {

	public static void main(String[] args) {
		

		Scanner sc = new Scanner(System.in);
		
		int edad;
		boolean mayorEdad= false;
		
		System.out.print("Que edad tienes? ");
		edad = sc.nextInt();
		
		mayorEdad = edad >= 18;
		System.out.println(mayorEdad ? "Eres mayor de edad." : "Eres menor de edad.");
	
		sc.close();
	}

}
