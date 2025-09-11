package ejercicios;

import java.util.Random;
import java.util.Scanner;

public class Ejercicios_MENU_5_opciones {

	public static void main(String[] args) {
		
		Random rd = new Random();
		Scanner sc = new Scanner(System.in);
		int opcion=1;
		
		while (opcion != 0) {
			
			
			System.out.println("***** menu *****");
			System.out.println("0-Salir");
			System.out.println("1-Numero mayor");
			System.out.println("2-Tabla de multiplicar");
			System.out.println("3-Suma acumulada");
			System.out.println("4-Adivina el numero");
			System.out.println("5-Contar vocales");
			System.out.println("6-Numero primo");
			
			
			System.out.println("---------------------------------------");
			System.out.println("Elige una opcion: (0-6): ");
			
			opcion = sc.nextInt();
			sc.nextLine(); // limpiar buffer
			
			switch (opcion) {
			
			case 0: salir();break;
			case 1: numeroMayor(sc);break;
			case 2: tabla(sc);break;
			case 3: sumaAcumulada(sc);break;
			case 4: adivina(rd, sc);break;
			case 5: vocales(sc);break;
			case 6: esPrimo(sc);break;
			
			default :System.out.println("opcion no valida, prueba otra: ");
			}
		}
		

	}

	private static void esPrimo(Scanner sc) {
		boolean esPrimo= true;
		
		System.out.println("Dame un numero y te digo si es o no primo: ");     
		int num = sc.nextInt();
		sc.nextLine();
				
		
		if (num <= 1) {   // cero y uno no son primos
			esPrimo = false;		
		}
		else {
				for (int i=2; i <= Math.sqrt(num); i++  ) {
					if (num % i == 0) {
						esPrimo = false;
						break;
					}
				}	
			
			}
		
		if (esPrimo) {					
				System.out.println(num + " Es primo");
			}
		else {
				System.out.println(num + " No es primo");
			}
		System.out.println("---------------------------------------");
	}

	private static void vocales(Scanner sc) {
		System.out.println("Teclea texto y te cuento las vocales: ");
		int vocales=0;
		String texto=sc.nextLine().toLowerCase();
		
		for (int i=0; i <texto.length(); i++) {
			char letra = texto.charAt(i);
		if (letra == 'a' || letra == 'e' || letra == 'i' || letra == 'o' || letra == 'u') {
			vocales ++;
			}
		
		}
		System.out.printf("El texto tiene: %d vocales. %n", vocales);
		
		System.out.println("---------------------------------------");
	}

	private static void adivina(Random rd, Scanner sc) {
		System.out.println("Adivina un numero entre 1 y 100");
		
		int numeroSecreto = rd.nextInt(100)+1;
		int miNumero=0;
		
		do {
		
			System.out.println("Que numero crees que es?:");
			miNumero=sc.nextInt();
			if(miNumero > numeroSecreto) {
				System.out.println("el numero secreto es menor! ...");
			}
			else if (miNumero < numeroSecreto){
					System.out.println("el numero secreto es mayor! ...");	
			}
			else {
				System.out.println("Enhorabuena !! has acertado el numero.");
				System.out.println("---------------------------------------");
			}
		
		}
		while (numeroSecreto != miNumero);
		sc.nextLine();
	}

	private static void sumaAcumulada(Scanner sc) {
			System.out.println("Dame numeros y los ire sumando (para pulsa 0) ");
			int num;
			int suma=0;
			do {
				System.out.println("dame el numero: ");
				num = sc.nextInt();
				suma += num;
			}
			while (num != 0);
				System.out.println("La suma de los numeros introducidos es: "+ suma);
				System.out.println("---------------------------------------");
			sc.nextLine();
	}

	private static void salir() {
		System.out.println("¡¡ hasta la proxima, adios !!");
		
		
	}

	private static void tabla(Scanner sc) {
		System.out.println("Dame un numero cualquiera y te muestro su tabla de multiplicar:");
		int numero = sc.nextInt();
		for (int i=1 ; i<=10 ; i++) {
		
			System.out.printf ("%d x %d = %d%n", numero, i, (numero*i));
		
		}
		System.out.println("---------------------------------------");
		sc.nextLine();
	}

	private static void numeroMayor(Scanner sc) {
		System.out.println("Dame un numero: ");
		int num1 = sc.nextInt();
		System.out.println("Dame otro numero: ");
		int num2 = sc.nextInt();

		if (num1 > num2) {
			System.out.printf(">>>>>>>>>>>>>> %d es mayor que %d%n  ", num1, num2);
		}
		else if (num2 > num1) {
			System.out.printf(">>>>>>>>>>>>>> %d es mayor que %d%n ", num2, num1);
		}
		else {
			System.out.println(">>>>>>>>>>>>>> Son iguales ");
		}
		sc.nextLine();
		System.out.println("---------------------------------------");
	}

}
