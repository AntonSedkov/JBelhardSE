package homework.exercises2;
public class Page74Ex32 {

	public static void main(String[] args) {
		int[][] arr = new int[6][7];
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