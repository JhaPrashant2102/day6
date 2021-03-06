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
	private static final String phoneNumberPattern = "^[0-9]{2}[: :][0-9]{10}$";
	private static final String passwordPattern = "^(?=.[!@#$%^&*]{1})(?=.*[A-Z])(?=.*[0-9])[a-zA-Z]{5,}$";
	public boolean validateFirstName(String firstName) {
		Pattern pattern = Pattern.compile(firstNamePattern);
		return pattern.matcher(firstName).matches();
	}
	
	public boolean validateLastName(String LastName) {
		Pattern pattern = Pattern.compile(lastNamePattern);
		return pattern.matcher(LastName).matches();
	}
	
	public boolean validatePhoneNumber(String phoneNumber) {
		Pattern pattern = Pattern.compile(phoneNumberPattern);
		return pattern.matcher(phoneNumber).matches();
	}
	
	public boolean validatePassword(String password) {
		Pattern pattern = Pattern.compile(passwordPattern);
		return pattern.matcher(password).matches();
	}
	
	public boolean validateEmailId(String emailId) {
		Pattern pattern = Pattern.compile(emailIdPattern);
		return pattern.matcher(emailId).matches();
	}
}
