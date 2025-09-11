package Constructores;

import java.util.Scanner;

public class Mascota_nombre_tipo_edad {


	
		String nombre;
		String tipo;     // (perro / gato)
		int edad;
	
	public Mascota_nombre_tipo_edad (String nombre, String tipo, int edad) {
		this.nombre = nombre;
		this.tipo = tipo;
		this.edad = edad;
	}
	
	
	public void informacionMascota () {
		System.out.println("Nombre: " +nombre);
		System.out.println("Tipo: " + tipo);
		System.out.println("Edad: " + edad);
	}
	
	
	@Override
	public String toString() {
		return "Nombre: " + nombre + "\n" +
				"Tipo: " + tipo + "\n" +
				"Edad: " + edad;
	}
	
	
	
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Introduce los siguientes datos: ");
		
		System.out.print("Nombre de mascota: ");
		String nombre=sc.nextLine();
		System.out.print("Tipo de mascota: (perro/gato) ");
		String tipo=sc.nextLine();
		System.out.print("Edad de mascota: ");
		int edad=sc.nextInt();
		sc.nextLine();
		
		
		Mascota_nombre_tipo_edad mascotaNueva = new Mascota_nombre_tipo_edad(nombre, tipo, edad);
		mascotaNueva.informacionMascota	();
		System.out.println(mascotaNueva);
		sc.close();
	}
	
}







/*
Crea una clase llamada Mascota con estos atributos:
String nombre
String tipo (por ejemplo, "Perro", "Gato")
int edad

Requisitos:
Crea un constructor que reciba todos los atributos.

Crea un método llamado mostrarInfo() que imprima los datos de la mascota.

En la clase Main:
Crea un objeto Mascota usando el constructor.
Llama al método mostrarInfo() para ver la información.

opcional usar metodo toString para mostrar informacion.
*/