package homework.exercises2;
public class Page67Ex2 {

	public static void main(String[] args) {
		int[][] arr = new int[5][8];
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr[i].length; j++) {
				arr[i][j] = (int) (Math.random() * 199 - 99);
			}
		}
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr[i].length; j++) {
				System.out.print(arr[i][j] + "\t");
			}
			System.out.println();
		}
		int a = arr[0][0];
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr[i].length - 1; j++) {
				if (arr[i][j] > a) {
					a = arr[i][j];
				}
			}
		}
		System.out.println(a);
	}
}