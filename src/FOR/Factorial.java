package FOR;

import java.util.Scanner;

public class Factorial {

	public static void main(String[] args) {
		
        
        Scanner sc = new Scanner(System.in);
        System.out.println("Dame un número y calculamos el factorial:");
     
        int num=sc.nextInt();
        
       int factorial =1;
        
        for( int i=1 ; i <=num ; i++) {
        	 factorial *= i;
        	
        }
       
        
        System.out.println("El factorial de " + num + " es: " + factorial);
        sc.close();
    }
}