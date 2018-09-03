package classwork.lesson11;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.ListIterator;
import java.util.TreeSet;

public class Main {

	public static void main(String[] args) {

		HashSet<Object> hs = new HashSet<Object>();
		hs.add(4234234);
		hs.add(4234234);
		hs.add(4234234);
		hs.add("fgdfgd");
		hs.add("fgdfg");
		hs.add(2342);
		System.out.println(hs);

		TreeSet<Object> ts = new TreeSet<Object>();
		ts.add(23423);
		ts.add(5645);
		ts.add(634634786);
		ts.add(6346346);
		ts.add(63346);
		ts.add(63446);
		// ts.add(3.144);
		System.out.println(ts);

		ArrayList<String> al4 = new ArrayList<String>();
		// al4.add(345345);
		al4.add("dfsdf");
		al4.add("dfsddff");
		al4.add("dfsxcvxdf");
		al4.add("dfsd5344f");

		TreeSet<Test> ts2 = new TreeSet<Test>();
		ts2.add(new Test(5));
		ts2.add(new Test(55));
		ts2.add(new Test(53453));
		ts2.add(new Test(5423));
		ts2.add(new Test(5234));
		ts2.add(new Test(532));
		System.out.println(ts2);

		Iterator<String> itr = al4.iterator();
		while (itr.hasNext()) {
			System.out.println(itr.next());
		}

		ListIterator<String> litr = al4.listIterator(al4.size());
		while (litr.hasPrevious()) {
			System.out.println(litr.previous());
		}

		/*
		 * ArrayList al = new ArrayList(); 
		 * al.add(56456); 
		 * al.add("hello");
		 * al.add(3.14); 
		 * al.add(56456); 
		 * al.add("hello"); 
		 * al.add(3.14);
		 * al.remove(4); 
		 * al.remove("hello"); 
		 * al.remove(new Integer(56456));
		 * System.out.println(al);
		 * 
		 * ArrayList al2 = new ArrayList(); 
		 * al2.addAll(al);
		 * al2.removeAll(al); 
		 * System.out.println(al2.get(1)); 
		 * al2.clear();
		 * System.out.println(al2.size()); 
		 * System.out.println(al2.);
		 * System.out.println(al2);
		 * 
		 * ArrayList al3 = new ArrayList(); 
		 * al3.add(al); 
		 * al3.add(0, al2);
		 * al3.add(0, 5645645);
		 * System.out.println(al3);
		 * 
		 * LinkedList ll = new LinkedList(); 
		 * ll.addAll(al); 
		 * ll.addFirst(45345);
		 * System.out.println(ll.); 
		 * System.out.println("LinkedList "+ll);
		 */
	}

}