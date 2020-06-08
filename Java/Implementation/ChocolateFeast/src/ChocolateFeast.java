/**
 * Hackerrank Problem Link -
 * https://www.hackerrank.com/challenges/chocolate-feast/problem
 * 
 * @author ketanmalik June 8 2020
 */

public class ChocolateFeast {
	public static void main(String[] args) {
		System.out.println(chocolateFeast(15, 3, 2));
	}

	static int chocolateFeast(int n, int c, int m) {
		int wrapper = n / c;
		int res = wrapper;

		while (wrapper >= m) {
			res += wrapper / m;
			wrapper = (wrapper / m) + (wrapper % m);
		}
		return res;
	}
}
