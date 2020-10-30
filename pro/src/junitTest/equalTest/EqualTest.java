package junitTest.equalTest;

import static org.junit.Assert.*;
import static org.hamcrest.CoreMatchers.*;

import java.util.Arrays;
import java.util.List;

import org.junit.Ignore;
import org.junit.Test;

//junit4에서는 Test클래스가 TestCase를 상속받지 않아도 된다
public class EqualTest {
	
	//@Test(timeout=제한시간 ms단위) //1ms = 1/1000초, 1000ms = 1초
	@Test(timeout=10) //1ms = 1/1000초, 1000ms = 1초
	public void testTimeOut() throws Exception{
		long sum = 0;
		for(int i=0;i<10000;i++) {
			for(int j=0;j<10000;j++) {
				sum+=j;
			}
		}
		System.out.println("sum = "+sum);
	}
	
	//@Ignore는 Test에서 제외해라
	@Ignore //import org.junit.Ignore;
	@Test
	public void tIgnore() throws Exception{
		assertTrue(false);
	}
		
	//assertThat(검사할 대상 데이터, 조건);
	@Test
	public void tAssertThat() {
		
		Object result = "test";
		//junit4
		assertTrue(result instanceof String);
		//Hamcrest
		assertThat(result,instanceOf(String.class));
		
		int i = 3;
		assertThat(i, is(3));
		
		assertThat(Arrays.asList("one","two","three"),hasItems("one","two") );
	}
	
	//junit4에서 테스트메소드명은 반드시 test로 시작하지 않아도 된다
	
	@Test
	public void tAssertNotNull() {
		
		String str1 = null; 
		str1 = new String("하하호호");
		
		assertNotNull("not null이어야 해요", str1);
		//assertNotNull("not null이어야 해요", new Object());
	}
	
	@Test
	public void testAssertTrue() {
		assertTrue("fail-true가 나와야 해요",true); //fail
		//assertTrue("fail-true가 나와야 해요",true);
	}
	
	@Test
	public void testAssertFalse() {
		assertFalse("fail-false가 나와야 해요",false); //success
		//assertFalse("fail-false가 나와야 해요",true);
	}
	
	
	//Arrays.asList() : 일반 배열을 ArrayLIst로 변환
	//get(), contains()는 사용 가능하지만
	//add() 사용 불가
	//List비교
	@Test
	public void testValueEqual2() {
		List<Integer> expected = Arrays.asList(1,2,3);
		List<Integer> actual = Arrays.asList(1,2,3);
		assertEquals("두 List의 값과 순서가 같아요", expected, actual);
	}
	
	//배열 비교
	@Test
	public void testAssertArrayEquals2() {
		String[] expected = new String[] {"a","b","c"};
		String[] actual = new String[] {"a","b","c"};
		//배열의 길이와 값이 동일해야 한다
		//String[] actual = new String[] {"A","b","c"}; //값이 동일하지 않아서 fail
		//String[] actual = new String[] {"a","b"}; //길이가 동일하지 않아서 fail
		assertArrayEquals("failure-byte array not same",expected,actual);
	}
	
	@Test
	public void testAssertArrayEquals() {
		byte[] expected = "qwert".getBytes();
		byte[] actual = "qwert".getBytes();
		assertArrayEquals("failure-byte array not same",expected,actual);
	}
	
	//reference 비교
	@Test
	public void testReferenceEqual() {
	
		String str1 = new String("문자열");
		//String str2 = new String("문자열");
		String str2 = str1;
		//System.out.println("reference 비교 결과 = "+(str1==str2)); //false
		assertSame("두 객체의 주소값이 동일",str1, str2);
		
	}

	//value 비교
	@Test
	public void testValueEqual() {
		
		String str1 = new String("이순신");
		String str2 = new String("이순신");
		//System.out.println("value 비교 결과 = "+(str1.equals(str2))); //true
		assertEquals("두 객체의 값이 동일", str1, str2);
		
	} 
	
}
