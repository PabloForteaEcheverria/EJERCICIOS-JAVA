package FOR;

import java.util.Scanner;

public class Tabla_multiplicar {

	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		System.out.println("De que numero quieres que te muestre su tabla de multiplicar?:");
		int num = sc.nextInt();
		int i;
		
		for (i=1 ; i<=10 ; i++) {
			System.out.println(num + " x "+i+" = "+ (num*i));
			sc.close();
		}
		
	}

}
