
/**
 * Hackerrank Problem Link - https://www.hackerrank.com/challenges/cut-the-sticks/problem
 * 
 * @author ketanmalik
 * June 2 2020
 * */

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class CutTheSticks {
	public static void main(String[] args) {
		System.out.println(Arrays.toString(cutTheSticks(new int[] { 5, 4, 4, 2, 2, 1 })));
	}

	
	// Brute-Force approach, O(n^2)
	static int[] cutTheSticks(int[] arr) {
		List<Integer> res = new ArrayList<>();
		while (true) {
			int min = 1001, temp = 0;
			for (int i = 0; i < arr.length; i++) {
				if (arr[i] > 0 && arr[i] < min)
					min = arr[i];
			}
			for (int i = 0; i < arr.length; i++) {
				if (arr[i] > 0) {
					temp++;
					arr[i] -= min;
				}
			}
			if (temp == 0)
				break;
			res.add(temp);
		}
		return res.stream().mapToInt(i -> i).toArray();
	}
}
