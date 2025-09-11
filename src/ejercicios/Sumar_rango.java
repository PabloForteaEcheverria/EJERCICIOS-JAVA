package ejercicios;

import java.util.Scanner;

public class Sumar_rango {

	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		String opcion;
	
		int numInicio;
		int numFinal;
		
		do {
			
			System.out.println("quieres sumar rango de numeros? (si/no) ");
			opcion = sc.nextLine();
			if (opcion.equals("si")) {
				System.out.println("Dame el primer numero: ");
				numInicio=sc.nextInt();
				
				System.out.println("Dame el segundo numero: ");
				numFinal=sc.nextInt();
				
				sc.nextLine();   //limpiar buffer
				
				int suma=0;
				for (int i=numInicio; i<=numFinal ; i++) {
					suma += i;
				}
				System.out.printf("la suma de los numeros comprendidos entre %d y %d es: %d ", numInicio, numFinal, suma);
			}
			
		}
		while (opcion.equals("si"));
			System.out.println("Adios");
			sc.close();
		

	}

}
