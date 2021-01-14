package arrays;

public class ArrayDS {
	public static void main(String args[]) {

		int[][] arr = { { -9, -9, -9, 1, 1, 1 }, { 0, -9, 0, 4, 3, 2 }, { -9, -9, -9, 1, 2, 3 }, { 0, 0, 8, 6, 6, 0 },
				{ 0, 0, 0, -2, 0, 0 }, { 0, 0, 1, 2, 4, 0 } };
		System.out.println(hourglassSum(arr));

		int[][] secondArr = { { 1, 1, 1, 0, 0, 0 }, { 0, 1, 0, 0, 0, 0 }, { 1, 1, 1, 0, 0, 0 }, { 0, 0, 2, 4, 4, 0 },
				{ 0, 0, 0, 2, 0, 0 }, { 0, 0, 1, 2, 4, 0 } };
		
		System.out.println(hourglassSum(secondArr));

	}

	static int hourglassSum(int[][] arr) {
		int hourGlassSum = 0;
		int highestHourGlassSum = -63; //hourglass has 7 edge, the least number can be 7*(-9)

		for (int i = 0; i < 4; i++) {
			for (int j = 0; j < 4; j++) {
				System.out.println("New hourglass beginning");

				hourGlassSum = 0;
				for (int k = 0; k < 3; k++) {
					for (int l = 0; l < 3; l++) {
						if (k == 1) {
							if (k == l) {
								System.out.println("Middle point of hourglass : " + arr[k + i][l + j]);
								hourGlassSum += arr[k + i][l + j];
							}
						} else {
							System.out.println("Edge of hourglass : " + arr[k + i][l + j]);
							hourGlassSum += arr[k + i][l + j];
						}
					}
				}
				if (highestHourGlassSum < hourGlassSum)
					highestHourGlassSum = hourGlassSum;
				System.out.println("Hour glass sum : " + hourGlassSum);
			}
			System.out.println("Highest hourglass sum : " + highestHourGlassSum);
		}
		return highestHourGlassSum;
	}
}