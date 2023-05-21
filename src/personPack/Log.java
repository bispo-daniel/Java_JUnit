package personPack;

public class Log {
	public String createLog(Person person) {
		System.out.println("Person deleted: " + person.getName());
		return person.getName();
	}
}

// UNTOUCHABLE CLASS