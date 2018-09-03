package homework.exercises;
import java.util.Scanner;

public class Page53Ex1 {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int a = 0;
		if (sc.hasNextInt()) {
			a = sc.nextInt();
			sc.close();
		}

		switch (a) {
		case 12:
		case 1:
		case 2:
			System.out.println("Winter");
			break;
		case 3:
		case 4:
		case 5:
			System.out.println("Spring");
			break;
		case 6:
		case 7:
		case 8:
			System.out.println("Summer");
			break;
		case 9:
		case 10:
		case 11:
			System.out.println("Autunm");
			break;
		default:
			System.out.println("The number is not true");
		}

	}
}
