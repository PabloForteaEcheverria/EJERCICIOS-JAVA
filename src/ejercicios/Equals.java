 package ejercicios;

public class Equals {

	public static void main(String[] args) {
		
		String a = "hola";
		String b = new String("hola");
				
		System.out.println("a == b " + (a == b));		// b ocupa otra memoria
		System.out.println("a.equals(b) " + a.equals(b));  //compara literal
	}

}
