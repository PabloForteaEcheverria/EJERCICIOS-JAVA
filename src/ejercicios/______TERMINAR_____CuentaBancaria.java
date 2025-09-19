package ejercicios;

import java.util.Scanner;

public class ______TERMINAR_____CuentaBancaria {
		
	
		
		static final String VERDE =    "\u001B[32m";
		static final String AMARILLO = "\u001B[33m";
		static String RESET =    "\u001B[0m";
		String numeroCuenta;
		String titular;
		double saldo=0;
		static int contadorCuentas=0;
		
		public ______TERMINAR_____CuentaBancaria (String numeroCuenta, String titular, double saldo) {
		this.numeroCuenta=numeroCuenta;
		this.titular=titular;
		this.saldo=saldo;
		contadorCuentas++;
		
		}
		
		@Override
		public String toString() {
			return "¡¡ Cuenta creada correctamente !! \n" +  
					"Numero de cuenta: "+ numeroCuenta+ "\n"+
					"Titular de la cuenta: "+ titular+ "\n"+
					"Saldo inicial: "+ saldo + " euros\n";
				 
		}
		
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int opcion=0;	
		
		do {
			System.out.println(AMARILLO + " --- menu ---"+ RESET );
			System.out.println("1- Crear cuenta.");
			System.out.println("2- Ingresar dinero.");
			System.out.println("3- Retirar dinero.");
			System.out.println("4- Mostrar cuentas.");
			System.out.println("5- Salir.");
			 
			System.out.println(AMARILLO + "Elige una opcion: "+ RESET );
			opcion = sc.nextInt();
			sc.nextLine();
			
			switch (opcion) {
			case 1: crearCuenta(sc);break;
			case 2: ingresarDinero(sc);break;
			case 4: mostrarCuentas(sc);break;
			}
		}
		
		while (opcion >0 && opcion <=5);
		sc.close();
	}


	private static void mostrarCuentas(Scanner sc) {
		
	}

	private static void ingresarDinero(Scanner sc) {
		// TODO Auto-generated method stub
		
		
	}

	private static void crearCuenta(Scanner sc) {
		System.out.print("Numero de cuenta: ");
		String numeroCuenta = sc.nextLine();
		
		System.out.print("Nombre del titular: ");
		String titularCuenta = sc.nextLine();
		
		System.out.print("Saldo: ");
		double saldoCuenta = sc.nextDouble();
	
		sc.nextLine();
		______TERMINAR_____CuentaBancaria nuevaCuenta = new ______TERMINAR_____CuentaBancaria(numeroCuenta, titularCuenta,saldoCuenta); 
		System.out.println(VERDE);
		System.out.println(nuevaCuenta);
		
	}

}
