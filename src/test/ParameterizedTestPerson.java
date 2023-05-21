package test;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import personPack.LogMock;
import personPack.Person;
import personPack.PersonController;

public class ParameterizedTestPerson {
	private Person person;
	private PersonController controller;
	private LogMock log;
	
	@BeforeEach
	void setUp() {
		// Arrange
		person = new Person();
		log = new LogMock();
		controller = new PersonController(log);
	}
	
	@DisplayName("Log should return person name")
	@ParameterizedTest
	@CsvSource({"James", "Bob", "John", "Chris", "Jimi"})
	void testIt(String nameExpected) {
		// Act
		person.setName(nameExpected);
		
		String personDeleted = controller.delete(person);
		
		// Assert
		assertEquals(nameExpected, personDeleted);
	}
}