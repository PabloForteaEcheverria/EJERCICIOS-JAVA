package basicos;

import java.util.Scanner;

public class ClasificacionExamen {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Dame la nota del examen: ");
		double nota = sc.nextDouble();
		
		
		
		if (nota >= 5)
		{
		System.out.println("has aprovado");
		}
		else
		{
		System.out.println("Has suspendido");
		}
		sc.close();
	}
}


/* Si la condicion IF tiene solo una instruccion se pueden omitir las llaves `{}'
 */