package homework.page223ex2;
public class Rectangle implements Area {

	private double a;
	private double b;

	public Rectangle(double firstSide, double secondSide) {
		this.setA(firstSide);
		this.setB(secondSide);
	}
	
	public double getB() {
		return b;
	}
	public void setB(double b) {
		this.b = b;
	}
	public double getA() {
		return a;
	}
	public void setA(double a) {
		this.a = a;
	}

	@Override
	public void square() {
		System.out.println("Rectangle area: " + (a * b));
	}
}