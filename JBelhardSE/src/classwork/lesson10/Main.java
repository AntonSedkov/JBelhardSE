package classwork.lesson10;

public class Main {

	public static void main(String[] args) {
		/*Test <Integer, Double> t = new Test<Integer, Double>(676, 3.14);
		t.show();
		
		Test <String, Integer> t2 = new Test<String, Integer>("hello", 43);
		t2.show();*/
		
		Test <Integer> ob = new Test<Integer>(54);
		
		Test <Double> ob2 = new Test<Double>(54.0);
		ob.equal(ob2);
		
		Integer [] mas = {534,53453,543};
		Double [] mas2 = {534.3,53453.4,54.3};
		
		Test2.asd(mas);
		Test2.asd(mas2);
	}

}