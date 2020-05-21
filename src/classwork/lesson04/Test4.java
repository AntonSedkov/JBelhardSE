package classwork.lesson04;

public class Test4 {

	public static void main(String[] args) {
		int[][] mas = new int[3][3];
		// System.out.println(mas[1][2]);

		mas[0][1] = -5;

		for (int i = 0; i < mas.length; i++) {
			for (int j = 0; j < mas[i].length; j++) {
				mas[i][j] = (int) (Math.random() * 11 + 5);
			}
		}

		for (int i = 0; i < mas.length; i++) {
			for (int j = 0; j < mas[i].length; j++) {
				System.out.print(mas[i][j] + "\t");
			}
			System.out.println();
		}

		String[][] mas2 = { { "5345" }, { "dfs", "dfsd", "dfsd" }, { "dfsdf", "defrsdfs" } };

		for (int i = 0; i < mas2.length; i++) {
			for (int j = 0; j < mas2[i].length; j++) {
				System.out.print(mas2[i][j] + "\t");
			}
			System.out.println();
		}

		for (int i = 0; i < mas.length; i++) {
			for (int j = 0; j < mas[i].length - 1; j++) {
				for (int n = j + 1; n < mas[i].length; n++) {
					if (mas[i][j] > mas[i][n]) {
						int a = mas[i][j];
						mas[i][j] = mas[i][n];
						mas[i][n] = a;
					}
				}
			}
		}

		for (int i = 0; i < mas.length; i++) {
			for (int j = 0; j < mas[i].length; j++) {
				System.out.print(mas[i][j] + "\t");
			}
			System.out.println();
		}
		System.out.println();
		int[][] mas3 = new int[5][];
		mas3[0] = new int[7];
		mas3[1] = new int[4];
		mas3[2] = new int[1];
		mas3[3] = new int[9];
		mas3[4] = new int[6];

		for (int i = 0; i < mas3.length; i++) {
			for (int j = 0; j < mas3[i].length; j++) {
				System.out.print(mas3[i][j] + "\t");
			}
			System.out.println();
		}

	}

}