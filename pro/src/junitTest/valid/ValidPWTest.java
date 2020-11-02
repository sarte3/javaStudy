package junitTest.valid;

import static org.junit.Assert.assertEquals;

import java.util.Arrays;
import java.util.Collection;

import org.junit.BeforeClass;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameters;

//테스트 소스
//비밀번호 유효성 검사 기능을 테스트하기 위한 테스트 클래스
@RunWith(Parameterized.class)
public class ValidPWTest {

	private String password;
	private boolean isValid;
	private static ValidPW validator;
	
	public ValidPWTest(String password, boolean isValid) {
		this.password=password;
		this.isValid=isValid;
	}
	
	@BeforeClass
	public static void setUp() {
		validator = new ValidPW();
	}
	
	@Parameters
	public static Collection passwods() {
		return Arrays.asList(new Object[][] {
			{"123f",false},
			{"123",false},
			{"qwerasdf12",true},
			{"123456678",false},
			{"1q2w3e4r",true},
			{"qwerasdf",false}
			});
	}

	@Test
	public void isValidPwWithParams() {
		assertEquals(validator.isValid(this.password), this.isValid);
	}
	
}
