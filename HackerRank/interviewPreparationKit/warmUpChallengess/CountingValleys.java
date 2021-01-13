package warmUpChallengess;

/**
 * @author galip
 *
 *         2021-01-14
 * 
 *         Question link :
 *         https://www.hackerrank.com/challenges/counting-valleys/problem?h_l=interview&playlist_slugs%5B%5D=interview-preparation-kit&playlist_slugs%5B%5D=warmup
 */
public class CountingValleys {
	public static void main(String args[]) {

		// test cases from hackerrank
		String path = "UDDDUDUU";
		int steps = 8;
		System.out.println(countingValleys(steps, path));

		String secondPath = "DDUUDDUDUUUD";
		steps = 12;
		System.out.println(countingValleys(steps, secondPath));

	}

	public static int countingValleys(int steps, String path) {
		char pathArray[] = path.toCharArray();

		int valleyCount = 0;
		int stepLevel = 0;
		for (int i = 0; i < steps; i++) {
			if (pathArray[i] == 'U') {
				stepLevel++;
				if (stepLevel == 0) {
					valleyCount++;
				}
			} else {
				stepLevel--;
			}
		}
		return valleyCount;
	}
}