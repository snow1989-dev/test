package by.jonline.lacture01.main;

// ��������� ��������� ���������� ����������� �� ��������� ���� ����� a � b.

public class Main8 {

	public static void main(String[] args) {

		double a;
		double b;
		double a2;
		double b2;

		a = 22.0;
		b = 32.8;

		a2 = Math.pow(a, 2);
		b2 = Math.pow(b, 2);

		if (a2 < b2)
			System.out.print("������� � ����������");
		else
			System.out.print("������� b ����������");

	}
}
