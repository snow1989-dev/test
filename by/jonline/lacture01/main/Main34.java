package by.jonline.lacture01.main;

import java.util.Scanner;

/**
 * ��������� ���������, ���������� ������ ���������� ���������� � �������
 * ��������. ��������� ����������� ��������� �����, ����� �����, ���������
 * �����������. ���� ����� �� ���������, �� ������ �� ����� "�������!". ����
 * ����� ������� ������, ��� ����������, �� �������� "�������� �����:", ����
 * ����� ������������, �� ������� ��������� �� ���� � ��������� ������
 * ����������� �����.
 */

public class Main34 {

	public static void main(String[] args) {
		double price;
		double sum;

		Scanner sc = new Scanner(System.in);

		System.out.print("������� ��������� �����: ");

		while (!sc.hasNextDouble()) {
			String s = sc.nextLine();
			System.out.print("������� ��������� �����: ");
		}

		price = sc.nextDouble();

		System.out.print("������� ��������� ����������� �����: ");

		while (!sc.hasNextDouble()) {
			String s = sc.nextLine();
			System.out.print("������� ��������� ����������� �����: ");
		}
		sum = sc.nextDouble();

		if (price == sum)
			System.out.print("�������!");
		if (price < sum) {
			double difference = sum - price;
			System.out.print("�������� �����: " + difference);
		}
		if (price > sum) {
			double difference = price - sum;
			System.out.print("����� ������������. Dytcbnt: " + difference);
		}

	}

}
