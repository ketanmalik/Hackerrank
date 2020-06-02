/**
 * Hackerrank Problem Link -
 * https://www.hackerrank.com/challenges/repeated-string/problem
 * 
 * @author ketanmalik June 2 2020
 */

public class RepeatedString {

	public static void main(String[] args) {
		System.out.println(repeatedString("aba", 10));
	}

	static long repeatedString(String s, long n) {
		long res = 0;

		if (n < s.length()) {
			int i = (int) n;
			s = s.substring(0, i);
			for (char c : s.toCharArray()) {
				if (c == 'a')
					res++;
			}
			return res;
		}
		for (char c : s.toCharArray()) {
			if (c == 'a')
				res++;
		}
		if (n == s.length())
			return res;
		else {
			int x = (int) (n % s.length());
			if (x == 0)
				return res * (n / s.length());
			else {
				long temp = 0;
				int len = s.length();
				s = s.substring(0, x);
				for (char c : s.toCharArray()) {
					if (c == 'a')
						temp++;
				}
				return (res * ((n - x) / len)) + temp;
			}
		}
		// return res;
	}

}
