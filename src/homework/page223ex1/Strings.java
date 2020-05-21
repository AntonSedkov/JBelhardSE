package homework.page223ex1;
import java.util.Scanner;

public class Strings implements Arithmetic {

	String s;
	char[] arr;

	public String create() {
		Scanner sc = new Scanner(System.in);
		String n = this.s;
		System.out.println("Write a string");
		if (sc.hasNext()) {
			n = sc.next();
		}
		System.out.println(n);
		sc.close();
		return n;
		
	}

	public char[] createChArr() {
		String s = this.s;
		char[] arr = s.toCharArray();
		for (int i = 0; i < arr.length; i++)
			System.out.print(arr[i] + "\t");
		System.out.println();
		return arr;
	}

	public void showOne() {
		Scanner sc = new Scanner(System.in);
		int n = 0;
		System.out.println("Choose number of string element lower than " + arr.length);
		if (sc.hasNextInt()) {
			n = sc.nextInt() - 1;
		}
		sc.close();
		System.out.println(arr[n]);
	}

	@Override
	public void sum(Arithmetic a) {
		Strings sA = (Strings) a;
		String c = this.s + sA.s;
		System.out.println(c);
	}

	@Override
	public void compare(Arithmetic a) {
		Strings sA = (Strings) a;
		System.out.println(this.s.equals(sA.s));
	}
}