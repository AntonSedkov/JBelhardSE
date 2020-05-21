package classwork.lesson08;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Main {

	public static void main(String[] args) {
		
		String s = "ZZx!x55";
		Pattern pt = Pattern.compile("^[A-Z]{1,3}[a-z!@#%&]{4}[0-9]{2,}$");
		Matcher mc = pt.matcher(s);
		System.out.println(mc.matches());
		
		/*Test2 t = new Test2();
		Test2 t2 = new Test2();
		t.a = 65;
		try {
			t2 = (Test2)t.clone();
		} catch (CloneNotSupportedException e) {
			e.printStackTrace();
		}
		t.a = 76;
		
		System.out.println(t);
		System.out.println(t2);
		Object ob = new Object();
		System.out.println(ob.getClass());
		System.out.println(t.getClass());
		System.out.println(ob.);
		
		t.a = 56;
		t2.a = 56;
		t.c = 56;
		t2.c = 56;
		System.out.println(t.equals(t2));
		System.out.println(t);
		
		Test2 tt = new Test2();
		Object ob = t;
		t.show();*/
	}

}