package homework.classes;

public class Main {

	public static void main(String[] args) {
		// page 78
		Student ivanov = new Student();
		ivanov.nameStudent = "�����";
		ivanov.numberCourse = 4;
		System.out.println(ivanov.nameStudent + " ������ �� " + ivanov.numberCourse + " �����.");

		// page 79
		Student petrov = new Student();
		petrov.nameStudent = "������";
		petrov.numberCourse = 2;
		System.out.println(petrov.nameStudent + " ������ �� " + petrov.numberCourse + " �����.");

		// page 82
		Student petrov2 = ivanov;
		System.out.println(ivanov.nameStudent + " ������ �� " + ivanov.numberCourse + " �����.");
		System.out.println(petrov2.nameStudent + " ������ �� " + petrov2.numberCourse + " �����.");

		ivanov.numberCourse = 5;
		System.out.println(ivanov.nameStudent + " ������ �� " + ivanov.numberCourse + " �����.");
		System.out.println(petrov2.nameStudent + " ������ �� " + petrov2.numberCourse + " �����.");

		// page 85
		ivanov.show();
		petrov.show();
		petrov2.show();
		System.out.println();

		// page 87
		Student all = new Student();
		all.averAvRate();
		System.out.println();

		// page 89
		ivanov.marksCreation(8);
		ivanov.averRate();
		System.out.println();

		// page 91
		Student young = new Student();
		young.show();
		System.out.println();

		// page 92
		Student young2 = new Student(2);
		young2.show();
		System.out.println();

		// page 94
		Student young3 = new Student("��������", 3);
		young3.show();
		System.out.println();

		// page 99
		Forms example = new Forms();
		example.area(5.5);
		example.area(5);
		example.area(5.5, 6.5);
		System.out.println();

		// page 103
		Student young4 = new Student(young3);
		young4.show();
	}
}