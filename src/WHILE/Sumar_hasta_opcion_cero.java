package WHILE;

import java.util.Scanner;

public class Sumar_hasta_opcion_cero {

	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
				
		int numero=0;
		int resultado=0;
		
		System.out.println("Introduce numero: ");
		numero=sc.nextInt();	
		
		while (numero != 0) {
						
					resultado +=numero;   // se añade a resultado el ultimo valor  añadido
					
					System.out.println( "Introduce otro número (0 para terminar):");
					numero=sc.nextInt();
		}
		
		System.out.println("El resultado de sumarlos es: "+ resultado);
		sc.close();
	}

}
