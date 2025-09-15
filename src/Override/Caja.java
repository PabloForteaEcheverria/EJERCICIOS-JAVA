package Override;

public class Caja {
	
		String objeto1;
		String objeto2;
		
		public Caja(String objeto1,String objeto2) {
			this.objeto1=objeto1;
			this.objeto2=objeto2;
		}
		
		@Override
		public String toString() {
			return "Contenido de la caja: "+objeto1+", "+objeto2;
		}
	
	
	
		public static void main(String[] args) {
			
			
			Caja miCaja = new Caja ("oro","plata");
			
			System.out.println(miCaja);
		}
	
	

}
