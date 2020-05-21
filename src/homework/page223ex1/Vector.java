package homework.page223ex1;
import java.util.Scanner;

public class Vector implements Arithmetic {

	int[] vec;

	public int[] create() {
		Scanner sc = new Scanner(System.in);
		int n = 0;
		System.out.println("Write number of elements");
		if (sc.hasNextInt()) {
			n = sc.nextInt();
		}
		int[] ex = new int[n];
		System.out.println("Write a numeric elements");
		for (int i = 0; i < n; i++) {
			System.out.println("Element " + (i + 1));
			if (sc.hasNextInt()) {
				ex[i] = sc.nextInt();
			}
			
		}
		sc.close();
		return ex;
	}

	public void compareLength(Vector b) {
		if (this.vec.length != b.vec.length) {
			System.out.println("Vectors lengths are not identical");
		} else {
			System.out.println("Vectors lengths are identical");
		}
	}

	public void show() {
		for (int i = 0; i < vec.length; i++) {
			System.out.print(vec[i] + "\t");
		}
		System.out.println();
	}

	@Override
	public void sum(Arithmetic a) {
		Vector sA = (Vector) a;
		int[] vecS = new int[this.vec.length + sA.vec.length];
		for (int i = 0; i < this.vec.length; i++) {
			vecS[i] = this.vec[i];
		}
		for (int i = 0; i < sA.vec.length; i++) {
			vecS[this.vec.length + i] = sA.vec[i];
		}
		for (int i = 0; i < vecS.length; i++) {
			System.out.print(vecS[i] + "\t");
		}
		System.out.println();
	}

	@Override
	public void compare(Arithmetic a) {
		Vector sA = (Vector) a;
		if (this.vec.length == sA.vec.length) {
			for (int i = 0; i < this.vec.length; i++) {
				if (this.vec[i] != sA.vec[i]) {
					System.out.println("Vectors are not identical");
					break;
				} else if (i == (this.vec.length - 1) && this.vec[i] == sA.vec[i]) {
					System.out.println("Vectors are identical");
				}
			}
		} else {
			System.out.println("Vectors are not identical");
		}
	}
}