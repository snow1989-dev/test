package by.jonline.lacture01.main;

/**
 * ���� ��� ����� a, b, �. ����������. ����� �� ��� ����� d. ���� �� ���� ��
 * ����� d, �� ����� max(d-a, d-b, d-c).
 */

public class Main28 {

	public static void main(String[] args) {

		double a;
		double b;
		double c;
		double d;

		a = 7;
		b = 4;
		c = 8;
		d = 7;

		if (d == a)
			System.out.println("d == a");
		else if (d == b)
			System.out.println("d == b");
		else if (d == c)
			System.out.println("d == c");
		else {
			if (d > a && d > b && d > c)
				System.out.println("d - max");
			else if (a > d && a > b && a > c)
				System.out.println("a - max");
			else if (b > d && b > a && b > c)
				System.out.println("b - max");
			else if (c > d && c > a && c > b)
				System.out.println("c - max");
		}

	}
}
