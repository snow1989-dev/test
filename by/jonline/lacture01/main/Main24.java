package by.jonline.lacture01.main;

import java.util.Scanner;

/**
 * �������� ���������, ������������ ��������� ������� �� ������� -
 * "���� - �� �����", ���� �� �������� ������ ��������� ��������� n
 */

public class Main24 {

	public static void main(String[] args) {
		int n;

		Scanner c = new Scanner(System.in);

		System.out.print("������� ���������� ��������� >>");

		while (!c.hasNextInt()) {
			String s = c.nextLine();
			System.out.print("������� ���������� ��������� >>");
		}
		n = c.nextInt();

		if (n % 2 == 0)
			System.out.print("�����!!!");
		else
			System.out.print("�� �����!!!");

	}

}
