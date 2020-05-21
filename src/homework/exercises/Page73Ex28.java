package homework.exercises;
public class Page73Ex28 {

	public static void main(String[] args) {
		int[] mas = new int[11];
		for (int i = 0; i < mas.length; i++) {
			mas[i] = (int) ((Math.random() * 3 - 1.5));
			System.out.print(mas[i] + "\t");
		}
		System.out.println();
		int b = 0;
		int c = 0;
		int d = 0;
		for (int i = 0; i < mas.length; i++) {
			if (mas[i] == -1) {
				b++;
			}
			if (mas[i] == 0) {
				c++;
			}
			if (mas[i] == 1) {
				d++;
			}
		}
		/*
		 * System.out.println(b); System.out.println(c); System.out.println(d);
		 */
		if (b > c && b > d && b != c && b != d) {
			System.out.println("����� -1 ����������� ���� �����: " + b + " ���");
		} else if (b < c && c > d && b != c && b != d) {
			System.out.println("����� 0 ����������� ���� �����: " + c + " ���");
		} else if (b < d && c < d && b != c && b != d) {
			System.out.println("����� 1 ����������� ���� �����: " + d + " ���");
		}
	}
}