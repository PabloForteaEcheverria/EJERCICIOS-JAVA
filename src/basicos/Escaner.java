package basicos;

import java.util.Scanner;

public class Escaner {
	public static void main(String[]arg) {
	
	  String nombre;
      String apellido;
      int edad;
      
      Scanner sc=new Scanner(System.in);
     
      System.out.println("Cual es tu nombre? :");
      nombre = sc.nextLine();
      System.out.println("Cual es tu apellido? :");
      apellido = sc.nextLine();
      System.out.println("Cual es tu edad? :");
      edad = sc.nextInt();
      sc.nextLine();
      
      System.out.println("hola "+ nombre +" "+  apellido+ " de "+ edad+" años");
      System.out.printf(" hola %s %s de %d años" ,nombre, apellido,edad); 
      sc.close();
	}
}


/*
  		*************   PRINT-F  *************
  		
  		%d 		----> int long (enteros decimales)
  		%.2f	----> float, double (en este caso 2 decimales:   4.56)
  		%s    	----> String
  		%c		----> Char
  		%b 		----> Boolean
  		%n		----> Salto de linea (como \n)
*/