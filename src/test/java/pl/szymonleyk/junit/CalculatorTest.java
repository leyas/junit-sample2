package pl.szymonleyk.junit;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class CalculatorTest {

	@Test
	@DisplayName("3 + 2 = 5")
	void addTest1() {
		assertEquals(5, Calculator.add(3, 2));
	}

	@Test
	@DisplayName("3 + 2 + 5 + 6 = 16")
	void addTest2() {
		assertEquals(16, Calculator.add(3, 2, 5, 6));
	}

	@Test
	@DisplayName("55 + 2 != 5")
	void addTest3() {
		assertNotEquals(5, Calculator.add(55, 2));
	}

	@Test
	@DisplayName("4 + 4 > 3")
	void addTest4() {
		assertTrue(Calculator.add(4, 4) > 3);
	}

	@Test
	@DisplayName("100 - 45 = 55")
	void substractTest() {
		assertEquals(55, Calculator.substract(100, 45));
	}

	@Test
	@DisplayName("2 / 2 = 1.0")
	void divideTest() {
		assertEquals(1.0, Calculator.divide(2, 2));
	}

	@Test
	@DisplayName("5 * 5 = 25")
	void multipleTest() {
		assertEquals(25, Calculator.multiple(5, 5));
	}
}
