package ejercicios;

import java.util.Scanner;

public class Es_primo {

	public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Introduce un número: ");
        int numero = sc.nextInt();

        boolean esPrimo = true;

        if (numero <= 1) {
            esPrimo = false; // 0 y 1 no son primos
        }
        else {
            for (int i = 2; i <= Math.sqrt(numero); i++) {
	                if (numero % i == 0) {
	                    esPrimo = false;
	                    break;
	                }
	            }
	        }

        if (esPrimo) {
            System.out.println(numero + " es primo.");
        } else {
            System.out.println(numero + " no es primo.");
        }

        sc.close();
    }

}