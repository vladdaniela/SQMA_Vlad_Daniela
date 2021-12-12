
import static org.junit.Assert.*;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;


public class TestCaseMathOperations {

	MathOperations math;

	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
		System.out.println("Hello !");
	}

	@AfterClass
	public static void tearDownAfterClass() throws Exception {
		System.out.println("Bye !");
	}

	@Before
	public void setUp() throws Exception {
		math=new MathOperations();
		System.out.println("Prepare the test");
	}

	@After
	public void tearDown() throws Exception {
		System.out.println("Clear after test");
	}

	@Test
	public void testSetNumber() {
		int newNumber = 7;
		math.setNumber(newNumber);
		assertEquals("Testing with a right number", newNumber, math.getNumber());
	}

	
	
	@Test
	public void testAdd() {
		int a = 5;
		int b = 6;
		int expectedResult = 11;
		int actualResult = math.add(a, b);
		assertEquals("Check the addition", expectedResult, actualResult);
	}

}