package by.jonline.lacture01.main;

import java.util.Scanner;

/**
 * ���������� ������������ ����, ��������� � ���������� (����� - �� 1 �� 31,
 * ����� - �� 1 �� 12). ���� ������� ������������ ������, �� �������� �� ����.
 */

public class Main23 {

	public static void main(String[] args) {
		int day;
		int month;

		Scanner c = new Scanner(System.in);

		System.out.print("������� ����� �� 1 �� 31 >>" + "");
		while (!c.hasNextInt()) {
			String s = c.nextLine();
			System.out.print("������� ����� �� 1 �� 31 >>");
		}
		day = c.nextInt();

		if ((day >= 1) && (day <= 31))
			System.out.println("day = " + day);
		else
			System.out.println("�� ����� �� ������ ����");

		System.out.print("������� ����� �� 1 �� 12 >>");
		while (!c.hasNextInt()) {
			String s = c.nextLine();
			System.out.print("������� ����� �� 1 �� 12 >>");
		}
		month = c.nextInt();

		if ((month >= 1) && (month <= 12))
			System.out.println("month = " + month);
		else
			System.out.println("�� ����� �� ������ �����");

	}

}
