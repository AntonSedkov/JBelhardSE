package classwork.lesson12;
public class Kitty extends Cat {
	private int timeEat;

	public Kitty() {
	}

	public Kitty(String name, int age, int weigth, int mice, int timeEat) {
		super(name, age, weigth, mice);
		this.setTimeEat(timeEat);
	}

	public Kitty(Cat c) {
		super(c);
	}

	public static Kitty create() {
		Kitty s = new Kitty();
		return s;
	}

	public void show() {
		super.show();
		System.out.println(name + " ����� ��������� " + timeEat);
	}

	public int getTimeEat() {
		return timeEat;
	}

	public void setTimeEat(int timeEat) {
		this.timeEat = timeEat;
	}
}