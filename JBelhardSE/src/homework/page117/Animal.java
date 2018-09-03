package homework.page117;
public class Animal {

	public String name;
	public int age = 2;
	public int weigth = 5;
	public int heigth = 25;

	public Animal() {
	}

	public Animal(int age, int weigth, int heigth) {
		this.age = age;
		this.weigth = weigth;
		this.heigth = heigth;
	}

	public void show() {
		System.out.println(name + ": �������: " + age + " ���, ���: " + weigth + " ��, ����: " + heigth + " ��.");
	}

	public void nameIdentity(Animal N) {
		if (N.name == name) {
			System.out.println("����� �������� ����������: " + name);
		} else {
			System.out.println("����� �������� �� ����������: " + name + " � " + N.name);
		}
	}

	public void compare(Animal N) {
		System.out.print(name);
		if (age > N.age) {
			System.out.print(" ������ �� " + (age - N.age) + " ���,");
		} else if (age < N.age) {
			System.out.print(" ������ �� " + (N.age - age) + " ���,");
		}
		if (weigth > N.weigth) {
			System.out.print(" ������� �� " + (weigth - N.weigth) + " ��,");
		} else if (weigth < N.weigth) {
			System.out.print(" ����� �� " + (N.weigth - weigth) + " ��,");
		}
		if (heigth > N.heigth) {
			System.out.print(" ���� �� " + (heigth - N.heigth) + " ��,");
		} else if (heigth < N.heigth) {
			System.out.print(" ���� �� " + (N.heigth - heigth) + " ��,");
		}
		System.out.print(" ��� " + N.name);
		System.out.println();
	}
}