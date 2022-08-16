package com.blakesley;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotEquals;
import static org.mockito.Mockito.when;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;


public class AdvancedCalculatorTest {
	
	//We want to replace the instance of the Calculator with a Mock object
	// The mock object will act excatly as we'd like, by telling it to "return" something when something is being passed
	
	
	@Mock
	private Calculator calculator;

private AdvancedCalculator aCalc;

	
	@SuppressWarnings("deprecation")
	@BeforeEach
	public void setup() {
		//if we don't call below, we will get NullPointerException
		MockitoAnnotations.initMocks(this);
	}
	
	@Test
	public void testAdvancedAdd() {
		
		
		
		when(calculator.add(1, 2)).thenReturn(3.0); // we don't rely on an implementation
		when(calculator.add(3, 3)).thenReturn(6.0); // we just tell it how to respond. 
		when(calculator.add(0, 0)).thenReturn(0.0);
		when(calculator.add(0, 1)).thenReturn(1.0);
		
		aCalc = new AdvancedCalculator(calculator);

		
		assertEquals(aCalc.advancedAdd(1, 2, 3), 6,0.001); //third argument is a tolerance check for floating point values
		assertNotEquals(aCalc.advancedAdd(0, 0, 1), 0,0.001);
		
	}

}
