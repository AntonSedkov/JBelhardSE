package homework.exercises2;
public class Page69Exs {

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

		for (int i = 0; i < table.length; i++) {
			for (int j = 0; j < table[i].length; j++) {
				System.out.print(j + "\t");
			}
			System.out.println();
		}
		System.out.println();

	/*	for (int i = 0; i < table.length - 1; i++) {
			for (int j = 0; j < table[i].length; j++) {
				for (int n = 1; n < table.length; n++) {
					if (i > n) {
						int m = i;
						i = n;
						n = m;
					}

				}
			}
		}

		for (int i = 0; i < table.length; i++) {
			for (int j = 0; j < table[i].length; j++) {
				System.out.print(table[i][j] + "\t");
			}
			System.out.println();
		}

	}*/
}}
