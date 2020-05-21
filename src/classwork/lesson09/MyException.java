package classwork.lesson09;

public class MyException extends Exception {

	private static final long serialVersionUID = 1L;
	public String s;

	public MyException(String s) {
		this.s = s;
	}

	@Override
	public String toString() {
		return "MyException [s=" + s + "]";
	}

}