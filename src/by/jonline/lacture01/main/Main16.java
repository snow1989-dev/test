package by.jonline.lacture01.main;

/** �� �������� XOY ������ ����� ������������ ����� �. ������, ��� ��� ����������� 
 (�� ����� ��� ��� � ����� ������������ ����). 
 */

import java.util.Scanner;

public class Main16 {

	public static void main(String[] args) {
		double x;
		double y;
		String str;

		Scanner var = new Scanner(System.in);

		System.out
				.println("������� x ������� ����� ����� �� ������� \",\" >> ");

		while (var.hasNextDouble() == false) {
			str = var.nextLine();
			System.out
					.println("������� x ������� ����� ����� �� ������� \",\" >> ");
		}
		x = var.nextDouble();

		System.out
				.println("������� y ������� ����� ����� �� ������� \",\" >> ");

		while (var.hasNextDouble() == false) {
			str = var.nextLine();
			System.out
					.println("������� y ������� ����� ����� �� ������� \",\" >> ");
		}
		y = var.nextDouble();

		if (x == 0 && y == 0)
			System.out.println("����� �������� � ������ ��������");
		else if ((x == 0) && (y > 0 || y < 0))
			System.out.println("����� �������� �� ��� �");
		else if ((y == 0) && (x > 0 || x < 0))
			System.out.println("����� �������� �� ��� Y");
		else if (x > 0 && y > 0)
			System.out.println("����� �������� � ������ ����������� ����");
		else if (x < 0 && y > 0)
			System.out.println("����� �������� �� ������ ����������� ����");
		else if (x < 0 && y < 0)
			System.out.println("����� �������� � �������� ����������� ����");
		else
			System.out.println("����� �������� � ��������� ����������� ����");

	}

}
