package homework.exercises;
public class Page73Ex23 {

	public static void main(String[] args) {
		int n = 5;
		int[] mas = new int[n];
		double b = 0;
		for (int i = 0; i < mas.length; i++) {
			mas[i] = (int) ((Math.random() * 6));
			System.out.print(mas[i] + "\t");
			b = b + mas[i];
		}
		System.out.println();

		int m = 5;
		int[] mas2 = new int[m];
		double c = 0;
		for (int i = 0; i < mas2.length; i++) {
			mas2[i] = (int) ((Math.random() * 6));
			System.out.print(mas2[i] + "\t");
			c = c + mas2[i];
		}
		System.out.println();

		if ((b / n > c / m)) {
			System.out.println("������� �������������� ������� ������� ������ �������");
		} else if (c / m > b / n) {
			System.out.println("������� �������������� ������� ������� ������ �������");
		} else {
			System.out.println("������� �������������� ������� ������� ����� �������");
		}
	}
}