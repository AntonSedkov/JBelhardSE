package homework.exercises2;
public class Page69Ex1 {

	public static void main(String[] args) {
		int table[][] = new int[4][];
		table[0] = new int[(int) (Math.random() * 10 + 1)];
		table[1] = new int[(int) (Math.random() * 10 + 1)];
		table[2] = new int[(int) (Math.random() * 10 + 1)];
		table[3] = new int[(int) (Math.random() * 10 + 1)];
		for (int i = 0; i < table.length; i++) {
			for (int j = 0; j < table[i].length; j++) {
				table[i][j] = (int) (Math.random() * 6 + 0);
			}
		}
		for (int i = 0; i < table.length; i++) {
			for (int j = 0; j < table[i].length; j++) {
				System.out.print(table[i][j] + "\t");
			}
			System.out.println();
		}
		System.out.println();
		for (int i = 1; i < table.length; i++) {
			for (int j = 0; j < table.length; j++) {
				int[] b;
				if (table[i].length > table[j].length) {
					b = table[i];
					table[i] = table[j];
					table[j] = b;
				}
			}
		}
		for (int i = 0; i < table.length; i++) {
			for (int j = 0; j < table[i].length; j++) {
				System.out.print(table[i][j] + "\t");
			}
			System.out.println();
		}
	}
}