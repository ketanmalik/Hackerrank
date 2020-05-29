/*
 * Hackerrank Problem Link - https://www.hackerrank.com/challenges/circular-array-rotation/problem
 *
 * @author ketanmalik
 * May 29 2020
 * */

import java.util.Arrays;

public class CircularArrayRotation {

	public static void main(String[] args) {
		System.out.println(
				Arrays.toString(circularArrayRotation(new int[] { 1, 2, 3, 4, 5 }, 12, new int[] { 0, 1, 2, 3, 4 })));
	}

	static int[] circularArrayRotation(int[] a, int k, int[] queries) {
		int[] res = new int[queries.length];
		int len = a.length;
		int rotations = k % len;
		for (int i = 0; i < queries.length; i++) {
			int indexToFind = queries[i] - rotations;
			if (indexToFind < 0)
				indexToFind += len;
			res[i] = indexToFind;
		}
		return res;
	}
}
