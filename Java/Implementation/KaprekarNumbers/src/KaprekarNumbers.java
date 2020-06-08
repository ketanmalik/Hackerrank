/**
 * Hackerrank Problem Link -
 * https://www.hackerrank.com/challenges/kaprekar-numbers/forum
 * 
 * @author ketanmalik June 8 2020
 */

public class KaprekarNumbers {
	public static void main(String[] args) {
		kaprekarNumbers(22220, 99999);
	}

	static void kaprekarNumbers(int p, int q) {
		int res = 0;
		for (int i = p; i <= q; i++) {
			System.out.println("i: " + i);
			long num = getNum(i);
			if (num >= 0) {
				res++;
			}
		}
		if (res == 0)
			System.out.println("INVALID RANGE");
	}

	static long getNum(long n) {
		if (n == 1)
			return n;
		String n2 = String.valueOf(n * n);
		int originalLen = String.valueOf(n).length();
		int newLen = n2.length();
		if (originalLen == newLen)
			return -1;
		int li = 0;
		for (int i = 0; i < (newLen - originalLen); i++)
			li++;
		int ri = li;
		for (int i = 0; i < originalLen; i++)
			ri++;
		int l1 = Integer.parseInt(n2.substring(0, li));
		int r1 = Integer.parseInt(n2.substring(li, ri));
		if (l1 + r1 == n)
			return n;
		return -1;
	}
}
