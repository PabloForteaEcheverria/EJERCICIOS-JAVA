package FOR;

public class Impares_del_1_al_30 {
	public static void main(String[] args) {
		
		for (int i=1 ; i<=30 ; i+= 2) {

			if (i == 29) {
				System.out.print(i+".");
			}
			else {
				System.out.print(i+", ");
			}
		}
	}
}
