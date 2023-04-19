package cadenas;

import static org.junit.Assert.*;

import org.junit.Test;

public class CadenasTest {

	@Test
	public void testLongitud() {
		Cadenas target = new Cadenas();
		double expected = 5;
		double actual = target.longitud("asier");
		assertEquals("Fail Longitud", expected, actual, 0.01);
		double expected2 = 5;
		double actual2 = target.longitud("");
		assertEquals("Fail Longitud", expected2, actual2, 0.01);
	}
	
	@Test
	public void testVocales() {
		Cadenas target = new Cadenas();
		double expected = 3;
		double actual = target.vocales("asier");
		assertEquals("Fail Vocal", expected, actual, 0.01);
		double expected2 = 3;
		double actual2 = target.vocales("");
		assertEquals("Fail Vocal", expected2, actual2, 0.01);
	}
	
	public void testInvertir() {
		Cadenas target = new Cadenas();
		String expected = "reisa";
		String actual = target.invertir("asier");
		assertEquals("Fail Invertir" ,expected, actual);
		String expected2 = "reisa";
		String actual2 = target.invertir("");
		assertEquals("Fail Invertir" ,expected2, actual2);
	}
	
	public void testContarLetra() {
		Cadenas target = new Cadenas();
		double expected = 1;
		double actual = target.contarLetra("asier", 'a');
		assertEquals("Fail Count", expected, actual, 0.01);
		double expected2 = 1;
		double actual2 = target.contarLetra("", 'A');
		assertEquals("Fail Count", expected2, actual2, 0.01);
	}
	}

}
