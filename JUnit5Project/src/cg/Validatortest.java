package cg;

import static org.junit.jupiter.api.Assertions.*;

import java.util.concurrent.TimeUnit;
import java.util.stream.Stream;

import org.junit.jupiter.api.Assumptions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.CsvSource;
import org.junit.jupiter.params.provider.EnumSource;
import org.junit.jupiter.params.provider.MethodSource;
import org.junit.jupiter.params.provider.ValueSource;

class Validatortest {

	@Test
	void test() {
		Validator ob = new Validator();
		String data="100";
		//Assumptions.assumeFalse(data!=null);
		System.out.println("assertTrue");
		assertTrue(ob.ValidateNo(data));
		System.out.println("assertFalse");
		data="abc";
		assertFalse(ob.ValidateNo(data));
		//fail("Not yet implemented");
	}
	
	@Test
	void test1() {
		Validator ob = new Validator();
//		assertTrue(ob.ValidateNo(null));
//		assertThrows(NullPointerException.class,executable);
		assertThrows(NullPointerException.class, ()->ob.ValidateNo(null));
//		assertFalse(ob.ValidateNo("abc"));
		//fail("Not yet implemented");
	}
/*// ()->ob.ValidateNo(null)
 class ____ implements Executable{
 public boolean execute(){
 	return ob.ValidateNo(null);
 }
 }
 * */
	
	@ParameterizedTest
	@ValueSource(strings= {"racecar","radar","naman"})
	void test2(String data) {
		Validator ob=new Validator();
		System.out.println("test isPalindrome with value "+data);
		assertTrue(ob.isPalindrome(data));
		
	}
	
	@ParameterizedTest
	@CsvSource({"4,5","10,20","100,500"})
	void test3(int a, int b) {
		Calculator ob = new Calculator();
		System.out.println("test add with values a = "+a+", b = "+b);
		assertTrue(ob.add(a, b)>0);
		
	}

	@ParameterizedTest
	@MethodSource("testAddWithOutput")
	void withMethodSource(int a, int b, int op) {
		Calculator ob = new Calculator();
		System.out.println("test with add input a ="+a+", b ="+b+", op ="+op);
		assertEquals(op,ob.add(a, b));
		
	}	
	
	private static Stream<Arguments> testAddWithOutput() {
		return Stream.of(
			Arguments.of(2,3, 5),
			Arguments.of(100,500, 600));
	}
	
	@ParameterizedTest
	@EnumSource(Size.class)
	void withAllEnumValues(Size size) {
		System.out.println("Test Enum value "+size);
		Validator ob = new Validator();
		assertEquals(size.getMl(),ob.getSizeinMl(size));
		// executed once for TimeUnit.NANOSECONDS
		// and once for TimeUnit.MICROSECONDS
	}
	
}
