
/*
 * Hackerrank Problem Link - https://www.hackerrank.com/challenges/sock-merchant/problem
 * 
 * @author ketanmalik
 * May 20 2020
 * 
 * */

import java.util.HashMap;
import java.util.Map;

public class SockMerchant {

	public static void main(String[] args) {
		System.out.println(sockMerchant(9, new int[] { 10, 20, 20, 10, 10, 30, 50, 10, 20 }));

	}

	static int sockMerchant(int n, int[] ar) {
		Map<Integer, Integer> map = new HashMap<>();
		int res = 0;
		for (int i = 0; i < n; i++) {
			if (map.containsKey(ar[i])) {
				res++;
				map.remove(ar[i]);
			} else {
				map.put(ar[i], 1);
			}
		}
		return res;
	}
}
