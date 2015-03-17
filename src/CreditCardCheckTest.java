import static org.junit.Assert.*;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;


public class CreditCardCheckTest {

	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
	}

	@AfterClass
	public static void tearDownAfterClass() throws Exception {
	}

	@Before
	public void setUp() throws Exception {
	
	}

	@After
	public void tearDown() throws Exception {
	}

	@Test
	public void Validtest() {
		boolean validity = CreditCard.checkCard("5007660756257724");
		assertTrue(validity);
	}
	@Test
	public void Invalidtest(){
		boolean validity2= CreditCard.checkCard("5007760756257724"); 
		assertFalse(validity2);
	}
}
