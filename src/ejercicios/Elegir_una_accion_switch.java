package ejercicios;

import java.util.Scanner;

public class Elegir_una_accion_switch {

	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		
		int opcion;
		do {
		
		
		System.out.println("----- menu ----");
		System.out.println("1-Añadir coche");
		System.out.println("2-Mostrar saludo");
		System.out.println("3-Calcular suma");
		System.out.println("4-Comparar textos");
		System.out.println("5-salir");
		System.out.println("---------------");
		System.out.println("Elige una opcion: ");
		
		opcion=sc.nextInt();
		sc.nextLine(); // limpiar buffer
		
		switch (opcion) {
		case 1-> añadirCoche(sc);
		case 2-> mostrarSaludo(sc);
		case 3-> calcularSuma(sc);
		case 4-> compararTextos(sc);
		case 5-> salir();
		default -> System.out.println("Opcion no valida");
		}
			 
		}
		while (opcion >=1 && opcion <=5);
		sc.close();	
	}

	private static void compararTextos(Scanner sc) {
		
		System.out.println("Dame una texto:");
		String frase1=sc.nextLine();
		System.out.println("vuelve a escribir el texto:");
		String frase2=sc.nextLine();
		
		if (frase1.equals(frase2)) {
			System.out.println("los textos son iguales");
		}
		else 
		System.out.println("los textos no son iguales");
		
		
	}

	private static void salir() {
		System.out.println("Gero arte - Adios ");
		System.exit(0);
		
		
	}

	private static void calcularSuma(Scanner sc) {
		
		int a, b;
		
		System.out.println("Dame un numero...");
		a=sc.nextInt();
		System.out.println("Dame otro numero...");
		b=sc.nextInt();
		System.out.println("sumando ... ...");
		int suma= a+b;
		System.out.printf("La suma de %d y %d es: %d" ,a, b, suma);
		System.out.println(); 
	}

	private static void mostrarSaludo(Scanner sc) {
		
		String saludo;
		
		System.out.println("Elige saludo: ");
		System.out.println(" hola ");
		System.out.println(" adios ");
		System.out.println(" Hasta luego ");
		System.out.println("... ... ...");
		
		saludo=sc.nextLine().toLowerCase();
		
		
		switch (saludo) {
				case "hola"-> System.out.println("Has elegido "+ saludo);
				case "adios"->System.out.println("Has elegido "+ saludo);
				case "hasta luego"->System.out.println("Has elegido "+ saludo);
				default ->System.out.println("opcion no valida");
				
		}
		
		
	}

	private static void añadirCoche(Scanner sc) {
		
		
		
		System.out.println("Dame la marca del coche: ");
		String marca=sc.nextLine();
		System.out.println("Dame el año de fabricacion:");
		int año=sc.nextInt();
		sc.nextLine(); // limpiar buffer
		System.out.printf("El coche %s del año %d ha sido añadido.", marca, año);
		System.out.println();
		
		
	}

}
