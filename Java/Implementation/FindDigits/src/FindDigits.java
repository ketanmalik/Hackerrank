/**
 * Hackerrank Problem Link -
 * https://www.hackerrank.com/challenges/find-digits/problem
 * 
 * @author ketanmalik June 1 2020
 */

public class FindDigits {
	public static void main(String[] args) {
		System.out.println(findDigits(1012));
	}

	static int findDigits(int n) {
		int res = 0;
		int temp = n;
		while (temp > 0) {
			int divisor = temp % 10;
			if (divisor != 0 && (n % divisor == 0))
				res++;
			temp /= 10;
		}
		return res;
	}
}
