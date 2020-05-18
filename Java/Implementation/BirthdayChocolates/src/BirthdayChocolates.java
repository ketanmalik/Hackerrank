import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/*
Hackerrank Problem Link - https://www.hackerrank.com/challenges/the-birthday-bar/problem

@author ketanmalik
May 18 2020
*/

public class BirthdayChocolates {
	public static void main(String[] args) {
		System.out.println(birthday(new ArrayList<Integer>(Arrays.asList(2, 2, 1, 3, 2)), 4, 2));
	}

	static int birthday(List<Integer> s, int d, int m) {

		// O(n) solution
		int sum = 0, res = 0;
		for (int i = 0; i < m; i++)
			sum += s.get(i);
		if (sum == d)
			res++;
		for (int i = m, j = 0; i < s.size(); i++, j++) {
			sum -= s.get(j);
			sum += s.get(i);
			if (sum == d)
				res++;
		}
		return res;

		// O(n*m) solution
//		int loop = s.size() - m, sum = 0, res = 0, temp = 0;
//
//		for (int i = 0; i <= loop; i++) {
//			temp = i;
//			sum = s.get(i);
//			for (int j = 0; j < m - 1; j++) {
//				sum += s.get(++temp);
//			}
//			if (sum == d)
//				res++;
//		}
//		return res;
	}
}
