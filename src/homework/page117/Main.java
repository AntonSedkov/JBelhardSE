package homework.page117;

public class Main {

	public static void main(String[] args) {

		System.out.println("������ ��� �������� � 1 ���.117");
		Animal example = new Animal();
		Animal dog = new Animal(4, 25, 40);
		dog.name = "�����";
		Animal parrot = new Animal(1, 3, 10);
		parrot.name = "����";
		Animal cat = new Animal(2, 1, 15);
		cat.name = "����";
		example.show();
		dog.show();
		cat.nameIdentity(dog);
		parrot.nameIdentity(cat);
		cat.compare(example);
		dog.compare(parrot);

		
		System.out.println("������ �� �������� � 3 ���.117");
		Matrix mas = new Matrix(3);
		Matrix mas2 = new Matrix(3, 5);
		mas.show();
		mas2.show();
		mas.sum(mas2);
		mas.vich(mas2);
		mas.multi(mas2);
		Matrix mas3 = new Matrix(3);
		mas3.show();
		mas.sum(mas3);
		mas.vich(mas3);
		mas.multi(mas3);
		Matrix mas4 = new Matrix(3, 5);
		mas4.show();
		mas2.sum(mas4);
		mas2.vich(mas4);
		mas2.multi(mas4);
		Matrix mas5 = new Matrix(5, 2);
		mas5.show();
		mas2.sum(mas5);
		mas2.vich(mas5);
		mas2.multi(mas5);
	}
}