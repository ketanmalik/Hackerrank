/*
 * Hackerrank Problem Link - https://www.hackerrank.com/challenges/beautiful-days-at-the-movies/problem
 *
 * @author ketanmalik
 * May 26 2020
 *
 */

public class BeautifulDayAtTheMovies {

	public static void main(String[] args) {
		System.out.println(beautifulDays(20, 23, 6));
	}

	static int beautifulDays(int i, int j, int k) {
		int res = 0;
		for (int x = i; x <= j; x++) {
			int num = x;
			int rev = getRev(num);
			int diff = Math.abs(num - rev);
			if (diff % k == 0)
				res++;
		}
		return res;
	}

	static int getRev(int num) {
		int rev = 0;
		while (num > 0) {
			int digit = num % 10;
			rev = rev * 10 + digit;
			num /= 10;
		}
		return rev;
	}

}
