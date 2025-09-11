package basicos;
import static java.lang.Math.*;
import java.util.Scanner;

class AreaPerimetro {

	public static void main(String[] args) {
		
		double area, perimetro, radio;
		
		Scanner sc=new Scanner(System.in);
		
			System.out.println("Dame el radio de la circunferencia: ");
			
			
			radio=sc.nextDouble();
			perimetro = 2 * PI * radio;
			area= PI * pow(radio,2);
			
			System.out.printf("El area de la circunferencia de radio %.0f es : %.2f\n", radio, area);
			System.out.printf("El perimetro de la circunferencia de radio %.0f es : %.2f", radio, perimetro);
			
			sc.close();
	}

}
			//   ------   Notas   ------    //

			/* tambien se puede declarar una 'constante' (ejemplo PI) y asignarle un valor fijo, 
			 * de la siguiente manera----->    final double PI= 3.141592;   */


			//colocando \n ------->   al final de print salta a la linea siguiente.
			//para PI, importar --->   import static java.lang.Math.*;
			// perimetro es ------->   2 pi x radio
			// area es ------------>   pi x radio al cuadrado
			// valor al cuadrado:  pow(radio,2)   ----> 		potencia radio al cuadrado
			
			