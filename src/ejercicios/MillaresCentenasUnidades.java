package ejercicios;

import java.util.Scanner;

public class MillaresCentenasUnidades {

	public static void main(String[] args) {
		int numero;
		int millares;
		int centenas;
		int decenas;
		int unidades;
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("dame un numero de 4 digitos: ");	
		numero=sc.nextInt();
		
		millares=(numero/1000);
		System.out.println("Millares: "+ millares);
		
		centenas=(numero-(millares*1000))/100;
		System.out.println("Centenas: "+ centenas);
		
		decenas=(numero-((millares*1000)+(centenas*100)))/10;
		System.out.println("decenas: "+ decenas);
		
		unidades=numero-((millares*1000)+(centenas*100)+(decenas*10));
		System.out.println("unidades: "+ unidades);
	
		sc.close();
	}
	
}
