package homework.page223ex2;
public class RightTriangle implements Area {

	private double a;
	private double b;

	public RightTriangle(double firstLeg, double secondLeg) {
		this.setA(firstLeg);
		this.setB(secondLeg);
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
		System.out.println("RightTriangle area: " + (a * b * 0.5));
	}
}