package classwork.lesson03;

//import java.util.Random;

//import static java.lang.Math.pow;

public class Test3 {

	public static void main(String[] args) {

		int[] mas = new int[5];

		for (int i = 0; i < mas.length; i++) {
			mas[i] = (int) (Math.random() * 21 - 10);
		}

		for (int i = 0; i < mas.length; i++) {
			System.out.print(mas[i] + "\t");
		}
		System.out.println();

		/*
		 * int [] mas2 = new int[(int)(Math.random()*9+1)];
		 * System.out.println(mas2.length);
		 */

		for (int i = 0; i < mas.length - 1; i++) {
			for (int j = i + 1; j < mas.length; j++) {
				if (mas[i] < mas[j]) {
					int a = mas[i];
					mas[i] = mas[j];
					mas[j] = a;
				}
			}
		}

		for (int i = 0; i < mas.length; i++) {
			System.out.print(mas[i] + "\t");
		}

		/*
		 * int [] mas = new int [5]; //[5, 4, 2, 56, 763] mas[0] = 566;
		 * System.out.println(mas[0]);
		 * 
		 * int [] mas = {3453, 4534, 523, 23423, 42, 53453, 534534, 534534, 534534};
		 * System.out.println(mas[8]);
		 * System.out.println(mas.length);
		 * 
		 * for(int i = 0; i < mas.length; i++){ 
		 * System.out.print(mas[i] + "\t");
		 * }
		 * System.out.println(); 
		 * 
		 * for(int i = 0; i < mas.length; i++){
		 * System.out.print(mas[i] + " "); 
		 * }
		 * 
		 * Random rn = new Random(100); 
		 * System.out.println(rn.nextInt());
		 * System.out.println(rn.nextInt()); 
		 * System.out.println(rn.nextInt());
		 * System.out.println(rn.nextInt());
		 * 
		 * System.out.println(Math.random()); 	//	[0:1) (max - min +1) + min[1:9]
		 * System.out.println((int)(Math.random()*9+1));	[-5: +5]
		 * 
		 * System.out.println((int)(Math.random()*11 -5));
		 * System.out.println((int)(Math.random()*11 -5));
		 * System.out.println((int)(Math.random()*11 -5));
		 * System.out.println((int)(Math.random()*11 -5));
		 * System.out.println((int)(Math.random()*11 -5));
		 * System.out.println((int)(Math.random()*11 -5));	 
		 * System.out.println(pow(5, 3)); 
		 * System.out.println(PI);
		 * 		 
		 * int i = 0; 
		 * Scanner sc = new Scanner(System.in);
		 * System.out.println("введите номер мес€ца"); 
		 * if (sc.hasNextInt()) { 
		 * i = sc.nextInt();
		 * sc.close(); 
		 * }
		 * 
		 * switch (i) {
		 * case 12: case 1: case 2: System.out.println("зима"); break; 
		 * case 3: case 4: case 5: System.out.println("весна");break; 
		 * case 6: case 7: case 8: System.out.println("лето");break; 
		 * case 9: case 10: case 11: System.out.println("осень");break; 
		 * default: System.out.println("такого мес€ца не существует"); 
		 * }
		 */

	}

}