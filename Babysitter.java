/*
 * 
 * @TrevorBouma
 */

public class Babysitter {
	private int startRate = 12;
	private int bedtimeRate = 8;
	private int midnightRate = 16;
	private int bedtimePay;
	private int midnightPay;
	private int startPay;

	public int calcStartPay(int start, int bedtime) throws Exception {
		start = start + 12;
		bedtime = bedtime + 12;
		if (start < 17) {
			throw new Exception("The babysitter can't start before 5.");
		} else {

			startPay = (bedtime - start) * startRate;
		}

		return startPay;
	}

	public int calcBedtimePay(int bedtime, int midnight) {
		midnight = 24;
		if (bedtime <= 12) {
			bedtime = bedtime + 12;
		}
		bedtimePay = (midnight - bedtime) * bedtimeRate;

		return bedtimePay;
	}

	public int calcMidnightPay(int midnight, int end) throws Exception {
		midnight = 24;
		end = end + 24;
		if (end > 28) {
			throw new Exception("The babysitter can't work after 4am.");
		}
		midnightPay = (end - 24) * midnightRate;
		return midnightPay;
	}
	
	public int calcTotalPay(int start, int bedtime, int end) throws Exception {
		Babysitter babysitter = new Babysitter();
		startPay = babysitter.calcStartPay(5, 10);
		bedtimePay = babysitter.calcBedtimePay(10, 12);
		midnightPay = babysitter.calcMidnightPay(12, 4);
		int totalPay;
		totalPay = (startPay + bedtimePay + midnightPay);
		return totalPay;
	}
}
