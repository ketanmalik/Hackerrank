/*
 * Hackerrank Problem Link - https://www.hackerrank.com/challenges/the-hurdle-race/problem
 * 
 * @author ketanmalik
 * May 25 2020
 * 
 * */

public class TheHurdleRace {
	public static void main(String[] args) {
		System.out.println(hurdleRace(1, new int[] { 1, 2, 3, 3, 4 }));
	}

	static int hurdleRace(int k, int[] height) {
		int ans = 0;
		for (int i = 0; i < height.length; i++) {
			ans = Math.max(ans, height[i] - k);
		}
		return ans;
	}
}
