/**
 * Hackerrank Problem Link -
 * https://www.hackerrank.com/challenges/library-fine/problem
 * 
 * @author ketanmalik June 2 2020
 */

public class LibraryFine {

	public static void main(String[] args) {
		System.out.println(libraryFine(28, 2, 2020, 29, 2, 2020));
	}

	static int libraryFine(int d1, int m1, int y1, int d2, int m2, int y2) {

		if ((d1 == d2 && m1 == m2 && y1 == y2) || (y1 == y2) && (m1 < m2) || y1 < y2)
			return 0;
		if (y1 > y2)
			return 10000;
		if (d1 > d2 && m1 == m2 && y1 == y2) {
			return 15 * (d1 - d2);
		}
		if (m1 > m2 && y1 == y2)
			return 500 * (m1 - m2);
		return 0;
	}

}
