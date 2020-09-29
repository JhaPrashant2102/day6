/**
 * 
 */
package DummyTesting;
import java.util.regex.Pattern;

/**
 * @author prashant
 *
 */
public class UserValidator {
	
	private static final String firstNamePattern = "^[A-Z]{1}[a-z]{2,}$";
	private static final String lastNamePattern = "^[A-Z]{1}[a-z]{2,}$";
	private static final String emailIdPattern = "^[a-zA-Z0-9_+-]+(?:\\.[a-zA-Z0-9]+)*@([a-zA-Z0-9]+\\.)+[a-zA-Z]{2,3}$";
	
	public boolean validateFirstName(String firstName) {
		Pattern pattern = Pattern.compile(firstNamePattern);
		return pattern.matcher(firstName).matches();
	}
	
	public boolean validateEmailId(String emailId) {
		Pattern pattern = Pattern.compile(emailIdPattern);
		return pattern.matcher(emailId).matches();
	}
}
