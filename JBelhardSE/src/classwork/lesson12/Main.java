package classwork.lesson12;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Animal one = new Animal("Sunny", 5, 55);
		one.show();

		Cat two = new Cat("Rizhik", 3, 15, 80);
		two.show();

		System.out.println();

		Kitty three = new Kitty("Barsik", 1, 7, 3, 5);
		three.show();

		Cat four = new Cat(one);
		four.show();

		Kitty five = new Kitty(four);
		five.show();

		Scanner sc = new Scanner(System.in);
		System.out.println("������� ���������� ���������:");
		int i = 0;
		if (sc.hasNextInt()) {
			i = sc.nextInt();
		}

		Animal[] arr = new Animal[i];

		for (int j = 0; j < i; j++) {
			int b = (int) (Math.random() * 4 + 1);
			switch (b) {
			case 1:
				arr[j] = Animal.create();
				break;
			case 2:
				arr[j] = Cat.create();
				break;
			case 3:
				arr[j] = Kitty.create();
				break;
			case 4:
				arr[j] = Dog.create();
				break;
			}
			System.out.print(arr[j] + "\t");
		}
	sc.close();
	}
}