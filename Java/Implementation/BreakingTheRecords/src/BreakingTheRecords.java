
/*
 * Hackerrank Problem Link = https://www.hackerrank.com/challenges/breaking-best-and-worst-records/problem?isFullScreen=true
 * 
 * @author ketanmalik
 * May 15 2020
 * */

import java.util.Arrays;

public class BreakingTheRecords {

	public static void main(String args[]) {
		System.out.println(Arrays.toString(breakingRecords(new int[] { 12, 10, 24, 9 })));
	}

	static int[] breakingRecords(int[] scores) {
		int[] res = { 0, 0 };
		int min = scores[0], max = scores[0];
		for (int i = 1; i < scores.length; i++) {
			if (scores[i] < min) {
				min = scores[i];
				res[1]++;
			} else if (scores[i] > max) {
				max = scores[i];
				res[0]++;
			}
		}
		return res;

	}
}
