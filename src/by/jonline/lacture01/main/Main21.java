package by.jonline.lacture01.main;

import java.util.Scanner;

public class Main21 {

	public static void main(String[] args) {

		char a = '�';
		char b = '�';
		char d;
		String c;

		Scanner var = new Scanner(System.in);

		System.out.println("��� ��: ������� ��� �������? ����� � ��� � >>");
		
		while (!var.hasNext("[��]")){
			var.nextLine();
			System.out.println("��� ��: ������� ��� �������? ����� � ��� � >>");
		}
		c = var.next();
		d = c.charAt(0);
		if (d == a)
			System.out.println("��� �������� �������� ,)");
		else if (d == b)
			System.out.println("��� �������� ������� ,)");
	}

}
