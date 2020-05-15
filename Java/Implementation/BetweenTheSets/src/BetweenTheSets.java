
/*
 * Hackerrank Problem Link - https://www.hackerrank.com/challenges/between-two-sets/submissions/code/158973592
 * 
 * @author ketanmalik
 * May 15 2020
 * */

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class BetweenTheSets {
	public static void main(String args[]) {
		List<Integer> a = new ArrayList<>();
		a.add(2);
		a.add(4);
		List<Integer> b = new ArrayList<>();
		b.add(32);
		b.add(16);
		b.add(96);
		System.out.println(getTotalX(a, b));

	}

	public static int getTotalX(List<Integer> a, List<Integer> b) {
		// Write your code here
		boolean valid1 = true;
		boolean valid2 = true;
		int res = 0;
		List<Integer> a1 = a.stream().sorted().collect(Collectors.toList());
		List<Integer> a2 = b.stream().sorted().collect(Collectors.toList());
		int min = a1.get(a1.size() - 1);
		int max = a2.get(0);
		if (min > max)
			return res;
		for (int i = min; i <= max; i++) {
			for (int j = 0; j < a.size(); j++) {
				if (i % a1.get(j) != 0) {
					valid1 = false;
					break;
				}
			}
			for (int k = 0; k < b.size(); k++) {
				if (a2.get(k) % i != 0) {
					valid2 = false;
					break;
				}
			}
			if (valid1 && valid2) {
				res++;
			}
			valid1 = true;
			valid2 = true;
		}
		return res;
	}

}
