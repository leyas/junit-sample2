package pl.szymonleyk.junit;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.Test;

public class CalculatorTest {

	@Test
	void addTest1() {
		assertEquals(5, Calculator.add(3,2));
	}
	
	@Test
	void addTest2() {
		assertEquals(16, Calculator.add(3,2,5,6));
	}
	
	@Test
	void addTest3() {
		assertNotEquals(5, Calculator.add(55,2));
	}
	
	@Test
	void addTest4() {
		assertTrue(Calculator.add(4,4) > 3);
	}
	
	@Test
	void substractTest() {
		assertEquals(55, Calculator.substract(100, 45));
	}
	
	@Test
	void divideTest() {
		assertEquals(1.0, Calculator.divide(2,2));
	}
	
	@Test
	void multipleTest() {
		assertEquals(25, Calculator.multiple(5,5));
	}
}
