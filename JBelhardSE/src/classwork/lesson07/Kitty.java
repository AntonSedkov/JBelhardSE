package classwork.lesson07;

public class Kitty extends Cats {
	private int age;

	public Kitty(String name, int countMouse, int age) {
		super(name, countMouse);
		this.age = age;
	}

	public void show(){
		super.show();
		System.out.println(" " + age);
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

}