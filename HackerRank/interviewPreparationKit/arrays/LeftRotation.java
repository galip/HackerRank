package arrays;

/**
 * @author galip
 *
 *         2021-01-16
 * 
 *         Question link :
 *         https://www.hackerrank.com/challenges/ctci-array-left-rotation/problem?h_l=interview&playlist_slugs%5B%5D=interview-preparation-kit&playlist_slugs%5B%5D=arrays
 */
public class LeftRotation {
	public static void main(String agrs[]) {

		int n = 5;
		int d = 4;
		int[] firstTest = { 1, 2, 3, 4, 5 };

		int firstResult[] = rotLeft(firstTest, d);
		for (int i = 0; i < firstResult.length; i++)
			System.out.println(firstResult[i]);

		n = 20;
		d = 10;
		int[] secondTest = { 41, 73, 89, 7, 10, 1, 59, 58, 84, 77, 77, 97, 58, 1, 86, 58, 26, 10, 86, 51 };
		int secondResult[] = rotLeft(secondTest, d);
		for (int i = 0; i < secondResult.length; i++) {
			System.out.println(secondResult[i]);
		}

		n = 15;
		d = 13;
		int[] thirdTest = { 33, 47, 70, 37, 8, 53, 13, 93, 71, 72, 51, 100, 60, 87, 97 };
		int thirdResult[] = rotLeft(thirdTest, d);
		for (int i = 0; i < thirdResult.length; i++) {
			System.out.println(thirdResult[i]);
		}

	}

	static int[] rotLeft(int[] a, int d) {
		int tmp = 0;
		int length = a.length;
		for (int i = 0; i < d; i++) {
			tmp = a[0];
			for (int j = 1; j < length; j++) {
				a[j - 1] = a[j];
			}
			a[length - 1] = tmp;
		}
		return a;
	}
}