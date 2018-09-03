package common.dVideos.calcOps;

import java.util.Scanner;

public class Operations {

	public static void main(String[] args) {
		System.out.print("Enter the number");
		@SuppressWarnings("resource")
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		System.out.println("a = " + a);

		System.out.println("Enter the operation");
		System.out.println("1. Sum");
		System.out.println("2. Subtraction");
		System.out.println("3. Multiplication");
		System.out.println("4. Division");
		@SuppressWarnings("resource")
		Scanner sc1 = new Scanner(System.in);
		int operation = sc1.nextInt();
		System.out.print("Enter the 1st number");
		int b = sc1.nextInt();
		System.out.print("Enter the 2nd number");
		int c = sc1.nextInt();
		double res = 0;
		if (operation == 1) {
			res = b + c;
		} else if (operation == 2) {
			res = b - c;
		} else if (operation == 3) {
			res = b * c;
		} else {
			res = (double) b / c;
		}
		System.out.println("Result = " + res);

	}

}