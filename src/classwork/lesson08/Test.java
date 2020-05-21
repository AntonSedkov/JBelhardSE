package classwork.lesson08;

public class Test implements Inter {
	
	public int a;

	@Override
	public void show() {
		System.out.println(Inter2.DF);//sysout
	}

	@Override
	public void test() {
	}
	
	public void showww(){
	}

	@Override
	public void meth1() {
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + a;
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Test other = (Test) obj;
		if (a != other.a)
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "Test [a=" + a + "]";
	}
	
}