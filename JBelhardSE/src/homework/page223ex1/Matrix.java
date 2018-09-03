package homework.page223ex1;
import java.util.Scanner;

public class Matrix implements Arithmetic {

	public int[][] arr;

	public int[][] create() {
		Scanner sc = new Scanner(System.in);
		int n = 0, m = 0;
		System.out.println("Write number of strings");
		if (sc.hasNextInt()) {
			n = sc.nextInt();
			System.out.println("Write number of columns");
			m = sc.nextInt();
		}
		int[][] ex = new int[n][m];
		for (int i = 0; i < ex.length; i++) {
			for (int j = 0; j < ex[0].length; j++) {
				ex[i][j] = (int) (Math.random() * 13 - 6);
			}
		}
		sc.close();
		return ex;
	}

	public void show() {
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr[0].length; j++) {
				System.out.print(arr[i][j] + "\t");
			}
			System.out.println();
		}
	}

	public void showOne() {
		Scanner sc = new Scanner(System.in);
		int n = 0, m = 0;
		System.out.println("Choose number of string less than " + arr.length);
		if (sc.hasNextInt()) {
			n = sc.nextInt() - 1;
			System.out.println("Choose number of column less than " + arr[0].length);
			m = sc.nextInt() - 1;
		}
		sc.close();
		System.out.println(arr[n][m]);
	}

	public int[][] toMin(int a) {
		System.out.println("Division: \t");
		int[][] ex = this.arr;
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr[0].length; j++) {
				ex[i][j] = arr[i][j] / a;
			}
		}
		return ex;
	}

	@Override
	public void sum(Arithmetic a) {
		Matrix sA = (Matrix) a;
		if (arr.length == sA.arr.length && arr[0].length == sA.arr[0].length) {
			System.out.println("Sum : \t");
			int[][] arrSum = new int[arr.length][arr[0].length];
			for (int i = 0; i < arr.length; i++) {
				for (int j = 0; j < arr[i].length; j++) {
					arrSum[i][j] = arr[i][j] + sA.arr[i][j];
					System.out.print(arrSum[i][j] + "\t");
				}
				System.out.println();
			}
		} else {
			System.out.println("Matrix are not the same size");
		}
	}

	@Override
	public void compare(Arithmetic a) {
		Matrix sA = (Matrix) a;
		if (arr.length == sA.arr.length || arr[0].length == sA.arr[0].length) {
			for (int i = 0; i < arr.length; i++) {
				for (int j = 0; j < arr[i].length; j++) {
					if (arr[i][j] != sA.arr[i][j]) {
						break;
					} else if (arr[i][j] == sA.arr[i][j] && i == (arr.length - 1) && j == (arr[0].length - 1)) {
						System.out.println("Matrix are identical");
					}
				}
			}
			System.out.println("Matrix are not identical");
		} else {
			System.out.println("Matrix are not the same size");
		}
	}
}