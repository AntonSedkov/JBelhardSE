package homework.students;

public class Main {

	public static void main(String[] args) {
		// 1
		Student ivanov = new Student();
		ivanov.nameStudent = "�����";
		ivanov.numberCourse = 4;
		System.out.println(ivanov.nameStudent + " ������ �� " + ivanov.numberCourse + " �����.");

		// 2
		Student petrov = new Student();
		petrov.nameStudent = "������";
		petrov.numberCourse = 2;
		System.out.println(petrov.nameStudent + " ������ �� " + petrov.numberCourse + " �����.");

		// 3
		Student petrov2 = ivanov;
		System.out.println(ivanov.nameStudent + " ������ �� " + ivanov.numberCourse + " �����.");
		System.out.println(petrov2.nameStudent + " ������ �� " + petrov2.numberCourse + " �����.");

		ivanov.numberCourse = 5;
		System.out.println(ivanov.nameStudent + " ������ �� " + ivanov.numberCourse + " �����.");
		System.out.println(petrov2.nameStudent + " ������ �� " + petrov2.numberCourse + " �����.");

		// 4
		ivanov.show();
		petrov.show();
		petrov2.show();

		ivanov.marksCreation(5);

		ivanov.averRate();

	}
}
