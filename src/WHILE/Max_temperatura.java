package WHILE;

import java.util.Scanner;

public class Max_temperatura {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        double temperatura;
        double maxTemp = Double.NEGATIVE_INFINITY;
        double minTemp = Double.POSITIVE_INFINITY;
        int contador = 0;

        do {
            System.out.println("Introduce temperatura (999 para mostrar resultados):");
            temperatura = sc.nextDouble();

            if (temperatura != 999) {
                if (temperatura > maxTemp) {
                    maxTemp = temperatura;
                }
                if (temperatura < minTemp) {
                    minTemp = temperatura;
                }
                contador++;
            }

        } while (temperatura != 999);

        if (contador > 0) {
            System.out.println("La temperatura máxima introducida es: " + maxTemp + "°C");
            System.out.println("La temperatura mínima introducida es: " + minTemp + "°C");
            System.out.println("Has introducido: " + contador + " temperaturas.");
        } else {
            System.out.println("No se introdujeron temperaturas válidas.");
        }

        sc.close();
    }
}