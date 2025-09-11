package FOR;

import java.util.Scanner;

public class Descompone_palabra {
public static void main(String[] args) {
		
		Scanner sc= new Scanner(System.in);
		int posicion=1;
		String palabra;
		
		System.out.println("Escribe una palabra: ");
		palabra=sc.nextLine();
		
		for (int i=0; i<palabra.length(); i++) {
			
			char letra= palabra.charAt(i);
			System.out.println(posicion+": "+letra);
			if (posicion < palabra.length()) {
				posicion ++;
			}
			
		}
	
		sc.close();
	}

}
