package FOR;

public class Del_1_al_100_par_o_impar {

	public static void main(String[] args) {
		
		int i;
		
		for (i=1 ; i<=100 ; i++) {
			if (i % 2 == 0) {
				System.out.println(i +" es par.");
			}
			else {
				System.out.println(i +" es impar.");
			}
		}

	}

}
