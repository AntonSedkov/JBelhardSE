package homework.exercises;

import java.util.Scanner;
// факториал
public class Page48Ex3 {

	public static void main(String[] args) {
		int a = 0;
		Scanner sc = new Scanner(System.in);
		if (sc.hasNextInt()) {
			a = sc.nextInt();
			sc.close();
		}
	
		int d = 1;
		while (true) {

			d = d * a--;

			if (a == 0) {

				System.out.println(d);
				break;
			}

		}

	}

}
