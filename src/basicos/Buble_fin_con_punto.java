package basicos;

public class Buble_fin_con_punto {



public static void main(String[] args) {
	
	  int contador=20;
	  
	  while (contador <= 40 && contador % 2 == 0){
		  if (contador == 20) {
			  System.out.print( contador);
		  }
		  else if (contador == 40){
			  System.out.print(", "+ contador+ ".");
		  }
		  else {
			  System.out.print(", "+ contador);
		  }
		  contador += 2;
		  
	  }
	}
}
