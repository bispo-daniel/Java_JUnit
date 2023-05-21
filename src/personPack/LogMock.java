package personPack;

public class LogMock implements LogGenerator {
	
	@Override
	public String generateLog(Person person) {
		String personName = person.getName();
		System.out.println("Person removed: " + personName);
		return personName;
	}
}