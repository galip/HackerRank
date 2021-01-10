package warmUpChallengess;

/**
 * @author galip
 *
 *         2021-01-08
 * 
 *         Question link :
 *         https://www.hackerrank.com/challenges/jumping-on-the-clouds/problem?h_l=interview&playlist_slugs%5B%5D=interview-preparation-kit&playlist_slugs%5B%5D=warmup
 */
public class JumpingOnTheClouds {

	public static void main(String args[]) {
		// Some of the test cases
		int[] firstTest = { 0, 0, 0, 0, 0, 0 };
		System.out.println(jumpingOnClouds(firstTest));

		int[] secondTest = { 0, 0, 1, 0, 0, 1, 0 };
		System.out.println(jumpingOnClouds(secondTest));

		int[] thirdTest = { 0, 0, 0, 0, 1, 0 };
		System.out.println(jumpingOnClouds(thirdTest));

	}

	static int jumpingOnClouds(int[] cloud) {
		int maxJumpStep = 2;
		int cloudLength = cloud.length;

		int currentIndex = 0;
		int stepCount = 0;

		int i = 0;
		while (currentIndex + maxJumpStep <= cloudLength) {

			i++;
			if (((currentIndex + maxJumpStep) <= (cloudLength - 1)) && cloud[currentIndex + maxJumpStep] == 1) {
				maxJumpStep--;
			} else {
				currentIndex = currentIndex + maxJumpStep;
				stepCount++;
				maxJumpStep = 2;
			}
		}

		return stepCount;

	}
}