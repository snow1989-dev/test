package by.jonline.lacture01.main;

//��������� ���������, ������� ��������� ������� ������ ������������ ������.

public class Main11 {

	public static void main(String[] args) {

		double a1;
		double a2;
		double h1;
		double h2;
		double s1;
		double s2;

		a1 = 16.0;
		a2 = 12.0;
		h1 = 4.5;
		h2 = 3.5;

		s1 = a1 / 2 * h1;
		s2 = a2 / 2 * h2;
		
		if(s1>s2)
			System.out.print("������� ������� ������������ ������");
		else
			System.out.print("������� ������ ������������ ������");

	}

}
