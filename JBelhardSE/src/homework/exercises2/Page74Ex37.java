package homework.exercises2;
public class Page74Ex37 {

	public static void main(String[] args) {
		int n = (int) (Math.random() * 5 + 3); // [3;7]
		int m = (int) (Math.random() * 4 + 3); // [3;6]
		int[][] arr = new int[n][m];
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr[i].length; j++) {
				arr[i][j] = (int) (Math.random() * 10);
			}
		}
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr[i].length; j++) {
				System.out.print(arr[i][j] + "\t");
			}
			System.out.println();
		}
		System.out.println();
		for (int i = 0; i < arr.length; i++) {
			for (int j = arr[i].length - 1; j > 0; j--) {
				if (arr[i][j - 1] < arr[i][j]) {
					int b = arr[i][j];
					arr[i][j] = arr[i][j - 1];
					arr[i][j - 1] = b;
				}
				if (j > 2 && arr[i][j - 2] < arr[i][arr[i].length - 1]) {
					int b = arr[i][j - 2];
					arr[i][j - 2] = arr[i][arr[i].length - 1];
					arr[i][arr[i].length - 1] = b;
				} else if (j == 1 && arr[i][j] < arr[i][arr[i].length - 1]) {
					int b = arr[i][j];
					arr[i][j] = arr[i][arr[i].length - 1];
					arr[i][arr[i].length - 1] = b;
				}
			}
		}
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr[i].length; j++) {
				System.out.print(arr[i][j] + "\t");
			}
			System.out.println();
		}
	}
}