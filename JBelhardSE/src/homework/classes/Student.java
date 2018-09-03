package homework.classes;
public class Student {

	// page 78
	public int numberCourse;
	public String nameStudent;
	public int[] marks;

	// page 85
	public void show() {
		System.out.println(nameStudent + " �������� " + numberCourse + " ����.");
	}
	
	// page 87
	public void averAvRate() {
		int[] avRates = new int[3];
		int b = 0;
		for (int i = 0; i < avRates.length; i++) {
			avRates[i] = (int) (Math.random() * 8 + 3);
			b = (b + avRates[i]);
		}
		System.out.println("������� ���� ���������: " + (double) (b / avRates.length));
	}
	
	// page 89
	public void marksCreation(int n) {
		marks = new int[n];
		for (int i = 0; i < marks.length; i++) {
			marks[i] = (int) (Math.random() * 8 + 3);
		}
		System.out.print("������ " + nameStudent + ":\t");
		for (int i = 0; i < marks.length; i++) {
			System.out.print(marks[i] + "\t");
		}
		System.out.println();
	}
	public void averRate() {
		int b = 0;
		for (int i = 0; i < marks.length; i++) {
			b = b + marks[i];
		}
		System.out.println("������� ���� " + nameStudent + ": " + (double) b / marks.length);
	}
	
	// page 91					// page 101
	public Student (){
		numberCourse = 1;
		nameStudent = "�������";
	}
	
	// page 92
		public Student (int num){
		numberCourse = num;
	}
	
	// page 94
	public Student (String nameStudent, int numberCourse){
			this.numberCourse = numberCourse;
			this.nameStudent = nameStudent;
		}		
	
	// page 103
	public Student (Student ob){
		this.numberCourse = ob.numberCourse;
		this.nameStudent = ob.nameStudent;
	}		
}