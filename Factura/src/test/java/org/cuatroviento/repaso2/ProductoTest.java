package org.cuatroviento.repaso2;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class ProductoTest {
	Producto p;
	
	@BeforeEach
	void setUp() throws Exception {
		 p = new Producto("pan",0.50f, 1);
	}

	@Test
	void testPrecioTotal() {
		Producto target = new Producto("ensalada", 1.50f, 3);
		double expected = 4.5f;
		double actual = target.precioTotal();
		assertEquals(expected, actual, "Fail total");
	}

}
