package by.jonline.lacture01.main;

// ����������, ��������� ����� ����� a, b, c �������� ����� k.

public class Main20 {

	public static void main(String[] args) {

		int a;
		int b;
		int c;
		int k;

		a = 9;
		b = 11;
		c = 7;
		k = 3;

		if (a % k == 0)
			System.out.println("k �������� ��������� ����� �");
		if (b % k == 0)
			System.out.println("k �������� ��������� ����� b");
		if (c % k == 0)
			System.out.println("k �������� ��������� ����� �");
		if ((a % k != 0) && (b % k != 0) && (c % k != 0))
			System.out.println("k �� �������� ��������� ����� �, b, c");

	}
}
