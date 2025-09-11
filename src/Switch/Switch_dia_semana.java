package Switch;

import java.util.Scanner;

public class Switch_dia_semana {

	public static void main(String[] args) {
	
		System.out.println("Dame dia de la semana (del 1 al 7)...");
		
		Scanner sc =new Scanner(System.in);
		int dia= sc.nextInt();
		
		switch (dia)
		{
		case 1: System.out.println("lunes");break;
		case 2: System.out.println("martes");break;
		case 3: System.out.println("miercoles");break;
		case 4: System.out.println("jueves");break;
		case 5: System.out.println("viernes");break;
		case 6: System.out.println("sabados");break;
		case 7: System.out.println("domingo");break;
		default: System.out.println("Opcion no validad");     //////   SIN BREAK   ///////
		}
		sc.close();
	}

}
