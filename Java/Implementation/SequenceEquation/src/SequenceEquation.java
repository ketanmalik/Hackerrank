import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/*
 * Hackerrank Problem Link - https://www.hackerrank.com/challenges/permutation-equation/problem
 * 
 * @author ketanmalik
 * May 29 2020
 * 
 * */

public class SequenceEquation {

	public static void main(String[] args) {
		System.out.println(Arrays.toString(permutationEquation(new int[] { 5, 2, 1, 3, 4 })));
	}

	static int[] permutationEquation(int[] p) {
		int[] ref = new int[52];
		List<Integer> res = new ArrayList<>();
		for (int i = 0; i < p.length; i++)
			ref[p[i]] = i + 1;
		int x = 1;
		while (x <= p.length) {
			res.add(ref[ref[x]]);
			x++;
		}
		return res.stream().mapToInt(e -> e).toArray();
	}

}
