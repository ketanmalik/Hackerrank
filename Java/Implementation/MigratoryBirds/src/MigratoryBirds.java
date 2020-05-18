
/*
 Hackerrank Problem Link - https://www.hackerrank.com/challenges/migratory-birds/problem
 
 @author ketanmalik
 May 18 2020
 * */

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class MigratoryBirds {

	public static void main(String args[]) {
		System.out.println(migratoryBirds(new ArrayList<Integer>(Arrays.asList(1, 2, 3, 4, 5, 4, 3, 2, 1, 3, 4))));
	}

	static int migratoryBirds(List<Integer> arr) {
		int[] res = new int[5];
		for (int i = 0; i < arr.size(); i++) {
			res[arr.get(i) - 1]++;
		}

		int big = res[0], index = 0;
		for (int i = 1; i < res.length; i++) {
			if (res[i] > big) {
				big = res[i];
				index = i;
			}
		}
		return ++index;
	}
}
