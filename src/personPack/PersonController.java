package personPack;

public class PersonController {
	
	private LogMock log;
	
	public PersonController(LogMock log) {
		this.log = log;
	}
	
	public String delete(Person personToDelete) {
		String logString = log.generateLog(personToDelete);
		
		return logString;
	}
}