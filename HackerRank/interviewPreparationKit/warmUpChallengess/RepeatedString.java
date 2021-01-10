package warmUpChallengess;

/**
 * @author galip
 *
 *         2020-12-29
 * 
 *         Question link :
 *         https://www.hackerrank.com/challenges/repeated-string/problem?h_l=interview&playlist_slugs%5B%5D=interview-preparation-kit&playlist_slugs%5B%5D=warmup
 * 
 */
public class RepeatedString {
	public static void main(String args[]) {

		long firstTest = repeatedString("aba", 10L);
		System.out.println("First test result : " + firstTest);

		long secondTest = repeatedString("a", 1000000000000L);
		System.out.println("Second test result : " + secondTest);

		long thirdTest = repeatedString("aba", 1000000000000L);
		System.out.println("Third test result : " + thirdTest);

	}

	static long repeatedString(String s, long n) {

		char[] a = s.toCharArray();
		long repeatedCount = 0;
		long blockCountOfGivenString = n / a.length;

		int countOfAInSingleBlock = 0;
		for (int i = 0; i < a.length; i++) {
			if (a[i] == 'a') {
				countOfAInSingleBlock++;
			}
		}
		repeatedCount = blockCountOfGivenString * countOfAInSingleBlock;
		long remainingCount = n % a.length;

		for (int i = 0; i < remainingCount; i++) {
			if (a[i] == 'a') {
				repeatedCount++;
			}
		}
		return repeatedCount;
	}
}