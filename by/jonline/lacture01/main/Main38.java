package by.jonline.lacture01.main;

//��������� �������� �������: F(x) = x2, ���� x <= 3 � x >= 0, � 4, ���� x < 3.

public class Main38 {

	public static void main(String[] args) {
		double x = -3;
		double F = 0;

		if (x >= 0 && x <= 3) {
			F = Math.pow(x, 2);
			System.out.print("F = " + F);
		}
		if (x < 3 || x < 0) {
			F = 4;
			System.out.print("F = " + F);
		}

	}

}
