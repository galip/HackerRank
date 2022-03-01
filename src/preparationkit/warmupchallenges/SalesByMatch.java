package preparationkit.warmupchallenges;

/**
 * @author galip
 *
 *         2021-01-10
 * 
 *         Question link :
 *         https://www.hackerrank.com/challenges/sock-merchant/problem?h_l=interview&playlist_slugs%5B%5D=interview-preparation-kit&playlist_slugs%5B%5D=warmup
 */
public class SalesByMatch {
	public static void main(String args[]) {

		int[] firstTestArray = { 10, 20, 20, 10, 10, 30, 50, 10, 20 };
		int firstN = 9;

		System.out.println(sockMerchant(firstN, firstTestArray));

		int[] secondTestArray = { 1, 1, 3, 1, 2, 1, 3, 3, 3, 3 };
		int secondN = 10;

		System.out.println(sockMerchant(secondN, secondTestArray));

	}

	static int sockMerchant(int n, int[] ar) {
		int sockPairCount = 0;
		for (int i = 0; i < (n - 1); i++) {
			for (int j = i + 1; j < n; j++) {

				if (ar[i] == ar[j] && ar[i] != 0) {
					sockPairCount++;
					ar[i] = 0;
					ar[j] = 0;
				}
			}
		}
		return sockPairCount;
	}
}