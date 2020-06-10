/**
 * Hackerrank Problem Link -
 * https://www.hackerrank.com/challenges/strange-code/problem
 * 
 * @author ketanmalik June 10 2020
 */

public class StrangeCounter {
	public static void main(String[] args) {
		System.out.println(strangeCounter(21));
	}

	static long strangeCounter(long t) {
		long m = 0, start = 3;
		long n = (2 * m + 1);
		if (t > 3) {
			while (t > (n * 3)) {
				m = n;
				n = (2 * m + 1);
				start *= 2;
			}
			long lower = m * 3 + 1;
			long diff = t - lower;
			return Math.abs(start - diff);
		} else {
			return 4 - t;
		}
	}
}
