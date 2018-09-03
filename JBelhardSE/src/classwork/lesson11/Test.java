package classwork.lesson11;

public class Test implements Comparable<Test> {
	public int a;
	public int b;

	public Test(int a) {
		this.a = a;
	}

	@Override
	public String toString() {
		return "Test [a=" + a + "]";
	}

	@Override
	public int compareTo(Test o) {
		return this.a - o.a;
	}

}