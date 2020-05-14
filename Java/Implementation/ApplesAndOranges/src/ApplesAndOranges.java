/*
 * Hackerrank Problem - Apple and Orange (Implementation Category)
 * 
 * @author ketanmalik
 * May 14 2020
 * 
 * */

public class ApplesAndOranges {
	public static void main(String args[]) {
		countApplesAndOranges(7, 11, 5, 15, new int[] { -2, 2, 1 }, new int[] { 5, -6 });
	}

	static void countApplesAndOranges(int s, int t, int a, int b, int[] apples, int[] oranges) {
		int applesCount = 0;
		int orangesCount = 0;
		int dist = 0;
		for (int i = 0; i < apples.length; i++) {
			dist = apples[i] + a;
			if (dist >= s && dist <= t)
				applesCount++;
			dist = 0;
		}
		for (int i = 0; i < oranges.length; i++) {
			dist = oranges[i] + b;
			if (dist >= s && dist <= t)
				orangesCount++;
			dist = 0;
		}
		System.out.println(applesCount);
		System.out.println(orangesCount);
	}
}
