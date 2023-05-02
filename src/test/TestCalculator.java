package test;
import projectPack.Calculator;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

class TestCalculator {
	Calculator calc = new Calculator();
	
	@BeforeAll
	static void setup() {
		for(int x = 0; x < 100; x++) {
			System.out.println(x);
		}
	}
		
	@DisplayName("Testing the addition method: 2 + 2 should be 4")
	@Test
	void twoPlusTwoIsFour() {
		assertEquals(4, calc.addition(2, 2));
	}
		
	@DisplayName("Testing the addition method: 19 + 20 != 40")
	@Test
	void testCalculatorAdditionWithError(){
		assertNotEquals(40, calc.addition(19, 20));
		// If assertEquals(40, calc.addition(19, 20));
		// Expected <40.0> but was: <39.0>
	}
		
	@DisplayName("Testing the subtraction method: 15 - 5 != 1")
	@Test
	void zeroPlusZeroShouldntBeNull() {
		assertNotEquals(1, calc.subtraction(15, 5));
		//Subtraction function return 1
		//Expected: Not equal but was <1.0>
	}
	
	@DisplayName("Testing the multiplication method: ")
	@Test
	void shouldThrowAnError() {
		assertEquals(20*2, calc.multiplication(20, 2));
	}
		
	@DisplayName("Testing the division method: 20 / 2 should be 10")
	@Test
	void testCalculatorDivision() {
		assertEquals(10, calc.division(20, 2));
		// Test a broken function... This function returns 0.0
		// Function returns 0.0
		// Expected <10.0> but was: <0.0>
	}
		
	@AfterEach
	void printThisAfterEachTest() {
		System.out.println("The previous test was executed");
	}
		
	@AfterAll
	static void printThisAfterAllTests() {
		System.out.println("Test finished...");
	}
}