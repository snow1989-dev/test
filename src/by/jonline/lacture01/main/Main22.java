package by.jonline.lacture01.main;

/**
 * ���������������� �������� ���������� x � y ���, ����� � x �������� ������� ��
 * ���� ��������, � � y - �������.
 */

public class Main22 {

	public static void main(String[] args) {
		int x;
		int y;
		int z;

		x = 7;
		y = 17;

		if (x > y)
			System.out.print("x > y, x = " + x + "; y = " + y + ".");
		else {
			z = x;
			x = y;
			y = z;
			System.out.print("x > y, x = " + x + "; y = " + y + ".");
		}

	}

}
