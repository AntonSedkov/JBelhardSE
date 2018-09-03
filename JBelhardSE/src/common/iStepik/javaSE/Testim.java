package common.iStepik.javaSE;
import java.math.BigInteger;

//8	import static java.lang.System.*;

/*Где может использоваться модификатор final?
		В объявлении класса.
		В объявлении параметра метода.
		В объявлении метода.
		В объявлении нестатического поля класса.
		В объявлении локальной переменной.
		В объявлении статического поля класса.*/


public class Testim {

	public static void main(String[] args) {

		/*
		 * boolean a = true, b = false, c = true, d = false; 
		 * System.out.println(adS(a, b, c, d));
		 * 
		 * int year = 800; 
		 * System.out.println(leapYearCount(year)); 
		 * 
		 * double a = 0.1, b = 0.2, c = 0.3;
		 * System.out.println(doubleExpression(a, b, c));
		 * 
		 * int value=444, bitIndex=30;
		 * System.out.println(flipBit(value, bitIndex));
		 * 
		 * int a = 29;
		 * System.out.println(charExpression(a));
		 * 
		 * int value = 4;
		 * System.out.println(isPowerOfTwo(value));
		 * 
		 * String text = "Madam, I'm Adam!";
		 * System.out.println(isPalindrome(text));
		 * 
		 * int value = 5;
		 * System.out.println(factorial(value));
		 * 
		 */
		
		int[] a = {0, 2, 2};
		int[] b = {1, 3};
		System.out.println(mergeArrays(a, b));
		
		
	}

	
	
	
	
	/*10	Реализуйте метод, сливающий два отсортированных по неубыванию 
	массива чисел в один отсортированный в том же порядке массив. 
	Массивы могут быть любой длины, в том числе нулевой.
		Предполагается, что вы реализуете алгоритм слияния, имеющий 
	линейную сложность: он будет идти по двум исходным массивам 
	и сразу формировать отсортированный результирующий массив.
	Так, чтобы сортировка полученного массива при помощи Arrays.sort() 
	уже не требовалась. К сожалению, автоматически это не проверить, 
	так что это остается на вашей совести :)
		Воспользуйтесь предоставленным шаблоном. Декларацию класса, 
	метод main и обработку ввода-вывода добавит проверяющая система.
	Пример
	Если на вход подаются массивы {0, 2, 2} и {1, 3}, 
	то на выходе должен получиться массив {0, 1, 2, 2, 3}
		Merges two given sorted arrays into one
	@param a1 first sorted array
	@param a2 second sorted array
	@return new array containing all elements from a1 and a2, sorted
	*/
	
	public static int[] mergeArrays(int[] a1, int[] a2) {

		int[] a3 = new int[a1.length + a2.length];

		for (int i = 0; i < a1.length; i++) {
			a3[i] = a1[i];
		}
		for (int j = 0; j < a2.length; j++) {
			a3[a1.length + j] = a2[j];
		}

		for (int i = 0; i < a3.length - 1; i++) {
			for (int j = 1; j < a3.length; j++) {
				if (a3[i] > a3[j]) {
					int a = a3[j];
					a3[j] = a3[i];
					a3[i] = a;
				}
			}
		}
		for (int i = 0; i < a3.length - 1; i++) {
		System.out.println(a3[i]);
		}
	return a3;

	}
	
	
	/*9	Реализуйте метод, вычисляющий факториал заданного натурального числа.
	Факториал NN вычисляется как 1*2*...*N1*2*...*N.
	Поскольку это очень быстро растущая функция, то даже для небольших NN 
	вместимости типов int и long очень скоро не хватит. Поэтому будем 
	использовать BigInteger.
	Воспользуйтесь предоставленным шаблоном. Декларацию класса, метод main 
	и обработку ввода-вывода добавит проверяющая система.
		Calculates factorial of given <code>value</code>.
	@param value positive number
	@return factorial of <code>value</code>
	*/
	public static BigInteger factorial(int value) {
		BigInteger a = BigInteger.valueOf(1);
		for (int i = 2; i <= value; i++) {
			a = a.multiply(BigInteger.valueOf(i));
		}
		return a;
	}
		
	
	/*7	Реализуйте метод, проверяющий, является ли заданная строка палиндромом. 
	Палиндромом называется строка, которая читается одинаково слева направо 
	и справа налево (в том числе пустая). При определении "палиндромности" строки 
	должны учитываться только буквы и цифры. А пробелы, знаки препинания, а также 
	регистр символов должны игнорироваться. Гарантируется, что в метод попадают только 
	строки, состоящие из символов ASCII (цифры, латинские буквы, знаки препинания). 
	Т.е. русских, китайских и прочих экзотических символов в строке не будет.
	Воспользуйтесь предоставленным шаблоном. Декларацию класса, метод main и 
	обработку ввода-вывода добавит проверяющая система.
		Подсказки (не читайте, если хотите решить сами):
	1	для удаления из строки всех символов, не являющихся буквами и цифрами, 
	можно воспользоваться регулярным выражением "[^a-zA-Z0-9]"; найдите в классе 
	String метод, выполняющий замену по регулярному выражению;
	2	для перестановки символов строки в обратном порядке можно
	воспользоваться методом reverse(), который находится в классе StringBuilder;
	3	в классе String есть методы для преобразования всей строки 
	в верхний и нижний регистр.
	 
		Checks if given <code>text</code> is a palindrome.
	 	@param text any string
	 	@return <code>true</code> when <code>text</code> is a palindrome, <code>false</code> otherwise
	 */
	
