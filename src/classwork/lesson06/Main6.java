package classwork.lesson06;

import java.math.BigDecimal;
import java.math.BigInteger;


public class Main6 {
	
	/*public static int c;
	
	static{
		c = 453 + 56;
		System.out.println("static");
	}*/

	public static void main(String[] args) {
		
		Integer in = new Integer(45);
		
		String s = "342";
		int i = Integer.parseInt(s);
		System.out.println(i);
		System.out.println(in);
		
		Character ch = new Character('g');
		System.out.println(Character.isUpperCase(ch));
		System.out.println(Character.toUpperCase(ch));
		System.out.println(Character.isWhitespace(ch));
	
		Boolean bo = new Boolean(true);
		System.out.println(bo);
		
		BigInteger bg = new BigInteger("4526347");
		BigInteger bg2 = new BigInteger("4526347856237846578234657346578236457863478563478563"
				+ "47856783465734567326572346578364578632784563");
		System.out.println(bg.add(bg2));
		System.out.println(bg.multiply(bg2));
		System.out.println(bg.divide(bg2));
		System.out.println(bg.intValue());
		
		BigDecimal bd = new BigDecimal(new BigInteger("345345245623523453452345345234"
				+ "534523452345234"), 2);
		BigDecimal bd2 = new BigDecimal(new BigInteger("345345245623523453452345345234"
				+ "534523452345234"), 2);
		System.out.println(bd.multiply(bd2));
		
		String str = new String("sdfsdfsd");
		String str2 = new String("sdfsdFsd");
		
		System.out.println(str.substring(4, 7));
		System.out.println(str.replace("df", "!"));
		System.out.println(str.replaceAll("df", "!"));
		System.out.println(str.equals(str2));
		System.out.println(str.toCharArray());
		
		StringBuffer sb = new StringBuffer();
		sb.append("sdfsdfsdf").append("gsdfgdfgd");
		
		StringBuilder sbd = new StringBuilder();
		sbd.append("sdfsdfsdf").append("gsdfgdfgd");
		sbd.append(4534);
		sbd.append("\n");
		sbd.append("hello");
		
		System.out.println(sbd);
		//System.out.println("sdfsdf"+ "rgsdgsdfgs"+ "gfsdgsd"+"sdfssdfs");
		
		/*
		Test [] mas = Test.createMas(4);
		Test.show(mas);
		Test.max(mas);
		
		Test ob = new Test();
		//СОЗДАЁТСЯ ПЕРЕМЕННАЯ
		//выделяем память под объект
		//запускается конструктор
		//инициализация полей класса нулями
		//присваивание ссылки на объект
		
		Test.show();
		Test ob = new Test();
		
		Test ob2 = new Test();
		
		ob.a = 56;
		System.out.println(ob.a + " " + ob2.a);
		
		ob.b = 56;
		System.out.println(ob.b + " " + ob2.b);
		*/
		
	}

}