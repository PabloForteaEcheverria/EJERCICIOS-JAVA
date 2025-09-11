package Switch;

import java.util.Scanner;

public class SwitchNumeroOperacion {
	public static void main(String[] args) {
		
		double num1, num2;
		int operacion;
		
		Scanner sc=new Scanner(System.in);
		 
		System.out.println("Dame un numero: ");
		num1= sc.nextDouble();
		System.out.println("Dame otro numero: ");
		num2= sc.nextDouble();
		System.out.println("quieres sumarlos `1` o restarlos `2`  ");
		operacion= sc.nextInt();
		
			if (operacion >0 && operacion <=2) {
				switch (operacion)
				{
				case 1: System.out.printf("La suma de %.2f y %.2f es %.2f", num1, num2, (num1+num2)); break;
				case 2: System.out.printf("La resta de %.2f y %.2f es %.2f", num1, num2, (num1-num2)); break;
				}
			}
				else
				{
					System.out.println("Opcion no validad");
					sc.close();
			}	
	}	
}
