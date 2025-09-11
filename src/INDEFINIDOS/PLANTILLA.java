package INDEFINIDOS;

public class PLANTILLA {

	public static void main(String[] args) {
		
		  int contador=0;
		  do {
  
				  if (contador == 0) {
					  System.out.printf(" %d", contador);
					  contador++;
				  }
				  else if(contador >= 1) { 
					  System.out.printf(", %d", contador);
					  contador++;
				  }
		  	}
		  while (contador != 10); {
			  System.out.printf(", %d.", contador);
		  }
	}
}
