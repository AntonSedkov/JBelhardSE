package homework.page223ex2;
public class Circle implements Area {

	private double r;

	public Circle(double radius) {
		this.setR(radius);
	}

	public double getR() {
		return r;
	}
	public void setR(double a) {
		this.r = a;
	}

	@Override
	public void square() {
		System.out.println("Circle area: " + (Math.PI * r * r));
	}
}