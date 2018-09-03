package classwork.lesson10;

public class Test<T extends Number> {
	public T ob;
	//public V ob2;
	
	public Test(T ob){
		this.ob = ob;
		//this.ob2 = ob2;
	}

	public void show() {
		System.out.print(ob.getClass().getSimpleName()+ " ");
		//System.out.println(ob2.getClass().getSimpleName());
	}

	public void equal(Test<?> obb) {

		if (ob.doubleValue() == obb.ob.doubleValue()) {
			System.out.println("true");
		} else {
			System.out.println("false");
		}
	}
	
}