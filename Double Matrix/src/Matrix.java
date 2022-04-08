import java.util.*;

public class Matrix {

	public static int[] diagonalArraySize(int arr[][]) {

		int r = arr.length;
		int c = arr[0].length;

		int length = r + c - 1;
		int d[] = new int[length];

		int biggestSize = Math.min(r, c);

		if (length % 2 == 0) {
			for (int i = 0; i < length; i++) {
				if (i < length / 2) {
					d[i] = Math.min(i + 1, biggestSize);
				} else {
					d[i] = d[length - 1 - i];
				}
			}
		} else {
			for (int i = 0; i < length; i++) {

				if (i < length / 2) {
					d[i] = Math.min(i + 1, biggestSize);
				} else if (i == length / 2) {
					d[i] = biggestSize;

				} else {
					d[i] = d[length - 1 - i];
				}

			}
		}

		return d;
	}

	public static int[] headArray(int[][] arr) {

		int r = arr.length;
		int c = arr[0].length;

		int length = r + c - 1;

		int d[] = new int[length];
		// int i,j;
		for (int i = r - 1; i >= 0; i--) {
			d[r - 1 - i] = arr[i][0];
		}
		for (int i = 1; i < c; i++) {
			d[r - 1 + i] = arr[0][i];
		}

		return d;

	}

	public static List fullArrayList(int arr[][]) {

		List<Integer[]> list = new ArrayList<>();

		int r = arr.length;
		int c = arr[0].length;

		int das[] = diagonalArraySize(arr);
		int ha[] = headArray(arr);

		int len = r + c - 1;

		for (int i = 0; i <r; i++) {

			Integer intArr[] = new Integer[das[i]];

			for (int j = 0; j < intArr.length; i++) {

				intArr[j] = arr[r-1-i-j][j];

			}

			list.add(intArr);

		}

		for (int i = 1; i < c; i++) {

			Integer intArr[] = new Integer[das[r + i - 1]];

			for (int j = 0; j < intArr.length; i++) {

				intArr[j] = arr[i + j][j];
			}

			list.add(intArr);
		}

		// System.out.println("list ",list);

		return list;

	}

	// public static boolean solve(int[][] matrix) {

	// int das[]=diagonalArraySize(matrix);
	// int ha[]=headArray(matrix);

	// for(int i=0;i<das.length;i++){
	// int temphead=ha[i];

	// for(int j=0;j<das[i];j++){
	// if(!temphead.equals(matrix[][]))
	// }
	// }

	// return true;

	// }

}
