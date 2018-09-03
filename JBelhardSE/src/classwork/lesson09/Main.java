package classwork.lesson09;

public class Main {

	public static void main(String[] args) {

		try {
			Test.show(1);
		} catch (MyException e) {
			System.out.println(e);
		}

		 /*catch (ArrayIndexOutOfBoundsException e) {
			System.out.println("mainmainmain");
		}*/
		
		// throwable
		// exception error
		// System.out.println(56/0);
		System.out.println("hello");
	}

}