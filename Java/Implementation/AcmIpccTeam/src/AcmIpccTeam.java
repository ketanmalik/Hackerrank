
/**
 * Hackerrank Problem Link - https://www.hackerrank.com/challenges/acm-icpc-team/problem
 * 
 * @author ketanmalik
 * June 4 2020
 * */

import java.util.Arrays;

public class AcmIpccTeam {

	public static void main(String[] args) {
		System.out.println(Arrays.toString(acmTeam(new String[] { "10101", "11110", "11110", "00010" })));
	}

	static int[] acmTeam(String[] topic) {
		int n = topic.length, score = 0, max = -1;
		int students = 1;
		int[] res = new int[2];

		for (int i = 0; i < n - 1; i++) {
			for (int j = i + 1; j < n; j++) {
				score = getScore(topic[i].toCharArray(), topic[j].toCharArray());
				if (max == score)
					students++;
				else if (score > max) {
					max = score;
					students = 1;
				}
			}
		}
		res[0] = max;
		res[1] = students;
		return res;
	}

	static int getScore(char[] a1, char[] a2) {
		int res = 0;
		for (int i = 0; i < a1.length; i++) {
			if (a1[i] == '1' || a2[i] == '1')
				res++;
		}
		return res;
	}
}
