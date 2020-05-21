package classwork.lesson12;
public class Animal {

	public int weigth;
	public int age;
	public String name;

	public Animal() {
	}

	public Animal(String name, int age, int weigth) {
		this.setName(name);
		this.setAge(age);
		this.setWeigth(weigth);
	}

	public Animal(Animal a) {
		this.name = a.name;
		this.age = a.age;
		this.weigth = a.weigth;
	}

	/*
	 * public abstract void golos (){ System.out.println("Say") }
	 */

	public void show() {
		System.out.println(name + " \ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd " + age + " \ufffd \ufffd\ufffd\ufffd\ufffd\ufffd " + weigth);
	}

	public static Animal create() {
		Animal s = new Animal();
		return s;
	}

	public int getWeigth() {
		return weigth;
	}

	public void setWeigth(int weigth) {
		this.weigth = weigth;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
}