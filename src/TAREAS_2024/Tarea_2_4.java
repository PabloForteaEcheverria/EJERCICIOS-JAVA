package TAREAS_2024;

import java.util.Scanner;

public class Tarea_2_4 {

	public static void main(String[] args) {
		 
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Introduce la temperatura en grados Fahrenheit: ");
		float fahrenheit = sc.nextFloat(); 
		
		float celsius = ((fahrenheit - 32) * (5.0f / 9.0f));
		
		System.out.printf("%.2f grados Fahrenheit son  %.2f Celsius.",fahrenheit, celsius);

		sc.close();
	}

}
