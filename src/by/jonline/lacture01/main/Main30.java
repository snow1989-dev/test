package by.jonline.lacture01.main;

/**
 * ���� �������������� ����� a, b, c. ������� ��������, ���� a>b>c, � ��������
 * �� ����������� ����������, ���� ��� �� ���
 */

public class Main30 {

	public static void main(String[] args) {

		double a;
		double b;
		double c;

		a = 7;
		b = 9;
		c = -8;

		if (a > b && b > c) {
			a *= 2;
			b *= 2;
			c *= 2;
		} else {
			a = Math.abs(a);
			b = Math.abs(b);
			c = Math.abs(c);
		}
		System.out.println("a = " + a);
		System.out.println("b = " + b);
		System.out.println("c = " + c);
	}

}
