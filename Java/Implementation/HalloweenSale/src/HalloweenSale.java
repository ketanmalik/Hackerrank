/**
 * Hackerrank Problem Link -
 * https://www.hackerrank.com/challenges/halloween-sale/problem
 * 
 * @author ketanmalik June 8 2020
 */

public class HalloweenSale {

	public static void main(String[] args) {
		System.out.println(howManyGames(20, 3, 6, 85));
	}

	static int howManyGames(int p, int d, int m, int s) {
		// Return the number of games you can buy
		if (s < p)
			return 0;
		if (s == p)
			return 1;
		int spent = s - p, res = 1;
		while (spent >= 0) {
			if (m <= (p - d)) {
				p -= d;
				spent -= p;
			} else {
				spent -= m;
			}
			if (spent < 0)
				break;
			res++;
		}
		return res;
	}
}
