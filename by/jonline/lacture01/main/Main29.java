package by.jonline.lacture01.main;

/**
 * ���� ��� ����� �(�1, �1), �(�2, �2), �(�3. �3). ���������� ����� �� ���
 * ����������� �� ����� ������.
 */

public class Main29 {

	public static void main(String[] args) {
		double x1;
		double x2;
		double x3;
		double y1;
		double y2;
		double y3;

		x1 = 5;
		x2 = 7;
		x3 = 9;
		y1 = 4;
		y2 = 6;
		y3 = 8;

		if (((x3 - x1) / (x2 - x1) - (y3 - y1) / (y2 - y1)) == 0)
			System.out.println("����� ����������� �� ����� ������");
		else
			System.out.println("����� �� ����������� �� ����� ������");
	}
}
