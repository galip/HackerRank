package preparationkit.sorting;

/**
 * @author galip
 *
 *         2021-03-15 
 *         
 *         Question link:
 *         https://www.hackerrank.com/challenges/ctci-bubble-sort/problem?h_l=interview&playlist_slugs%5B%5D=interview-preparation-kit&playlist_slugs%5B%5D=sorting
 */
public class BubbleSort {
	public static void main(String args[]) {

		int[] firstTest = { 1, 2, 3 };

		int[] secondTest = { 3, 2, 1 };

		int[] thirdTest = { 4, 2, 3, 1 };

		countSwaps(firstTest);
		countSwaps(secondTest);
		countSwaps(thirdTest);

	}

	static void countSwaps(int[] a) {

		int tmp;
		int counter = 0;
		int length = a.length;
		for (int i = 0; i < (a.length - 1); i++) {
			for (int j = i + 1; j < a.length; j++) {
				if (a[i] > a[j]) {
					tmp = a[i];
					a[i] = a[j];
					a[j] = tmp;

					counter++;
				}
			}
		}
		System.out.println("Array is sorted in " + counter + " swaps.");
		System.out.println("First Element: " + a[0]);
		System.out.println("Last Element: " + a[length - 1]);
	}
}