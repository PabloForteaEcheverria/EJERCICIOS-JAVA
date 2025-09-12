package Constructores;

import java.util.Scanner;

public class Coche {
	
	private String marca;
	private String modelo;
	private int año;
	private int velocidad;
	private static Coche miCoche = null;
	
	public Coche (String marca, String modelo, int año) {
		this.marca=marca;
		this.modelo=modelo;
		this.año=año;
		this.velocidad=0;
	}
//prueba azul//
	@Override
	public String toString() {
		return "Marca: " + marca + "\n" +
				"Modelo: " + modelo + "\n" +
				"Año: " + año+"\n" +
				"velocidad: " + velocidad;
	}
	
	
	public static void main(String[] args) {
		
		 Scanner sc = new Scanner(System.in);
		 int opcion=0;
		 
		 do {
			 
			System.out.println("----- menu -----");
			System.out.println("1-Añadir coche.");
			System.out.println("2-Acelerar. ");
			System.out.println("3-Frenar");
			System.out.println("4-Salir");
			
			opcion = sc.nextInt();
			switch (opcion) {
			
			case 1: anadirCoche(sc);break;
			case 2: acelerarCoche(sc);break;
			case 3: frenarCoche(sc);break;
			case 4: System.out.println("saliendo ...");break;
			
			}
			if (opcion < 1 || opcion > 4 ) {
				System.out.println("Opcion no valida, prueba otra vez.");
			}
			
			
		}
		while(opcion !=4);
		System.out.println("Adios");
		sc.close();
	}

	private static void frenarCoche(Scanner sc) {
		System.out.println("Cuanto frenas?");
		
		
		int frenado = sc.nextInt();
		miCoche.velocidad -= frenado;
		System.out.println(miCoche);
		
	}

	private static void acelerarCoche(Scanner sc) {
		
		System.out.println("Cuanto aceleras?");
		int aceleracion = sc.nextInt();
		miCoche.velocidad += aceleracion;
		System.out.println(miCoche);
		
	}

	private static void anadirCoche(Scanner sc) {
		System.out.println("Introduce los datos del coche: ");
		
		sc.nextLine();
		
		System.out.println("Marca: ");
		String marca = sc.nextLine();
		
		System.out.println("Modelo: ");
		String modelo= sc.nextLine();
		
		System.out.println("Año: ");
		int año= sc.nextInt();
		sc.nextLine();
		
		
	miCoche = new Coche(marca, modelo, año);
		System.out.println("Coche: "+ marca+ ", "+modelo+", del año "+ año+", añadido.");
		
		System.out.println(miCoche);
	}
	
}
