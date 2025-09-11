import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;
import org.Junit.Test;

class CuentaBancariaTest {

	private CuentaBancaria cuenta; 
	
	
	@Before
	public void inicioPrueba() {
		
		cuenta = new CuentaBancaria(6000);
	}
	
	
	@Test
	public void  testObtenerSaldo() {
		
		assertEquals(6000, cuenta.obtenerSaldo(), 0);	
	}
	
	@Test
	public void testIngresarDinero() {
		cuenta.ingresar(300);
		assertEquals(6300, cuenta.obtenerSaldo(), 0);
	}
	
	@Test
	public void testRetirarDinero() {
		cuenta.retirar(2000);
		assertEquals(4000, cuenta.obtenerSaldo(), 0);
	}
	
	@Test
	public void testRetiroExcesivo() {
		cuenta.retirar(7000);
		assertEquals(6000, cuenta.obtenerSaldo(), 0);	
	}

}
