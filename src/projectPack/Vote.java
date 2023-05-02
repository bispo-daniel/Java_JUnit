package projectPack;

/*Brazilian Voting Age Rule*/

public class Vote {
	public String rule(int age) {
		if(age < 0) {
			throw new IllegalArgumentException("Age cannot be negative");
		} else if (age < 16) {
			return "Cannot";
		} else if (age < 18) {
			return "Can";
		} else if (age < 70) {
			return "Must";
		} else {
			return "Can";
		}
	}
}