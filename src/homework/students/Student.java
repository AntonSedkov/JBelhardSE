package homework.students;

public class Student {

	public int numberCourse;
	public String nameStudent;
	public int[] marks;

	public void show() {
		System.out.println(nameStudent + " �������� " + numberCourse + " ����.");
	}

	public void marksCreation(int n) {
		marks = new int[n];
		for (int i = 0; i < marks.length; i++) {
			marks[i] = (int) (Math.random() * 8 + 3);
		}

	}

	public void averRate() {
		int b = 0;
		for (int i = 0; i < marks.length; i++) {
			b = b + marks[i];
		}
		System.out.println(b / marks.length);
	}

}
