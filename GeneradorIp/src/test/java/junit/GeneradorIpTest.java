package junit;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.RepeatedTest;
import org.junit.jupiter.api.Test;

class GeneradorIpTest {
	
	Generador g;

	@BeforeEach
	void setUp() throws Exception {
		g = new Generador();
	}

	@RepeatedTest(10)
	void testGenerarNumero() {
		int target = g.generarNumero(0, 254);
		assertTrue(target > 0 && target <= 254);
	}
	
	@Test
	void testGenerarIp() {
		String target = g.generarIp();
		assertTrue(!target.startsWith("0") && !target.endsWith("0"));
	}
}
