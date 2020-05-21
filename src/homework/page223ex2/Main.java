package homework.page223ex2;

public class Main {

	public static void main(String[] args) {

		Area[] arr = new Area[4];
		arr[0] = new Rectangle(4.2, 5.5);
		arr[1] = new Circle(7.7);
		arr[2] = new RightTriangle(1.2, 3.4);
		arr[3] = new Trapezium(6.8, 9.0, 1.3);

		for (int i = 0; i < arr.length; i++) {
			arr[i].square();
		}
	}
}