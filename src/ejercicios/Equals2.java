package ejercicios;

import java.util.Scanner;

public class Equals2 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		String a;
		String b;
		
		System.out.println("Escribe un texto: ");
		a=sc.nextLine();
		
		System.out.println("Escribe otra vez el texto: ");
		b=sc.nextLine();
		
		System.out.println(" primer texto == segundo texto :"+ (a == b));
		System.out.println(" primer texto .equals(segundo texto) :"+ a.equals(b));
	
		sc.close();
	}
		
}

// comparamos dos textos, con == su lugar en memoria y con equals literal