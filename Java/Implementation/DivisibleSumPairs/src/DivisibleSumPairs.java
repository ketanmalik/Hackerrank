/*
 Hackerrank Problem Link - https://www.hackerrank.com/challenges/divisible-sum-pairs/problem
 
 @author ketanmalik
 May 18 2020
 * */

public class DivisibleSumPairs {
	public static void main(String args[]) {
		System.out.println(divisibleSumPairs(6, 3, new int[] { 1, 3, 2, 6, 1, 2 }));
	}

	static int divisibleSumPairs(int n, int k, int[] ar) {
		int res = 0;
		for (int i = 0; i < n - 1; i++) {
			for (int j = i + 1; j < n; j++) {
				if ((ar[i] + ar[j]) % k == 0) {
					res++;
				}
			}
		}
		return res;
	}
}
