package Constructores;

import java.util.Scanner;

public class Auto {

	String marca;
	String modelo;
	
	public Auto (String marca, String modelo) {
		this.marca=marca;
		this.modelo=modelo;
	}
	
	@Override
	public String toString() {
		return "Marca: "+ marca +"\nModelo: "+modelo;
	}
	
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		anadirCoche(sc);
		

	}

	private static void anadirCoche(Scanner sc) {
		System.out.println("Marca: ");
		String marca=sc.next();
		System.out.println("Modelo: ");
		String modelo=sc.next();
		Auto auto = new Auto(marca,modelo);
		
		System.out.println("Automovil añadido: \n"+ auto);
	}

}
