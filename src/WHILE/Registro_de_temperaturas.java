package WHILE;

import java.util.Scanner;

public class Registro_de_temperaturas {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		double temperatura;
		int numTemp=0;
		double maxTemp=0;
		double minTemp=0;		
		double sumaTemp=0;
		
		do {
			System.out.println("Introduce una temperatura");
			temperatura=sc.nextDouble();
			
			
			if (temperatura != 999) {
				numTemp ++;
				sumaTemp =+ temperatura;
				if (temperatura >= maxTemp) {
					maxTemp=temperatura;	
				}
				else if (temperatura <= temperatura) {
					minTemp=temperatura;
				}
			}
			
		}
		while (temperatura != 999);
			
			double media=sumaTemp/numTemp;
			System.out.println("Temperaturas registradas: "+numTemp);
			System.out.println("Temperatura maxima: "+maxTemp);
			System.out.println("Temperatura minima: "+minTemp);
			System.out.println("Media de temperaturas "+media);
			sc.close();
	}

}
