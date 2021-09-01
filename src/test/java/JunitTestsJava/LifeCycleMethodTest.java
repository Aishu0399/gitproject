package JunitTestsJava;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestInstance;
import org.junit.jupiter.api.TestInstance.Lifecycle;
@TestInstance(Lifecycle.PER_CLASS)

class LifeCycleMethodTest {

	private SumNumbers obj;
	@BeforeAll
	void setUpBeforeClass() throws Exception {
		obj = new SumNumbers();
		System.out.println("In the begining");
	}

	@AfterAll
	void tearDownAfterClass() throws Exception {
		obj = null;
		System.out.println("At the end");
	}

	@BeforeEach
	void setUp() throws Exception {
		System.out.println("Before each test");
	}

	@AfterEach
	void tearDown() throws Exception {
		System.out.println("After each test");
	}

	@Test
	void testSum() {
		assertEquals(5, obj.sum(2,  3));
	}
	@Test
	void testSumNegative() {
		assertNotEquals(7, obj.sum(2,  5));
		
	}
	@Test
	void testError() {
		Exception exception = assertThrows(IllegalArgumentException.class, ()->obj.sum(12, 13));
		assertEquals("value should be less than 10",exception.getMessage());
	}


}
