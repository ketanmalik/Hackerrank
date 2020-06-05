/**
 * Hackerrank Problem Link -
 * https://www.hackerrank.com/challenges/taum-and-bday/problem
 * 
 * @author ketanmalik June 4 2020
 */

public class TaumAndBday {
	public static void main(String[] args) {
		System.out.println(taumBday(5, 6, 3, 9, 1));
	}

	public static long taumBday(int b, int w, int bc, int wc, int z) {
		long bTemp = b, wTemp = w, bcTemp = bc, wcTemp = wc, zTemp = z;
		// Buying all w gifts at b's price
		long c1 = (bTemp * bcTemp) + (wTemp * (bcTemp + zTemp));

		// Buying all b gifts at w's price
		long c2 = (bTemp * (wcTemp + zTemp)) + (wTemp * wcTemp);

		// Buying all gifts at their own prices
		long c3 = (bTemp * bcTemp) + (wTemp * wcTemp);

		if (c1 < c2) {
			if (c1 < c3)
				return c1;
			else
				return c3;
		} else {
			if (c2 < c3)
				return c2;
			else
				return c3;
		}
	}
}
