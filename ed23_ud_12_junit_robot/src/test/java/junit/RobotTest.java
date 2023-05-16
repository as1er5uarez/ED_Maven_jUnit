package junit;

import static org.junit.jupiter.api.Assertions.*;


import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class RobotTest {
	
	Robot r1;
	Robot r2;
	Robot r3;
	Robot r4;

	@BeforeEach
	void setUp() throws Exception {
		Robot r1 = null;
		Robot r2 = new Robot("2", 10);
		Robot r3 = new Robot("3", 100);
		Robot r4 = new Robot("4", 1000);
	}

	@Test
	void testIfNull() {
		assertNull(r1);
		
	}
	
	@Test
	void testIfNotNull() {
		assertNotNull(r1);
	}
	
	@Test
	void testInitialAutonomy() {
		double target = r3.getAutonomy();
		double expected = 42;
		assertTrue(target == expected);
	}
	
	@Test
	void testSameObject() {
		assertSame(r3, r4);
	}

}