	public static boolean isPalindrome(String text) {
		text = text.replaceAll("[^a-zA-Z0-9]", "");
		StringBuilder stb = new StringBuilder(text).reverse();
		return (stb.toString().equalsIgnoreCase(text)); 
	}
	
		
	/*6	Реализуйте метод, проверяющий, является ли заданное число по 
	абсолютной величине степенью двойки.
		Решать можно разными способами:
	воспользовавшись одним удобным статическим методом из класса java.lang.Integer;
	применив пару трюков из двоичной арифметики;
	написав решение "в лоб" с циклом и условными операторами.
		Воспользуйтесь предоставленным шаблоном. 
		Декларацию класса, метод main и обработку ввода-вывода добавит проверяющая система.
	
	Checks if given <code>value</code> is a power of two.
	@param value any number
	@return <code>true</code> when <code>value</code> is power of two, <code>false</code> otherwise
	*/
	
	public static boolean isPowerOfTwo(int value) {
	    return java.lang.Integer.bitCount(java.lang.Math.abs(value)) == 1;
	}
	
	
	
	/*5	Реализуйте метод, который возвращает букву, стоящую в таблице UNICODE 
	после символа "\" (обратный слэш) на расстоянии a.
	В качестве примера написано заведомо неправильное выражение. Исправьте его.
	*/
	
	public static char charExpression(int a) {
		char ch = '\\';
	    return (char) (ch + a);
	}
	
		
	/*4	Реализуйте метод flipBit, изменяющий значение одного бита заданного целого числа
	на противоположное. Данная задача актуальна, например, при работе с битовыми полями.
	Договоримся, что биты нумеруются от младшего (индекс 1) к старшему (индекс 32).
	Воспользуйтесь предоставленным шаблоном. Декларацию класса, метод main и 
	обработку ввода-вывода добавит проверяющая система.
	 
	 	Flips one bit of the given <code>value</code>.
	 	@param value     any number
	 	@param bitIndex  index of the bit to flip, 1 <= bitIndex <= 32
	 	@return new value with one bit flipped
	 */
		
	public static int flipBit(int value, int bitIndex) {
		int a = 1<<(bitIndex-1);
		int b = value^a;
		return b;
	}
	
		
	
	/*3	Реализуйте метод, возвращающий ответ на вопрос: правда ли, что a + b = c?
	Допустимая погрешность – 0.0001 (1E-4) 
	Можно использовать класс Math и его методы. 
	Класс Math доступен всегда, импортировать его не надо.
	 */

	public static boolean doubleExpression(double a, double b, double c) {
		boolean g = Math.abs((a + b) - c) < 1E-4;
		return g;
	}

	/*
	 * Еще решения, которые не прошли тестером 
	 * 
	public static boolean doubleExpression(double a, double b, double c) {
		int e = (int) (a+b)*1000; int g = (int) c*1000;
		return e==g; 
	}
	 * 
	public static boolean doubleExpression(double a, double b, double c) {
		BigDecimal e = new BigDecimal(a+b, new MathContext(5)); BigDecimal g =
	 	new BigDecimal(c, new MathContext(5)); return e.equals(g); }
	 */

		
		/*1	Реализуйте метод, возвращающий true, если среди четырех его аргументов 
	ровно два истинны (любые). Во всех остальных случаях метод должен возвращать false.*/
	
	public static boolean adS(boolean a, boolean b, boolean c, boolean d) {
		if (a) {
			if (b) {
				if (c) {
					return false;
				} else if (d) {
					return false;
				}
				return true;

			} else if (c) {
				if (d) {
					return false;
				}
				return true;
			} else if (d) {
				return true;
			}
		} else if (b) {
			if (c) {
				if (d) {
					return false;
				}
				return true;
			} else if (d) {
				return true;
			}
		} else if (c) {
			if (d) {
				return true;
			}
		}
		return false;
	}

	
	/*2	В Григорианском календаре год является високосным в двух случаях: 
			либо он кратен 4, но при этом не кратен 100, либо кратен 400.
		Реализуйте метод, вычисляющий количество високосных лет с начала нашей эры 
	(первого года) 	до заданного года включительно. На самом деле Григорианский календарь 
	был введен 	значительно позже, но здесь для упрощения мы распространяем его 
	действие на всю нашу эру.*/
	
	public static int leapYearCount(int year) {
		int count = year / 4 - year / 100 + year / 400;
		return count;
	}
	
	
}