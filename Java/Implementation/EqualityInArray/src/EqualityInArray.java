
/**
 * Hackerrank Problem Link - https://www.hackerrank.com/challenges/equality-in-a-array/problem
 * 
 * @author ketanmalik
 * June 4 2020
 * */

import java.util.HashMap;
import java.util.Map;

public class EqualityInArray {

	public static void main(String[] args) {
		System.out.println(equalizeArray(new int[] { 5, 4, 2, 2, 3, 4, 5, 3 }));
	}

	
	// Brute-Force approach, O(n)
	static int equalizeArray(int[] arr) {
		Map<Integer, Integer> map = new HashMap<Integer, Integer>();
		for (int i = 0; i < arr.length; i++) {
			if (map.containsKey(arr[i]))
				map.put(arr[i], map.get(arr[i]) + 1);
			else
				map.put(arr[i], 1);
		}
		int res = 0;
		for (Map.Entry<Integer, Integer> entry : map.entrySet()) {
			if (entry.getValue() > res)
				res = entry.getValue();
		}
		return arr.length - res;
	}

}
