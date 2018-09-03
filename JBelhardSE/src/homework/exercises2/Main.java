package homework.exercises2;
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

		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
