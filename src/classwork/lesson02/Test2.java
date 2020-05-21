package classwork.lesson02;

import java.util.Scanner;

public class Test2 {

	public static void main(String[] args) {
		
		int a = 0;
		Scanner sc = new Scanner(System.in);
		System.out.println("введите число ");
		if(sc.hasNextInt()){
			a = sc.nextInt();
			sc.close();
		}
		System.out.println("Ваше число = " + a);
		
		/*switch("fsdfsdfsd"){
		default: System.out.println("default");
		case "1": System.out.println("1"); 
		gsdgsd;
		sgdgs;
		gsdgsdg;
		case "sdfsdfsdfs": System.out.println("2");break;
		case "dfsdfsdfs": System.out.println("3");break;
		case "56": System.out.println("4");break;
		//default: System.out.println("default");
		}
		System.out.println("hello");
		
		int b = 2;
		for( ; ; ){//инициализация, условие, итерация
			if(b == 10){
				break;
			}
			b = 0;
			int c = 0;
			System.out.println("hello");
			b++;
		}
		System.out.println(a);
		
		int a = 0;
		do{
			System.out.println("hello");
			a++;
		}while(a < 1);
		
		int a = 0;
		boolean b = true;
		while (b) {
			a++;
			if (a == 5) {
				continue;
			}if(a==10){
				break;
			}
			System.out.println("hello");
		}
		
		int a = 19; if ((a > 10 || a > 20) && a != 0) {
			System.out.println(a - 5); 
		} else { 
			System.out.println(a + 5); 
		}
			System.out.println("hello");
		 */

	}

}