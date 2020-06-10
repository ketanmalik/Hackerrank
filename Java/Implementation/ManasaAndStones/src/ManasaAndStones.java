
/**
 * Hackerrank Problem Link - https://www.hackerrank.com/challenges/manasa-and-stones/problem
 * 
 * @author ketanmalik
 * June 10 2020
 * */

import java.util.Arrays;

public class ManasaAndStones {

	public static void main(String[] args) {
		System.out.println(Arrays.toString(stones(4, 5, 6)));
	}

	static int[] stones(int n, int a, int b) {
		if (a == b)
			return new int[] { (n - 1) * a };
		int[] res = new int[n];
		if (a > b) {
			int temp = a;
			a = b;
			b = temp;
		}
		int x = n - 1, y = 0;
		for (int i = 0; i < n; i++) {
			res[i] = x * a + y * b;
			x--;
			y++;
		}
		return res;
	}

}
