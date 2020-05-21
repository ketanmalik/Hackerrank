/*
 * Hackerrank Problem Link - https://www.hackerrank.com/challenges/counting-valleys/problem?isFullScreen=true
 * 
 * @author ketanmalik
 * May 21 2020
 * */

public class CountingValleys {

	public static void main(String args[]) {
		System.out.println(countingValleys(8, "UDDDUDUU"));
	}

	static int countingValleys(int n, String s) {
		int sum = 0, valley = 0;

		for (char c : s.toCharArray()) {
			if (c == 'D')
				sum--;
			else
				sum++;
			if (sum == 0 && c == 'U')
				valley++;
		}
		return valley;
	}
}
