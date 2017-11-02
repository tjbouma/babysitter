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
		int result = babysitter.calcStartPay(5, 9);
		assertEquals(48, result);
	}

	@Test
	public void payFromBedTimeToMidnight() {
		int result = babysitter.calcBedtimePay(9, 12);
		assertEquals(24, result);
	}

	@Test
	public void payFromMidnightToEnd() throws Exception {
		int result = babysitter.calcMidnightPay(12, 5);
		assertEquals(64, result);
	}

	@Test
	public void payForEntireNight() throws Exception {
		int result = babysitter.calcTotalPay(5, 9, 4);
		assertEquals(136, result);
	}
}
