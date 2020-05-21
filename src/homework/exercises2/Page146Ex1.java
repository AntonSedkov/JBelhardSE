package homework.exercises2;
import java.util.Scanner;

public class Page146Ex1 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("������� ���������� �����:");
		@SuppressWarnings("unused")
		int n = 0;
		if (sc.hasNextInt()) {
			n = sc.nextInt();
		}

		String[] str = new String[3];

		for (int i = 0; i < str.length; i++) {
			str[i] = sc.next();

		}
		for (int i = 0; i < str.length; i++) {
			System.out.println(str[i]);
		}
		sc.close();
		
		/*		
	for(int i = 0; i<str.length-1;i++){
		for(int j=i+1;j<str.length;j++){
			if(str[i].length()<str[j].length()){
				String b=str[i];
				str[i]=str[j];
				str[j] = b;				
				}
			}
		}
	for(int i = 0; i<str.length;i++){
			System.out.println(str[i]);
		}
	for(int i = 0; i<str.length-1;i++){
		for(int j=i+1;j<str.length;j++){
			if(str[i].equals(str[j])){
				System.out.println("������ " +i + " ����� ������ " + j);
				} 
			}		
		}
	System.out.println(str[0].substring(str[0].length()-3));
	System.out.println(str[1].toUpperCase());
			
	String [] str2 = str[0].split(" ");	
	for(int i = 0; i<str2.length;i++){
	System.out.println(str2[i]);
	}
	
	System.out.println("������ ������ ������ �����? " + Character.isDigit(str[str.length-1].charAt(2)));
*/
	}
}