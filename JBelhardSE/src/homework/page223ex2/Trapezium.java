package homework.page223ex2;
public class Trapezium implements Area {
	private double a;
	private double b;
	private double h;

	public Trapezium (double firstSide, double secondSide, double altitude) {
		this.setA(firstSide);
		this.setB(secondSide);
		this.setH(altitude);
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
	public double getH() {
		return h;
	}
	public void setH(double h) {
		this.h = h;
	}

	@Override
	public void square() {
		System.out.println("Trapezium area: " + ((a + b) * h * 0.5));
	}
}