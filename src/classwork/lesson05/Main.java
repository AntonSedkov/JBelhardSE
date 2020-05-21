package classwork.lesson05;

public class Main {

	public static void main(String[] args) {

		/*MobilePhone samsung = new MobilePhone();
		samsung.cost = 100;
		samsung.inch = 5;
		samsung.model = "s7";
		System.out.println(samsung.cost + " " + samsung.inch + " " + samsung.model);

		MobilePhone iPhone = new MobilePhone();
		iPhone.cost = 200;
		iPhone.inch = 6;
		iPhone.model = "6s";
		System.out.println(iPhone.cost + " " + iPhone.inch + " " + iPhone.model);
		
		samsung.show();
		iPhone.show(545645);
		
		samsung.costTen(50, "samsungPhone");
		iPhone.costTen(25, "iPhonePhone");
		
		int s = samsung.test(15);
		s = s + 101;
		System.out.println(s);
		*/
		
		MobilePhone nokia = new MobilePhone(11111, "11111", 11111);
		nokia.show(3.14);
		 
		MobilePhone lg = new MobilePhone(22222, "22222");
		lg.show(3.14);
		 
		MobilePhone sdsdf = lg.test();
		 
		lg.cost = 432423423;
		sdsdf.show(3.14);
		lg.test2(sdsdf);

		/*
		* MobilePhone lg = samsung; 
		* System.out.println(lg.model);
		* System.out.println(samsung.cost + " " + samsung.inch + " " + samsung.model); 
		* lg.model = "sdfgdfgdfgd";
		* System.out.println(samsung.model);
		* 
		* samsung = null; 
		* lg = null;
		* samsung = new MobilePhone(); 
		* System.out.println(samsung.model);
		*/

	}

}