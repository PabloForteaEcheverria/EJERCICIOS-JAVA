package To_String;

public class Alumno {

	String nombre;
	String apellido;
	int edad;
	String ciudad;
	
	public Alumno (String nombre,
	String apellido,int edad,String ciudad){
	
		this.nombre=nombre;
		this.apellido=apellido;
		this.edad=edad;
		this.ciudad=ciudad;
	}
	
	@Override
	public String toString() {
		return "Nombre: "+nombre+"\n"+
		 "Apellido: "+apellido+"\n"+
		 "Edad: "+edad+"\n"+
		 "Ciudad: "+ciudad+"\n";
	}
	

	public static void main(String[] args) {
	
		Alumno nuevoAlumno = new Alumno("Pablo","Fortea",25,"Bilbao");
		 
		System.out.println("-----> Nuevo alumno añadido: \n"+ nuevoAlumno);
	}
}
