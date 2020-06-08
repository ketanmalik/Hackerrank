/**
 * Hackerrank Problem Link -
 * https://www.hackerrank.com/challenges/minimum-distances/problem
 * 
 * @author ketanmalik June 8 2020
 */

public class MinimumDistances {
	public static void main(String[] args) {
		System.out.println(minimumDistances(new int[] { 7, 1, 3, 4, 1, 7 }));
	}

	static int minimumDistances(int[] a) {
		int res = a.length, notFound = -1;
		for (int i = 0; i < a.length; i++) {
			for (int j = 0; j < a.length; j++) {
				if (j == i)
					continue;
				if (a[i] == a[j]) {
					notFound = 0;
					res = Math.min(res, Math.abs(i - j));
				}
			}
		}
		if (notFound == -1)
			return notFound;
		return res;
	}

}
