package by.jonline.lacture01.main;

/**
 * ���� ��� ����� �(�1, �1) � � (�2, �2). ��������� ������� ������������,
 * ������� �� ����� ��������� ����� � ������ ���������.
 */
public class Main13 {
	public static void main(String[] args) {
		double x1; // ����� �.
		double x2; // ����� �.
		double y1; // ����� �.
		double y2; // ����� �.
		double distance1;
		double distance2;

		x1 = 1.0;
		x2 = 2.0;
		y1 = 1.0;
		y2 = 2.0;

		distance1 = Math.sqrt(Math.pow(x1, 2) + Math.pow(y1, 2));
		distance2 = Math.sqrt(Math.pow(x2, 2) + Math.pow(y2, 2));
		if (distance1 < distance2)
			System.out.print("����� � �����");
		else
			System.out.print("����� � �����");

	}

}
