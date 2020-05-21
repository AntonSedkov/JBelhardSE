package homework.exercises;
public class Page61Ex3 {

	public static void main(String[] args) {
		int[] mas = new int[15];
		for (int i = 0; i < mas.length; i++) {
			mas[i] = (int) (Math.random() * 9);
		}
		for (int i = 0; i < mas.length; i++) {
			System.out.print(mas[i] + "\t");
		}
		System.out.println();
		int b = 0;
		int a = 0;
		while (a < mas.length) {
			if (a % 2 == 0) {
				a++;
				b++;
			} else {
				a++;
				continue;
			}
		}
		System.out.println(b);
	}
}
