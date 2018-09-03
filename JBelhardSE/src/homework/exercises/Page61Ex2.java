package homework.exercises;
public class Page61Ex2 {

	public static void main(String[] args) {
		int[] mas = new int[50];
		int b = 0;
		for (int i = 0; i < mas.length; i++) {
			mas[i] = b * 2 + 1;
			b++;
		}
		for (int i = 0; i < mas.length; i++) {
			System.out.print(mas[i] + "\t");
		}
		System.out.println();
		for (int i = mas.length - 1; i > 0 - 1; i--) {
			System.out.print(mas[i] + "\t");
		}
	}
}
