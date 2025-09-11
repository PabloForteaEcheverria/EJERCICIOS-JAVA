package IndexOf;

import java.util.Scanner;

public class Serie_de_numeros {

	public static void main(String[] args) {

		int nota;
		
		
		 Scanner sc = new Scanner(System.in);
	 
		do {
			System.out.println("Dame nota: (0-100)");
			nota=sc.nextInt();
			
			if (nota < 0 || nota > 100) {
	            System.out.println("La nota debe estar entre 0 y 100.");
			}
			
		
			else if (nota >=60){
				System.out.println("Aprobado.");
			}
			else if (nota > 0) {
				System.out.println("Suspendido.");
			}
			System.out.println();
			
		}
		while (nota > 100 || nota < 0);
			
	sc.close();	
		}
}

