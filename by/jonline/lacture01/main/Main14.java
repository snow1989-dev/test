package by.jonline.lacture01.main;

/**
 * ���� ��� ���� ������������ (� ��������. ���������� ��������� �� �����
 * �����������, � ���� ��, �� ����� �� �� �������������.
 */
public class Main14 {
	public static void main(String[] args) {
		double a;
		double b;
		double c;

		a = 90;
		b = 45;

		if ((a + b) < 180) {
			System.out.print("����������� ���������");
			c = 180 - (a + b);
			if (a == 90 || b == 90 || c == 90)
				System.out.println(" � �� �������������");
			else
				System.out.println(" � �� �� �������������");
		} else
			System.out.println("����������� �� ���������");

	}
}
