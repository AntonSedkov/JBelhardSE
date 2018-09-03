package homework.page117;
public class Matrix {

	public int[][] arr;

	public Matrix(int a) {
		arr = new int[1][a];
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr[i].length; j++) {
				arr[i][j] = (int) (Math.random() * 6 + 5);
			}
		}
	}

	public Matrix(int a, int b) {
		arr = new int[a][b];
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr[i].length; j++) {
				arr[i][j] = (int) (Math.random() * 11 - 5);
			}
		}
	}

	public void show() {
		System.out.println("�������: \t");
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr[i].length; j++) {
				System.out.print(arr[i][j] + "\t");
			}
			System.out.println();
		}
	}

	public void sum(Matrix X) {
		if (arr.length == X.arr.length && arr[0].length == X.arr[0].length) {
			System.out.println("�����: \t");
			int[][] arrSum = new int[arr.length][arr[0].length];
			for (int i = 0; i < arr.length; i++) {
				for (int j = 0; j < arr[i].length; j++) {
					arrSum[i][j] = arr[i][j] + X.arr[i][j];
					System.out.print(arrSum[i][j] + "\t");
				}
				System.out.println();
			}
		} else {
			System.out.println("������� �� ����������� �������, ������������ ����������");
		}
	}

	public void vich(Matrix X) {
		if (arr.length == X.arr.length && arr[0].length == X.arr[0].length) {
			System.out.println("�������: \t");
			int[][] arrVich = new int[arr.length][arr[0].length];
			for (int i = 0; i < arr.length; i++) {
				for (int j = 0; j < arr[i].length; j++) {
					arrVich[i][j] = arr[i][j] - X.arr[i][j];
					System.out.print(arrVich[i][j] + "\t");
				}
				System.out.println();
			}
		} else {
			System.out.println("������� �� ����������� �������, ��������� ����������");
		}
	}

	public void multi(Matrix X) {
		if (arr[0].length == X.arr.length) {
			System.out.println("������������: \t");
			int[][] arrMulti = new int[arr.length][X.arr[0].length];
			for (int i = 0; i < arr.length; i++) {
				for (int j = 0; j < X.arr[0].length; j++) {
					for (int n = 0; n < X.arr.length; n++) {
						arrMulti[i][j] += arr[i][n] * X.arr[n][j];
					}
					System.out.print(arrMulti[i][j] + "\t");
				}
				System.out.println();
			}
		} else {
			System.out.println("����� �������� ������ ������� �� ��������� � ������ ����� ������, ��������� ����������");
		}
	}
}