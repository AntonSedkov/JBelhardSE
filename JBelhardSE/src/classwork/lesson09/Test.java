package classwork.lesson09;
public class Test {
	public static void show(int a) throws MyException {
		try {
			try {
				System.out.println(56 / a);
			} catch (ArrayIndexOutOfBoundsException e) {
				System.out.println("д");
			}

			System.out.println("one");
			int[] mas = new int[1];
			System.out.println(mas[3]);
			
			
			
		}  catch(ArrayIndexOutOfBoundsException e){
			
				throw new MyException("hsdjkfbhsdfhsdjhfjksdhfjksdhfsdjkfhasjkdfhjkasdfhjksf");
			
			
		}
			finally{
		
			System.out.println("finally");
			System.out.println("two");
		}
		
	}

}
