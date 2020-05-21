/*
 * Hackerrank Problem Link - https://www.hackerrank.com/challenges/drawing-book/problem
 * 
 * TCs - (7,4), (2,1)
 * 
 * @author ketanmalik
 * May 20 2020
 * 
 * */

public class DrawingBook {

	public static void main(String[] args) {
		System.out.println(pageCount(6, 2));
	}

	static int pageCount(int n, int p) {
		/*
		 * Write your code here.
		 */
		if (p == 1 || p == n)
			return 0;
		if ((n - p) == 1) {
			if (n % 2 == 0)
				return 1;
			else
				return 0;
		}

		int steps = 0;
		if ((p - 1) < (n - p)) {

			steps = p / 2;
		} else {
			if (n % 2 == 0) {
				steps = (n - p) / 2;
				if (p % 2 != 0)
					steps++;
			} else {
				steps = (n - p) / 2;
			}
		}
		return steps;
	}
}
