package com.blakesley;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotEquals;

import org.junit.jupiter.api.Test;

public class CalculatorTest {
	
	private Calculator calculator = new Calculator();
	
	@Test
	public void testAdd() {
		
		assertEquals(calculator.add(0, 0), 0,0.001); //third argument is a tolerance check for floating point values
		assertNotEquals(calculator.add(0, 1), 0);
		
	}

}
