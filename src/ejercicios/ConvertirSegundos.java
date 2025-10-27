package ejercicios;

import java.util.Scanner;

public class ConvertirSegundos {

	public static void main(String[] args) {
		int numero;
        int horas;
        int minutos;
        int segundos;
    
        Scanner sc=new Scanner(System.in);
        
        System.out.println("dame el numero que desees en segundos:");
        numero = sc.nextInt();
        horas = numero/3600;
        minutos = (numero - (horas*3600))/60;
        segundos = numero - ((horas*3600)+(minutos*60));
        
        System.out.println("Horas: "+ horas);
        System.out.println("Minutos: "+ minutos);
        System.out.println("Segundos: "+ segundos);
        sc.close();
	}
	
}
/* opcion con %: 
 * numero = sc.nextInt();
        
        horas = numero / 3600;
        minutos = (numero % 3600) / 60;
        segundos = numero % 60;
        
        System.out.println("Horas: " + horas);
        System.out.println("Minutos: " + minutos);
        System.out.println("Segundos: " + segundos);
        
        sc.close();

 * */
