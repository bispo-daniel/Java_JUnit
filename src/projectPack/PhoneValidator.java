package projectPack;

import java.util.function.Predicate;

public class PhoneValidator implements Predicate<String> {

	@Override
	public boolean test(String phoneNumber) {
		String number = phoneNumber.trim();
		
		return number.startsWith("+55") && number.length() == 14;
		
	}
}