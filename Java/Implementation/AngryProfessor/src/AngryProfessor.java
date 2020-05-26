/*
 * Hackerrank Problem Link - https://www.hackerrank.com/challenges/angry-professor/problem
 * 
 * @author ketanmalik
 * May 26 2020
 * 
 * */

public class AngryProfessor {

	public static void main(String[] args) {
		System.out.println(angryProfessor(3, new int[] { 1, 2, -2, -3, -4, 3, 4, 3 }));
	}

	static String angryProfessor(int k, int[] a) {
		int onTime = 0;
		for (int i = 0; i < a.length; i++) {
			if (a[i] <= 0)
				onTime++;
		}
		if (onTime >= k)
			return "NO";
		return "YES";

	}
}
