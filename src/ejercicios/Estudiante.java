package ejercicios;

public class Estudiante {
	
	String nombre;
	int edad;
	double promedio;
	boolean aprobado= false;
	
	public Estudiante (String nombre, int edad, double promedio) {
		this.nombre=nombre;
		this.edad=edad;
		this.promedio=promedio;
	}
	
	public void esAprobado() {
		if (promedio >= 6) {
			aprobado=true;
			System.out.println("Esta aprobado.");
		}
		else  {
			System.out.println("Esta suspendido.");
		}
	}
	
	public static void main(String[] args) {
		
		Estudiante alumno1 = new Estudiante("Pablo", 30, 4);
		alumno1.esAprobado();
		
		Estudiante alumno2 = new Estudiante("Saida", 28, 6);
		alumno2.esAprobado();
		
		
	}

}
