package Switch;

import java.util.Scanner;

public class Switch_con_String {

	public static void main(String[] args) {
		
		System.out.println("elige 'salir' o 'entrar' ");
		Scanner sc = new Scanner(System.in);
		String opcion;
		
		opcion = sc.nextLine().toLowerCase();
		
		
		
		switch (opcion) {
		
		case "entrar": System.out.println("Has elegido entrar.");break;
		case "salir": System.out.println("Has elegido salir.");break;
		default: System.out.println("opcion no validad");
		
		}
		sc.close();

	}

}

// .toLowerCase(); ------> para que discrimine mayusculas y minusculas