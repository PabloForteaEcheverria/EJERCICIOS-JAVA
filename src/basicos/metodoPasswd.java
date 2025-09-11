package basicos;

import java.util.ArrayList;
import java.util.Arrays;


public class metodoPasswd {

	
	
		private static int[] Numeros = {0, 1, 2, 3};
		private static String[] Personas = { "Yahia", "Saida", "Izar", "Sami", "Amina" };
	
		
		public static void main(String[] args) {
			
// Mostrar Array Numeros: //	
		System.out.println (Arrays.toString(Numeros));
		
// Mostrar Array Personas: //
		System.out.println (Arrays.toString(Personas));
		
		
		Numeros[2]=9;
		System.out.println (Arrays.toString(Numeros));
		
		int nuevoArray[] = new int[6];
		
		for (int i=0 ; i< Numeros.length ; i++) {		

			nuevoArray[i] = Numeros[i];
			
			}
		
		System.out.println (Arrays.toString(nuevoArray));
		
		nuevoArray[5]=1;
		nuevoArray[4]=1;
		System.out.println (Arrays.toString(nuevoArray));
		
	////////////////////////////////////////////////////////////////////////
		
		ArrayList<String> personas2 = new ArrayList<>(); 
		for (int i=0 ; i<Personas.length ; i++) {
		personas2.add(Personas[i]);
			}
		System.out.println(personas2);	
		
		/// vamos a cambiar deposicion 1 a la 4 ////
		String valor1 = personas2.remove(0);  // elimina la posicion 0 y lo guarda.
		String valor2 = personas2.remove(3);  // elimina la posicion 3 (antigua 4, por desplazamiento) y lo guarda.
		personas2.add(3,valor1);	// coloca el valor de la posicion 1 en posicion 4 
		personas2.add(0, valor2);  // coloca el valor de la posicion 4 en posicion 1 
		
		System.out.println(personas2);	
			}
		}
		
		
	
		
	
		

