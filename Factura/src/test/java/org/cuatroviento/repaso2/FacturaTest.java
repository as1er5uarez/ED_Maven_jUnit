package org.cuatroviento.repaso2;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class FacturaTest {
	
	@BeforeEach
	void setUp() throws Exception {
	}

	@Test
	void testTotalFactura() {
		Factura f = new Factura();
		Producto p = new Producto("Arroz", 3, 2);
		Producto p2 = new Producto("Bacalao", 3, 2);
		f.meterProducto(p);
		f.meterProducto(p2);
		double expected = 12;
		double actual = f.totalFactura();
		assertEquals(expected, actual, "Fail factura total");
	}
	
	@Test
	void testAplicarIva() {
		Factura f = new Factura();
		Producto p = new Producto("Arroz", 3, 2);
		Producto p2 = new Producto("Bacalao", 3, 2);
		f.meterProducto(p);
		f.meterProducto(p2);
		double expected = 6;
		double actual = f.aplicarIva(2);
		assertEquals(expected, actual, "Fail factura total");
	}

}
