package homework.exercises;
public class Page71Ex2_5 {

	public static void main(String[] args) {
		int a = 1564;
		System.out.println(((a / 1000) % 10 != (a / 100) % 10) && ((a / 1000) % 10 != (a / 10) % 10)
				&& ((a / 1000) % 10 != a % 10) && ((a / 100) % 10 != (a / 10) % 10) && ((a / 100) % 10 != a % 10)
				&& ((a / 10) % 10 != a % 10));
	}
}