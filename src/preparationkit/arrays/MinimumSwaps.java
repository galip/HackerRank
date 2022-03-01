package preparationkit.arrays;

/**
 * @author galip
 *
 *         2021-01-23
 * 
 *         Question link :
 *         https://www.hackerrank.com/challenges/minimum-swaps-2/problem?h_l=interview&playlist_slugs%5B%5D=interview-preparation-kit&playlist_slugs%5B%5D=arrays
 */
public class MinimumSwaps {
	public static void main(String agrs[]) {

		int[] firstTestArray = { 4, 3, 1, 2 };

		int[] secondTestArray = { 2, 3, 4, 1, 5 };

		int[] thirdTestArray = { 1, 3, 5, 2, 4, 6, 7 };

		System.out.println(minimumSwaps(firstTestArray));

		System.out.println(minimumSwaps(secondTestArray));

		System.out.println(minimumSwaps(thirdTestArray));

	}

	static int minimumSwaps(int[] arr) {
		int swapCounter = 0;
		int length = arr.length;
		int tmp = 0;

		for (int i = 1; i <= length; i++) {
			for (int j = i; j < length; j++) {
				if (i == arr[j]) {
					tmp = arr[i - 1];
					arr[i - 1] = arr[j];
					arr[j] = tmp;
					swapCounter++;
					break;
				}
			}
		}
		return swapCounter;
	}
}