package homework.classes;
public class Forms {

	public void area(double side) {
		System.out.println("������� ��������: " + side * side);
	}
	public void area(int radius) {
		System.out.println("������� �����: " + (Math.PI * radius * radius));
	}
	public void area(double side, double side2) {
		System.out.println("������� ��������������: " + side * side2);
	}
}