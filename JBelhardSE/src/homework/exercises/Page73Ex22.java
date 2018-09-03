package homework.exercises;
public class Page73Ex22 {

	public static void main(String[] args) {
		int[] mas = new int[8];
		for (int i = 0; i < mas.length; i++) {
			mas[i] = (int) ((Math.random() * 10 + 1));
		}
		for (int i = 0; i < mas.length; i++) {
			System.out.print(mas[i] + "\t");
		}
		System.out.println();
		for (int i = 0; i < mas.length; i++) {
			if (i % 2 != 0) {
				mas[i] = 0;
			}
		}
		for (int i = 0; i < mas.length; i++) {
			System.out.print(mas[i] + "\t");
		}
	}
}