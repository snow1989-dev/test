package by.jonline.lacture01.main;

/**
 * ������ ������� A, B �������������� ��������� � ������� x, y, z �������.
 * ����������, ������� �� ������ ����� ���������.
 */

public class Main31 {

	public static void main(String[] args) {

		double A;
		double B;
		double x;
		double y;
		double z;

		A = 8;
		B = 10;
		x = 7;
		y = 7;
		z = 8;

		if (A <= x && B <= y || A <= y && B <= x || A <= x && B <= z || A <= z
				&& B <= x || A <= z && B <= y || A <= y && B <= z)
			System.out.println("�������");
		else
			System.out.println("�� �������");

	}

}
