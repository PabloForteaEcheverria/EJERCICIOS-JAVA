package BOOLEAN;

import java.util.Scanner;

public class Comprobar_contraseña {
	public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        String contrasenaCorrecta = "java123";
        boolean esValida = false;

        System.out.print("Introduce la contraseña: ");
        String entrada = sc.nextLine();

        if (entrada.equals(contrasenaCorrecta)) {
            esValida = true;
        }

        if (esValida) {
            System.out.println("Contraseña correcta. Acceso permitido.");
        } else {
            System.out.println("Contraseña incorrecta. Acceso denegado.");
        }
        	sc.close();
    }
}
