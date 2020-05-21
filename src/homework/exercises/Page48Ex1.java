package homework.exercises;
public class Page48Ex1 {
	public static void main(String[] args) {
		int a = 0;

		while (a < 10) {
			a++;
			if (a % 2 == 0) {
				System.out.println("Число " + a + " четное");
			} else {
				System.out.println("Число " + a + " нечетное");
			}
		}
	}
}