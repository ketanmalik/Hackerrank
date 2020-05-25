
/*
 * Hackerrabk Problem Link - https://www.hackerrank.com/challenges/picking-numbers/problem
 * 
 * @author ketanmalik
 * May 25 2020
 * 
 * */

import java.util.Arrays;
import java.util.List;

public class PickingNumbers {

	public static void main(String[] args) {
		System.out.println(pickingNumbers(Arrays.asList(1, 1, 1, 2, 2, 2, 2, 3, 4, 5, 6, 6)));
	}

	public static int pickingNumbers(List<Integer> a) {
		int[] arr = new int[101];
		for (int temp : a)
			arr[temp]++;
		int ans = 0;
		for (int i = 1; i < arr.length; i++)
			ans = Math.max(ans, arr[i - 1] + arr[i]);
		return ans;

	}
}
