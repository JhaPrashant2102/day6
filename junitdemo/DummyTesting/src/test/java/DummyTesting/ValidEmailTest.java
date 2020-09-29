/**
 * 
 */
package DummyTesting;

/**
 * @author prashant
 *
 */
import static org.junit.Assert.assertEquals;
import java.util.*;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

@RunWith(Parameterized.class)
public class ValidEmailTest {

	private String emailId;
	private boolean check;

	public ValidEmailTest(String emailId, boolean check) {
		this.emailId = emailId;
		this.check = check;
	}
	@Parameterized.Parameters
	public static Collection input() {
		return Arrays.asList(new Object[][] {
			{"abc@yahoo.com",true},
			{"abc-100@yahoo.com",true},
			{"abc.100@yahoo.com",true},
			{"abc111@abc.com",true},
			{"abc-100@abc.net",true},
			{"abc.100@abc.com.au",true},
			{"abc@1.com",true},
			{"abc@gmail.com",true},
			{"abc+100@gmail.com",true},
			{"abc",false},
			{"abc@.com.my",false},
			{"abc123@gmail.a",false},
			{"abc123@.com",false},
			{"abc123@.com.com",false},
			{".abc@yahoo.com",false},
			{"abc()*@yahoo.com",false},
			{"abc@%*.com",false},
			{"abc..2002@gmail.com",false},
			{"abc.@gmail.com",false},
			{"abc@abc@gmail.com",false},
			{"abc@gmail.com.1a",false},
			{"abc@yahoo.com.aa.uu",true}//Todo
		});
	}
	
	@Test
	public void givenEmailId_WhenProper_ShouldReturnTrue() {
		UserValidator validator = new UserValidator();
		boolean result = validator.validateEmailId(this.emailId);
		Assert.assertEquals(this.check,result);
	}
}
