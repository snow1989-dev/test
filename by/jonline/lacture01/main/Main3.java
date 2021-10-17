package by.jonline.lacture01.main;

import java.util.Scanner;

/** Составить программу сравнения числа а и цивры 3 Вывести на экран слово "yes", 
 * если число а меньше 3, если больше, товывести слово "no".
 */

public class Main3 {

	public static void main(String[] args) {

		Scanner var = new Scanner(System.in);

		int a;

		System.out.print("a>>");

		while (!var.hasNextInt()) {
			String str = var.nextLine();
			System.out.print("a>>");
		}
		a = var.nextInt();

		if (a < 3)
			System.out.print("yes");
		else
			System.out.print("no");

	}

}
