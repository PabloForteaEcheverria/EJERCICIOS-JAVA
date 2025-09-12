package TAREAS_2024;

import java.util.Scanner;

public class Tarea_2_5 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Introduce la edad:");
			int edad = sc.nextInt();
			
			System.out.println(edad > 18? "Mayor de edad." : "Menor de edad");
			
			sc.close();
	}

}
