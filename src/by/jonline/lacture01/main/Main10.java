package by.jonline.lacture01.main;

// ��������� ���������, ������� ��������� ������� ������ ����� ������.

public class Main10 {

	public static void main(String[] args) {

		double r1;
		double r2;
		double s1;
		double s2;

		r1 = 9.0;
		r2 = 17.6;

		s1 = Math.PI * Math.pow(r1, 2);
		s2 = Math.PI * Math.pow(r2, 2);

		if (s1 > s2)
			System.out.print("������� ������ ����� ������ ");
		else
			System.out.print("������� ������� ����� ������ ");

	}
}
