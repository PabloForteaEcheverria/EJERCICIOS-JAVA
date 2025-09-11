package FOR;

public class Multiplos_de_3 {

	public static void main(String[] args) {
		
		
		
		for (int i=3 ; i<=99 ; i+= 3) {
			if (i == 3) {
				System.out.print(i);
			}
			else if(i >= 99) {
				System.out.print(", "+i+".");
			}
			else {
				System.out.print(", "+i);
			}
					
		}
	}

}
