package cg;

import static org.junit.Assert.assertTrue;
import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
//import org.junit.jupiter.api.RepeatedTest;
import org.junit.jupiter.api.Test;

class CalculatorTest {
	static Calculator ob;
	
	@BeforeAll // jUnit 4 @BeforeClass
	public static void beforeAllTests() {
		System.out.println("******Before All Tests******");
		ob=new Calculator();
	}
	
	@AfterAll //jUnit 4 @AfterClass
	public static void afterAllTests() {
		System.out.println("******After All Tests******");
		ob=null;
	}
	
	@BeforeEach // jUnit 4 @Before
	public void beforeEachTest() {
		// a custom name for test is also called as setup
		System.out.println("Before Each Test");
		//ob=new Calculator();
	}
	
	@AfterEach // jUnit 4 @After
	public void afterEachTest() {
		System.out.println("After Each Test");
		//ob=null;
	}
	
	//@RepeatedTest(5) //repeatedly testing this testadd() method and disable the @Test
	@Test
	void testadd() {
		//fail("Not yet implemented");
		System.out.println("Test case testadd");
		assertEquals(9,ob.add(4, 5));
	}
	@Test
	void testadd1() {
		System.out.println("Test case testadd1");
		//Calculator ob = new Calculator();
		//Assert.assertEquals(9, ob.add(4, 5));
		assertTrue(ob.add(4, 5)>0);
		assertTrue(ob.add(3, -4)>=0);
	}
	
	@Test
	void testidgenerator() {
		System.out.println("IDgenerator test");
		assertTrue(Calculator.idgenerator()>0);
		//using a class statically mean to use class name directly as an object call
		// ex: Calculator.idgenerator() instead of ob.idgenerator()
		
	}
}
