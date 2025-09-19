package ejercicios;

public class Cambio_color {

	public static void main(String[] args) {
		
		final String ROJO =     "\u001B[31m";
        final String VERDE =    "\u001B[32m";
        final String AMARILLO = "\u001B[33m";
        final String AZUL =     "\u001B[34m";
        final String RESET =    "\u001B[0m";
        
        System.out.printf(ROJO + "este texto es rojo\n" + RESET);
        System.out.printf(VERDE + "este texto es verde\n" + RESET);
        System.out.printf(AMARILLO + "este texto es amarillo\n" + RESET);
        System.out.printf(AZUL + "este texto es azul\n" + RESET);   
	}

}
/*
Códigos ANSI para texto en color:

java
public static final String RESET   = "\u001B[0m";
public static final String NEGRO   = "\u001B[30m";
public static final String ROJO    = "\u001B[31m";
public static final String VERDE   = "\u001B[32m";
public static final String AMARILLO= "\u001B[33m";
public static final String AZUL    = "\u001B[34m";
public static final String MORADO  = "\u001B[35m"; // o MAGENTA
public static final String CIAN    = "\u001B[36m";
public static final String BLANCO  = "\u001B[37m";


Colores de fondo:

java
public static final String FONDO_NEGRO   = "\u001B[40m";
public static final String FONDO_ROJO    = "\u001B[41m";
public static final String FONDO_VERDE   = "\u001B[42m";
public static final String FONDO_AMARILLO= "\u001B[43m";
public static final String FONDO_AZUL    = "\u001B[44m";
public static final String FONDO_MORADO  = "\u001B[45m";
public static final String FONDO_CIAN    = "\u001B[46m";
public static final String FONDO_BLANCO  = "\u001B[47m";

*/
