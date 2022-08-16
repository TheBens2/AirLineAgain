package com.blakesley;

public class AdvancedCalculator {
	
	private Calculator calc;
	
	public AdvancedCalculator(Calculator calc) {
		this.calc = calc;
	}
	
	
	public double advancedAdd(double x, double y, double z) {
		
		double initalValue = calc.add(x, y);
		double finalValue = calc.add(initalValue, z);
		
		return finalValue;
		
	}

}
