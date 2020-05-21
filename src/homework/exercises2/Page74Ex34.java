package homework.exercises2;
public class Page74Ex34 {

	public static void main(String[] args) {
		int n = (int) (Math.random() * 5 + 2); // [2;6]
		int[][] arr = new int[n][n];
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr[i].length; j++) {
				arr[i][j] = (int) (Math.random() * 19 - 9); // [-9;9]
			}
		}
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr[i].length; j++) {
				System.out.print(arr[i][j] + "\t");
			}
			System.out.println();
		}
		System.out.println();
		int c = 0;
		for (int i = 0; i < arr.length; i++) {
			int b = 0;
			for (int j = 0; j < arr[i].length; j++) {
				if (j > i && arr[i][j] > 0) {
					b = b + arr[i][j];
				}
			}
			c = c + b;
		}
		System.out.println(c);
	}
}