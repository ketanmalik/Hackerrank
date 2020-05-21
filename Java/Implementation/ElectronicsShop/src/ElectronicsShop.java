/*
 *Hackerrank Problem Link - https://www.hackerrank.com/challenges/electronics-shop/problem
 *
 * @author ketanmalik
 * May 21 2020
 *
 * */
public class ElectronicsShop {

	static int getMoneySpent(int[] keyboards, int[] drives, int b) {
		int res = -1;
		for (int i = 0; i < keyboards.length; i++) {
			for (int j = 0; j < drives.length; j++) {
				if (keyboards[i] + drives[j] <= b && keyboards[i] + drives[j] > res) {
					res = (keyboards[i] + drives[j]);
				}
			}
		}
		return res;
	}
}
