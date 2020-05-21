package classwork.lesson08;

public class Test2 extends Test implements Inter, Cloneable {
	
	public int c;

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = super.hashCode();
		result = prime * result + c;
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (!super.equals(obj))
			return false;
		if (getClass() != obj.getClass())
			return false;
		Test2 other = (Test2) obj;
		if (c != other.c)
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "Test2 [c=" + c + "]" + super.toString();
	}

	@Override
	protected Object clone() throws CloneNotSupportedException {
		return super.clone();
	}
	
}