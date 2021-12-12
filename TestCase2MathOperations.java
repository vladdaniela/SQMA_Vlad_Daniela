
import static org.junit.Assert.*;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;


public class TestCase2MathOperations {

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

	

}