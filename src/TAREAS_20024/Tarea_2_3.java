package TAREAS_20024;

import java.util.Scanner;

public class Tarea_2_3 {

	public static void main(String[] args) {
		int millares;
		int centenas;
		int decenas;
		int unidades;
		
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Ingresa un numero de 4 cifras: ");
		int numero = sc.nextInt();
		
		millares = numero/1000;
		centenas = (numero % 1000)/100;
		decenas = (( numero  % 1000) % 100)/10;
		unidades = ((( numero  % 1000) % 100)%10);
		
		System.out.printf("Millares: %d%n", millares);
		System.out.printf("Centenas: %d%n", centenas);
		System.out.printf("Decenas: %d%n", decenas);
		System.out.printf("Unidades: %d", unidades);

		sc.close();
	}

}
