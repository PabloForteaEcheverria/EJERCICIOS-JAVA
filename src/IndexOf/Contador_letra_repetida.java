package IndexOf;

import java.util.Scanner;

public class Contador_letra_repetida {

	public static void main(String[] args) {
		
	
		String palabra;
		Scanner sc = new Scanner(System.in);
		System.out.println("Dame la palabra");
		palabra=sc.nextLine().toLowerCase();
		
		  // Recorremos cada letra
        for (int i = 0; i < palabra.length(); i++) {
            char letra = palabra.charAt(i);


            // Solo contamos si es la primera vez que vemos esa letra
            if (palabra.indexOf(letra) == i) {
                int contador = 0;

                // Recorremos toda la palabra para contar repeticiones
                for (int j = 0; j < palabra.length(); j++) {
                    if (palabra.charAt(j) == letra) {
                        contador++;
                    }
                }
                System.out.println("Letra: " + letra + ", Repeticiones: " + contador);
            }
            
        }
    sc.close();
	}
}


            
