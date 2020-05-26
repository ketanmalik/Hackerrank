/*
 * Hackerrank Problem Link - https://www.hackerrank.com/challenges/utopian-tree/problem
 * 
 * @author ketanmalik
 * May 26 2020
 * 
 * */

public class UtopianTree {

	public static void main(String args) {
		System.out.println(utopianTree(6));
	}

	static int utopianTree(int n) {
		int height = 1;
		if (n == 0)
			return 1;
		for (int i = 1; i <= n; i++) {
			if (i % 2 == 0)
				height++;
			else
				height *= 2;
		}
		return height;

	}
}
