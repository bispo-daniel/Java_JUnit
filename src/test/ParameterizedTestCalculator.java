package test;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.BeforeEach;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import projectPack.Calculator;

public class ParameterizedTestCalculator {
	
	private Calculator calc;
	
	@BeforeEach
	void setUp() {
		calc = new Calculator();
	}
	
	@ParameterizedTest
	@CsvSource({"1, 2, 3", "999, 1, 1000", "777, 223, 1000"})
	void test(int num1, int num2, int expected) {
		// Arrange
		
		
		// Act
		double result = calc.addition(num1, num2);
		
		// Assert
		assertEquals(expected, result);
	}
}