package basicos;

public class Multiplos_de_3 {
	public static void main(String[] args) {
		
		  int contador=15;
		  
		  while(contador <=45) {
			  if (contador == 15 && contador%3 ==0) {
				  System.out.print(contador);
			  }
			  else if (contador == 45 && contador%3 == 0) {
				  System.out.print(", "+contador+ ".");
			  }
			  else {
				  System.out.print(", "+contador);
			  }
			  contador += 3;
		  }

		}//main
}
