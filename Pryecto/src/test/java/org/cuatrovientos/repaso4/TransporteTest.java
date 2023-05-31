package org.cuatrovientos.repaso4;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class TransporteTest {

	@BeforeEach
	void setUp() throws Exception {
	}

	@Test
	void testPesoTotal() {
		Camioneta target = new Camioneta();
		Paquete p = new Paquete("Zapatillas", 2);
		target.incluirPaquete(p);
		float actual = 2;
		float expected = target.pesoTotal();
		assertEquals(actual, expected, "Fail");
	}
	
	@Test
	void testRecorrerDistancia() {
		Trailer target = new Trailer();
		float expected = target.recorrerDistancia();
		assertTrue(expected >= 70 || expected <= 100);
	}
	

}
