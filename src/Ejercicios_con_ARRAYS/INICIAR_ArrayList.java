package Ejercicios_con_ARRAYS;

import java.util.ArrayList;

public class INICIAR_ArrayList {

	public static void main(String[] args) {
		
		ArrayList <String> alumnos = new ArrayList<>();
				
			alumnos.add("Pablo");
			alumnos.add("Juan");
		System.out.println("Lista nombres: ");	
		for (int i=0 ; i<alumnos.size() ; i++) {	
			System.out.println(alumnos.get(i));	
		}
		
		ArrayList <Integer> numerosEnteros = new ArrayList<>();
			
			numerosEnteros.add(2);
			numerosEnteros.add(87);
			System.out.println("Lista numeros: ");	
			for (int z=0 ; z<numerosEnteros.size() ; z++) {
			System.out.println(numerosEnteros.get(z));
		}
		
		//////// vamos a moddificar elemento de lista: 
			
			Integer miBusqueda = numerosEnteros.get(1);
			System.out.printf("Elemento encontrado: %d \n", miBusqueda );
			
			numerosEnteros.set(1,3);
			System.out.printf("Elemento cambiado por 3 \n");
			
		
			System.out.println("Nueva lista numeros: ");		
			for (int z=0 ; z<numerosEnteros.size() ; z++) {	
				System.out.println(numerosEnteros.get(z));
			}	
		
	}

}
