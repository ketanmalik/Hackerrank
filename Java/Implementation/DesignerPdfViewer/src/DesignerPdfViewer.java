/*
 * Hackerrank Problem Link - https://www.hackerrank.com/challenges/designer-pdf-viewer/problem
 * 
 * @author ketanmalik
 * May 26 2020
 * 
 * */

public class DesignerPdfViewer {

	public static void main(String[] args) {
		System.out.println(designerPdfViewer(
				new int[] { 1, 3, 1, 3, 1, 4, 1, 3, 2, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5 }, "abc"));
	}

	static int designerPdfViewer(int[] h, String word) {
		int max = h[0];
		for (char c : word.toCharArray()) {
			int x = c;
			max = Math.max(max, h[x - 97]);
		}
		return max * word.length();

	}

}
