package Ejercicios_con_ARRAYS;

public class Iniciar_acceder_modificar {

	public static void main(String[] args) {
		int [] numeros = {1,2,3,4,5};   // INICIAR: Array con valores iniciales
		
		int primerNumero = numeros [0];		// ACCEDE al primer numero
		int segundoNumero = numeros [1];	// ACCEDE al segundo numero
		int tercerNumero = numeros [2];		// ACCEDE al tercer numero
		int cuartoNumero = numeros [3];		// ACCEDE al cuarto numero
		int quintoNumero = numeros [4]; 	// ACCEDE al quinto numero
		
		System.out.println(numeros[0]);
		
		numeros [0] = 10;  					// CAMBIA el prmimer elemento a 10
		
		System.out.println(numeros[0]);
	}
}
	
