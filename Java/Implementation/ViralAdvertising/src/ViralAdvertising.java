/*
 * Hackerrank Problem Link - https://www.hackerrank.com/challenges/strange-advertising/problem
 * 
 * @author ketanmalik
 * May 27 2020
 * 
 * */

public class ViralAdvertising {
	public static void main(String[] args) {
		System.out.println(viralAdvertising(5));
	}

	static int viralAdvertising(int n) {
		int people = 5, likes = (people / 2);
		for (int i = 0; i < n - 1; i++) {
			people = (people / 2) * 3;
			likes = likes + (people / 2);
		}
		return likes;
	}

}
