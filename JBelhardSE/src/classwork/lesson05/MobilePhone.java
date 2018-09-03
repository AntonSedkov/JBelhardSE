package classwork.lesson05;

public class MobilePhone {

	public int cost;
	public String model;
	public int inch;

	public MobilePhone(int cost, String model, int inch) {
		this.cost = cost;
		this.model = model;
		this.inch = inch;
	}

	public MobilePhone(int cost, String model) {
		this.cost = cost;
		this.model = model;
	}

	public MobilePhone() {
	}

	public void show() {
		System.out.println(model + " " + cost);
	}

	public void show(int a) {
		System.out.println(model + " " + a * cost + " " + inch);
	}

	public void show(double d) {
		System.out.println(model + " " + cost + " " + inch);
	}

	/*
	 * public int show(double d){ System.out.println(model + " " + cost + " " + inch); 
	 * }
	 */

	public int test(int a) {
		int s = a * cost;
		return s;
	}

	public void costTen(int a, String s) {
		System.out.println(a * cost);
		System.out.println(s);
	}

	public MobilePhone test() {
		MobilePhone lenovo = new MobilePhone();
		lenovo.cost = cost;
		lenovo.model = model;
		lenovo.inch = inch;
		return lenovo;
	}

	public void test2(MobilePhone ob) {
		if (cost == ob.cost) {
			System.out.println("true");
		} else {
			System.out.println("false");
		}
	}

}