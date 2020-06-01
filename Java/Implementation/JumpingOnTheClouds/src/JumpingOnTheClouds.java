
/*
 * Hackerrank Problem Link - https://www.hackerrank.com/challenges/jumping-on-the-clouds-revisited/problem
 * */

public class JumpingOnTheClouds {

	public static void main(String[] args) {
		System.out.println(jumpingOnClouds(new int[] { 1, 1, 0, 0, 0, 1, 1, 0, 0, 0, 0 }, 3));
	}

	static int jumpingOnClouds(int[] c, int k) {
		int res = 0, start = k % c.length;
		while (start != 0) {
			if (c[start] == 1)
				res += 2;
			res++;
			start = (start + k) % c.length;
		}
		if (c[0] == 1)
			res += 3;
		else
			res += 1;
		return 100 - res;
	}

}
