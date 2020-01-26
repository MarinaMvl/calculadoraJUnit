package calculadoraJUnit;

import static org.junit.Assert.*;
import java.util.*;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameters;;

@RunWith(Parameterized.class)
public class CalculadoraTestParametrizada {
private int num1;
private int num2;
private int res;

   //contructor
 public CalculadoraTestParametrizada(int n1, int n2, int r) {
	num1=n1;
	num2=n2;
	res=r;
	
}
 
  @Parameters //en este metodo introdiucimos la bateria de pruebas
public static Collection<Object[]>numeros(){
	//bateria de pruebas a realizar
	return Arrays.asList(new Object[][]{
		{10,10,100},{2,5,10},{-3,-4,12},{-2,7,-14}});	
	
	
}

//creamos el test parametrizado
	@Test
	public void testMultiplica() {
		Calculadora cal=new Calculadora(num1, num2);
		int resultado=cal.multiplica();
		assertEquals(res,resultado);//valor esperado y devuelto
	}

}
