package test;

import static org.junit.Assert.*;

import org.junit.BeforeClass;
import org.junit.Test;

public class StringCalculatorTest {

	public static StringCalculator sCal=null;
	
	@BeforeClass
	public static void setUp() {
		sCal = new StringCalculator();
	}
	
	//문자열이 포함된 식을 입력받는다.
	@Test
	public void testValidateString4() {
		String result = sCal.validateString("30+50 a");
		assertEquals("wrongInput", result);
	}
	
	//연산기호를 2개 이상 입력했을 때 검사
	@Test
	public void testValidateString3() {
		String result = sCal.validateString("30++");
		assertEquals("wrongInput", result);
	}
	
	//연산기호를 입력하지 않았을 때 검사
	@Test
	public void testValidateString2() {
		String result = sCal.validateString("30");
		assertEquals("wrongInput", result);
	}
	
	//공백 검사
	@Test
	public void testValidateString() {
		String result = sCal.validateString("  2+ 5");
		assertEquals("2+5", result);
	}

	//더하기 검사
	@Test
	public void testPlus() {
		
		double result=sCal.plus(10, 90);
		assertEquals("두 값이 동일","100.0", String.valueOf(result));
	}

	//빼기 검사
	@Test
	public void testMinus() {
		double result=sCal.minus(90, 10);
		assertEquals("두 값이 동일","80.0", String.valueOf(result));
	}

	//곱하기 검사
	@Test
	public void testMultiply() {
		double result=sCal.multiply(10, 5);
		assertEquals("두 값이 동일","50.0", String.valueOf(result));

	}

	//나누기 검사
	@Test
	public void testDivide() {
		double result=sCal.divide(90, 10);
		assertEquals("두 값이 동일","9.0", String.valueOf(result));

	}
	
	//0으로 나누기 검사
	@Test
	public void testDivideZero() {
		double result=sCal.divide(90, 0);
		assertEquals("두 값이 동일","90.0", String.valueOf(result));

	}

}
