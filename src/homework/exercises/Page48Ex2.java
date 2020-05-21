package homework.exercises;
public class Page48Ex2 {

	public static void main(String[] args) {
		int a = 1;
		int b = 0;
		int c = 1;

		while (b <= 200 || c <= 300) {
			System.out.println(a);
			b = b + a;
			c = c * a;
			a = a + 3;
		}
	}
}