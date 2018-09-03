package homework.exercises;
public class Page71Ex2_6 {

	public static void main(String[] args) {
		int a = 6556;
		System.out.println(((a / 1000) % 10 == a % 10) && ((a / 100) % 10 == (a / 10) % 10));
	}
}