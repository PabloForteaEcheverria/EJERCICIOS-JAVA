package ejercicios;

import java.util.Scanner;

public class MayorDeEdad {

	public static void main(String[] args) {
		
		
		Scanner sc=new Scanner(System.in);
		int opcion;
		
		
		do {
					System.out.println("------ menu-----");
					System.out.println("1. primera opcion.");
					System.out.println("2. segunda opcion.");
					System.out.println("3. salir");
					System.out.println();
					System.out.println("elige tu opcion: ");
					opcion=sc.nextInt();
					
					switch (opcion) { 
														
										case 1: mayorDeEdad(sc); break;
										case 2: mayorDeEdad2(sc); break;
										case 3: salir();break;
										default : System.out.println("opcion no validad");
							
											}
}
		
		while (opcion >0 && opcion <=4);
		sc.close();
	}	

	


	public static void mayorDeEdad(Scanner sc) {
int edad;
		
	
		
		System.out.println("Dame la edad de la persona: ");
		
		edad=sc.nextInt();
		if (edad <=0) {
			System.out.println("Edad no valida");
		}
		else if (edad >=18) {
			System.out.println("Es mayor de edad.");
		}
		else
			System.out.println("Es menor de edad.");
		
	}

	public static void mayorDeEdad2(Scanner sc) {
		
		String resultado;
		int edad;
		

		 
		System.out.println("Dame la edad de la persona: ");
		edad=sc.nextInt();
		
		resultado=(edad <=17)? "menor de edad." : "mayor de edad.";
	
		System.out.println("La persona es "+ resultado);
	}
	private static void salir() {
		System.out.println("gero arte - adios ");
		System.exit(0);
		
	}

}


