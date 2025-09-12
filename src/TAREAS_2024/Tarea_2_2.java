package TAREAS_2024;

import java.util.Scanner;

public class Tarea_2_2 {
	public static void main(String[] args) {
	
		Scanner sc = new Scanner(System.in);
		
		int horas;
		int min;
		int sg;
		
		System.out.println("Dame el total de sg: ");
		int numero=sc.nextInt();
		
		horas = (numero / 3600);
		min = (numero % 3600) / 60 ;
		sg = numero % 60;
		
		System.out.printf("Horas: %d %n", horas);
		System.out.printf("Minutos: %d %n", min);
		System.out.printf("Segundos: %d", sg);
	sc.close();
	}
}
