package Math;

public class No_baja_de_cero {
	public static void main(String[] args) {
		
		int bateria = -3;
		
		bateria =Math.max(bateria,0);
		
		System.out.println(bateria);
		
	}
}

/*
linea 8 ----> Math.max: devuelve el valor maximo entre
 el valor de "bateria" y 0. de esta manera si es negativo 
 siempre devuelve 0 y si es positivo su valor.
*/