
/*### Ejercicio 1: Sumar Elementos

Crea un programa que defina un array de 5 números enteros y calcule la suma de todos los elementos.
*/
package Ejercicios_con_ARRAYS;

public class Sumar_elementos {

	public static void main(String[] args) {
		
		int suma = 0;
		
		int [] numerosEnteros = {2,5,4,7,68};
		
		for (int i=0 ; i<numerosEnteros.length ; i++) {
			System.out.println(numerosEnteros[i]);
			suma += numerosEnteros[i] ;
		}
		System.out.println("La suma de los numeros es: "+ suma);
	}	
}
