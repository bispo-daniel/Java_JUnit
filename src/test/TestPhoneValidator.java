package test;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import projectPack.PhoneValidator;

public class TestPhoneValidator {
	
	private PhoneValidator underTest;
	
	@BeforeEach
	void setUp() {
		underTest = new PhoneValidator();
	}
	
	@DisplayName("Test a valid number")
	@Test
	void itShouldTestPhoneValidator() {		
		// Arrange
		String brazillianPhoneNumber = "+5511912344321";
		
		// Act
		boolean result = underTest.test(brazillianPhoneNumber);
		
		// Assert
		assertEquals(true, result);
	}
}