/*
 * 
 * @TrevorBouma
 */

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class BabysitterTest {

	Babysitter babysitter;

	@Before
	public void setUp() {
		babysitter = new Babysitter();
	}

	@Test
	public void payFromStartToBedTime() throws Exception {
		int result = babysitter.calcStartPay(5, 10);
		assertEquals(60, result);
	}

	@Test
	public void payFromBedTimeToMidnight() {
		int result = babysitter.calcBedtimePay(10, 12);
		assertEquals(16, result);
	}

	@Test
	public void payFromMidnightToEnd() throws Exception {
		int result = babysitter.calcMidnightPay(12, 4);
		assertEquals(64, result);
	}

	@Test
	public void payForEntireNight() throws Exception {
		int result = babysitter.calcTotalPay(5, 10, 4);
		assertEquals(140, result);
	}
}
