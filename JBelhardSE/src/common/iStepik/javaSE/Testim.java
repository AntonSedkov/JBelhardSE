package common.iStepik.javaSE;
import java.math.BigInteger;

//8	import static java.lang.System.*;

/*��� ����� �������������� ����������� final?
		� ���������� ������.
		� ���������� ��������� ������.
		� ���������� ������.
		� ���������� �������������� ���� ������.
		� ���������� ��������� ����������.
		� ���������� ������������ ���� ������.*/


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

	
	
	
	
	/*10	���������� �����, ��������� ��� ��������������� �� ���������� 
	������� ����� � ���� ��������������� � ��� �� ������� ������. 
	������� ����� ���� ����� �����, � ��� ����� �������.
		��������������, ��� �� ���������� �������� �������, ������� 
	�������� ���������: �� ����� ���� �� ���� �������� �������� 
	� ����� ����������� ��������������� �������������� ������.
	���, ����� ���������� ����������� ������� ��� ������ Arrays.sort() 
	��� �� �����������. � ���������, ������������� ��� �� ���������, 
	��� ��� ��� �������� �� ����� ������� :)
		�������������� ��������������� ��������. ���������� ������, 
	����� main � ��������� �����-������ ������� ����������� �������.
	������
	���� �� ���� �������� ������� {0, 2, 2} � {1, 3}, 
	�� �� ������ ������ ���������� ������ {0, 1, 2, 2, 3}
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
	
	
	/*9	���������� �����, ����������� ��������� ��������� ������������ �����.
	��������� NN ����������� ��� 1*2*...*N1*2*...*N.
	��������� ��� ����� ������ �������� �������, �� ���� ��� ��������� NN 
	����������� ����� int � long ����� ����� �� ������. ������� ����� 
	������������ BigInteger.
	�������������� ��������������� ��������. ���������� ������, ����� main 
	� ��������� �����-������ ������� ����������� �������.
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
		
	
	/*7	���������� �����, �����������, �������� �� �������� ������ �����������. 
	����������� ���������� ������, ������� �������� ��������� ����� ������� 
	� ������ ������ (� ��� ����� ������). ��� ����������� "��������������" ������ 
	������ ����������� ������ ����� � �����. � �������, ����� ����������, � ����� 
	������� �������� ������ ��������������. �������������, ��� � ����� �������� ������ 
	������, ��������� �� �������� ASCII (�����, ��������� �����, ����� ����������). 
	�.�. �������, ��������� � ������ ������������ �������� � ������ �� �����.
	�������������� ��������������� ��������. ���������� ������, ����� main � 
	��������� �����-������ ������� ����������� �������.
		��������� (�� �������, ���� ������ ������ ����):
	1	��� �������� �� ������ ���� ��������, �� ���������� ������� � �������, 
	����� ��������������� ���������� ���������� "[^a-zA-Z0-9]"; ������� � ������ 
	String �����, ����������� ������ �� ����������� ���������;
	2	��� ������������ �������� ������ � �������� ������� �����
	��������������� ������� reverse(), ������� ��������� � ������ StringBuilder;
	3	� ������ String ���� ������ ��� �������������� ���� ������ 
	� ������� � ������ �������.
	 
		Checks if given <code>text</code> is a palindrome.
	 	@param text any string
	 	@return <code>true</code> when <code>text</code> is a palindrome, <code>false</code> otherwise
	 */
	
	public static boolean isPalindrome(String text) {
		text = text.replaceAll("[^a-zA-Z0-9]", "");
		StringBuilder stb = new StringBuilder(text).reverse();
		return (stb.toString().equalsIgnoreCase(text)); 
	}
	
		
	/*6	���������� �����, �����������, �������� �� �������� ����� �� 
	���������� �������� �������� ������.
		������ ����� ������� ���������:
	���������������� ����� ������� ����������� ������� �� ������ java.lang.Integer;
	�������� ���� ������ �� �������� ����������;
	������� ������� "� ���" � ������ � ��������� �����������.
		�������������� ��������������� ��������. 
		���������� ������, ����� main � ��������� �����-������ ������� ����������� �������.
	
	Checks if given <code>value</code> is a power of two.
	@param value any number
	@return <code>true</code> when <code>value</code> is power of two, <code>false</code> otherwise
	*/
	
	public static boolean isPowerOfTwo(int value) {
	    return java.lang.Integer.bitCount(java.lang.Math.abs(value)) == 1;
	}
	
	
	
	/*5	���������� �����, ������� ���������� �����, ������� � ������� UNICODE 
	����� ������� "\" (�������� ����) �� ���������� a.
	� �������� ������� �������� �������� ������������ ���������. ��������� ���.
	*/
	
	public static char charExpression(int a) {
		char ch = '\\';
	    return (char) (ch + a);
	}
	
		
	/*4	���������� ����� flipBit, ���������� �������� ������ ���� ��������� ������ �����
	�� ���������������. ������ ������ ���������, ��������, ��� ������ � �������� ������.
	�����������, ��� ���� ���������� �� �������� (������ 1) � �������� (������ 32).
	�������������� ��������������� ��������. ���������� ������, ����� main � 
	��������� �����-������ ������� ����������� �������.
	 
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
	
		
	
	/*3	���������� �����, ������������ ����� �� ������: ������ ��, ��� a + b = c?
	���������� ����������� � 0.0001 (1E-4) 
	����� ������������ ����� Math � ��� ������. 
	����� Math �������� ������, ������������� ��� �� ����.
	 */

	public static boolean doubleExpression(double a, double b, double c) {
		boolean g = Math.abs((a + b) - c) < 1E-4;
		return g;
	}

	/*
	 * ��� �������, ������� �� ������ �������� 
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

		
		/*1	���������� �����, ������������ true, ���� ����� ������� ��� ���������� 
	����� ��� ������� (�����). �� ���� ��������� ������� ����� ������ ���������� false.*/
	
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

	
	/*2	� ������������� ��������� ��� �������� ���������� � ���� �������: 
			���� �� ������ 4, �� ��� ���� �� ������ 100, ���� ������ 400.
		���������� �����, ����������� ���������� ���������� ��� � ������ ����� ��� 
	(������� ����) 	�� ��������� ���� ������������. �� ����� ���� ������������� ��������� 
	��� ������ 	����������� �����, �� ����� ��� ��������� �� �������������� ��� 
	�������� �� ��� ���� ���.*/
	
	public static int leapYearCount(int year) {
		int count = year / 4 - year / 100 + year / 400;
		return count;
	}
	
	
}