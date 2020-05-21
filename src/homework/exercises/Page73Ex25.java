package homework.exercises;
public class Page73Ex25 {

	public static void main(String[] args) {
		int[] mas = new int[20];
		mas[0] = 1;
		mas[1] = 1;
		for (int i = 2; i < mas.length; i++) {
			mas[i] = mas[i - 2] + mas[i - 1];
		}
		for (int i = 0; i < mas.length; i++) {
			System.out.print(mas[i] + "\t");
		}
	}
}