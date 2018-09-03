package homework.exercises2;
public class Page67Ex3 {

	public static void main(String[] args) {
		int[][] arr = new int[7][4];
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr[i].length; j++) {
				arr[i][j] = (int) (Math.random() * 11 - 5);
			}
		}
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr[i].length; j++) {
				System.out.print(arr[i][j] + "\t");
			}
			System.out.println();
		}
		System.out.println();
		int c = 0, d = 0;
		for (int i = 0; i < arr.length; i++) {
			int b = 1;
			for (int j = 0; j < arr[i].length; j++) {
				b = b * Math.abs(arr[i][j]);
			}
			if (b > c) {
				c = b;
				d = i;
			}
		}
		System.out.println("������ ������ � ���������� �� ������ ������������� " + d + ".");
	}
}