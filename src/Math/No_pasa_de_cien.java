package Math;

public class No_pasa_de_cien {

	public static void main(String[] args) {
	
		int bateria = 87;
		
		bateria = Math.min(100, bateria);
		
		System.out.println(bateria);
	}

}
/*
linea 8 ----> Math.max: devuelve el valor MINIMO entre
 el valor  "bateria" y 0. 
 De esta manera si es mayor de 100 (en este caso) 
 siempre devuelve 100 y si es inferior su valor.
*/