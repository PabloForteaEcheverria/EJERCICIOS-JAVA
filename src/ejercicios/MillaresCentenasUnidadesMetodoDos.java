package ejercicios;

import java.util.Scanner;

public class MillaresCentenasUnidadesMetodoDos {
	 public static void main(String[] args) {
	        
		 Scanner scanner = new Scanner(System.in);

	        System.out.println("Introduce un número de 4 cifras:");
	        int numero = scanner.nextInt();

	       
	            int millares = numero / 1000;
	            int centenas = (numero % 1000) / 100;
	            int decenas = (numero % 100) / 10;
	            int unidades = numero % 10;

	            // Mostrar los resultados
	            System.out.println("Millares: " + millares);
	            System.out.println("Centenas: " + centenas);
	            System.out.println("Decenas: " + decenas);
	            System.out.println("Unidades: " + unidades);
	       

	        scanner.close();
	    }


}
