package by.jonline.lacture01.main;

//��������� �������� �������: F(x) = -x3 + 9, ���� x <= 13 � -(3/(x +1)), ����  x > 13.

public class Main40 {

	public static void main(String[] args) {
		double x = 7;
		double F = 0;

		if (x <= 13) {
			F = -Math.pow(x, 3) + 9;
			System.out.print("F = " + F);
		}
		if (x > 13) {
			F = -(3 / x + 1);
			System.out.print("F = " + F);
		}

	}

}
