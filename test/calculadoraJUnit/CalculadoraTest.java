package calculadoraJUnit;

import static org.junit.Assert.*;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class CalculadoraTest {
	
	private Calculadora cal;
	private int res;
	
	@Before
	public void inicioPruebas() {
		cal=new Calculadora(30,10); //creamos el objeto
	}
	@After
	public void finPruebas() {
		cal=null; //eliminamos el objeto
	}

	@Test
	public void testSuma() {
		res=cal.suma();
		assertEquals(40, res);//valor esperado y devuelto
	}

	@Test
	public void testResta() {
		
		 res=cal.resta();
		assertEquals(20,res); //valor esperado y el devuelto
	}

	@Test
	public void testMultiplica() {
		 res=cal.multiplica();
		assertEquals(300, res); //valor esperado y devuelto
	}

	@Test
	public void testDivide() {
		 res=cal.divide();
		assertEquals(3, res);
	}
	
	@Test(expected=java.lang.ArithmeticException.class)
	public void testDivideExcepcion() {
		Calculadora cal2=new Calculadora(30,0);
		int res2=cal2.divide();
}
}
