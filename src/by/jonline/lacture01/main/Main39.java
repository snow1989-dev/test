package by.jonline.lacture01.main;

//��������� �������� �������: F(x) = -x2 + x - 9, ���� x >= 8 � 1/(x4 - 6), ����  < 8.

public class Main39 {

	public static void main(String[] args) {
		double x = 7;
		double F = 0;

		if (x >= 8) {
			F = -Math.pow(x, 2) + x - 9;
			System.out.print("F = " + F);
		}
		if (x < 8) {
			F = 1 / (Math.pow(x, 4) - 6);
			System.out.print("F = " + F);
		}

	}

}
