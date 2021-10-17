package by.jonline.lacture01.main;

import java.util.Scanner;

/**
 * ������� ���������, ������� �� ������ ����� ���������� ������ �������
 * ���������� � ��������� ���������� � ���� ������. ������ � ���� ����� ������ 6
 * �������, �������� �� 3 ������ �� ������� �������. ��� ����� ��������� ������:
 * 9583, 1747 - �������� ������ ��� A, B, C; 3331, 7922 - ������� ������ ��� -
 * B, C: 9455, 8997 - �������� ������ ���� C.
 */

public class Main33 {

	public static void main(String[] args) {
		int password;

		Scanner sc = new Scanner(System.in);

		System.out.println("������� ������: ");

		while (!sc.hasNextInt()) {
			String s = sc.nextLine();
			System.out.println("������� ������: ");

		}

		password = sc.nextInt();

		if (password == 9583 || password == 1747)
			System.out.println("��� �������� ������ ��� ������: A, B, C");
		else if (password == 3331 || password == 7922)
			System.out.println("��� �������� ������ ��� ������: B, C");
		else if (password == 9455 || password == 8997)
			System.out.println("��� �������� �����m ���s ������: C");
		else
			System.out.println("���� ������ �� ������ ������");

	}

}
