package by.jonline.lacture01.main;

/** �������� ��������� ��������� ���� ����� 1 � 2. ���� 1 ������ 2 - ������� 
�� ����� 7, � ��������� ������ - ����� 8.
*/
import java.util.Scanner;

public class Main1 {

	public static void main(String[] args) {

		Scanner var = new Scanner(System.in);

		int x1;
		int x2;

		System.out.print("x1 >>");

		while (!var.hasNextInt()) {
			String str = var.nextLine();
			System.out.println("x1 >>");
		}

		x1 = var.nextInt();

		System.out.print("x2 >>");

		while (!var.hasNextInt()) {
			String str = var.nextLine();
			System.out.println("x2 >>");
		}

		x2 = var.nextInt();
		if (x1 < x2)
			System.out.println("7");
		else 
			System.out.println("8");
		
	}

}
