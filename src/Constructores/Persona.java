package Constructores;

import java.util.Scanner;


public class Persona {
	 String nombre;
	 int edad;
	 
	 @Override
		public String toString() {
		 return "Nombre: "+ nombre + ", "+"edad: "+edad;
	 }
	 
public static void main(String[] args) {	
			Scanner sc = new Scanner(System.in);	
			anadirPersona(sc);
			sc.close();
		}	
public Persona (String nombre, int edad) {
	this.nombre=nombre;
	this.edad=edad;
}	
public  void mostrarInformacion() {
	System.out.println( "Nombre: "+ nombre+ ", edad: "+edad);		
}
private static void anadirPersona (Scanner sc) {	
		System.out.println("Dame el nombre: ");
		String nombre = sc.nextLine();
		System.out.println("Dame la edad: ");
		int edad = sc.nextInt();
		
		Persona persona = new Persona( nombre, edad);
		persona.mostrarInformacion();
		System.out.println(persona);
	}
}
