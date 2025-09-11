package Switch;

import java.util.Scanner;

public class SwitchNumeroOperacionMetodos {
	
	double num1, num2;
	
	public static void main (String[]arg) {
		Scanner sc=new Scanner(System.in);
		int opcion;
		
		do { 
					System.out.println();
					System.out.println("***** menu*****");
					System.out.println("1 - metodo para la suma dos numeros");
					System.out.println("2 - metodo para la resta de dos numeros");
					System.out.println("3 - salir");
					System.out.println();
					System.out.println("Elije una opcion:");
					
					opcion=sc.nextInt();
					
					
					switch(opcion) {
										case 1:sumarNumeros(sc);break;
										case 2:restarNumeros(sc);break;
										case 3:salir();break;
										default: System.out.println("opcion no valida, elije bien...");
									}
					
			}
		
		while (opcion >0 && opcion <=4);
			sc.close();
}
		private static void restarNumeros(Scanner sc) {
		
			double num1, num2;
			System.out.println("Dame un numero: ");
			num1= sc.nextInt();
			System.out.println("Dame otro numero: ");
			num2= sc.nextInt();
		
			System.out.printf("La resta de %.2f y %.2f es %.2f\n", num1, num2, (num1-num2)); 
			System.out.println("La resta de "+num1+" y "+ num2+" es "+ (num1-num2));	
		
	}

		private static void sumarNumeros(Scanner sc) {
		
			double num1, num2;
			System.out.println("Dame un numero: ");
			num1= sc.nextInt();
			System.out.println("Dame otro numero: ");
			num2= sc.nextInt();
			
		
		System.out.printf("La suma de %.2f y %.2f es %.2f", num1, num2, (num1+num2)); 
		
		}
		
		public static void salir() {
			System.out.println("gero arte - adios ");
			
			System.exit(0);
		
		}
	
	}


