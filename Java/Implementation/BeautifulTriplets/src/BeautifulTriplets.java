import java.util.HashMap;
import java.util.Map;

public class BeautifulTriplets {

	public static void main(String[] args) {
		System.out.println(getTriplets(new int[] { 2, 2, 3, 4, 5 }, 1));
	}

	public static int getTriplets(int[] arr, int d) {
		Map<Integer, Integer> map = new HashMap<>();
		int res = 0;
		for (int i = 0; i < arr.length; i++)
			map.put(arr[i], 1);
		for (int i = 0; i < arr.length; i++)
			if (map.containsKey(arr[i] + d) && map.containsKey(arr[i] + d + d))
				res++;
		return res;
	}
}
