package homework.exercises;
public class Page61Ex1 {

	public static void main(String[] args) {
		int[] mas = new int[10];

		int b = 0;
		for (int i = 0; i < mas.length; i++) {
			mas[i] = b + 2;
			b = b + 2;
		}

		for (int i = 0; i < mas.length; i++) {
			System.out.print(mas[i] + "\t");
		}
		System.out.println();
		for (int i = 0; i < mas.length; i++) {
			System.out.println(mas[i]);
		}
	}

}
