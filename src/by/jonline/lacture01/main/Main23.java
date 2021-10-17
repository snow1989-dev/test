package by.jonline.lacture01.main;

import java.util.Scanner;

/**
 * ќпределить правельность даты, введенной с клавиатуры (число - от 1 до 31,
 * мес€ц - от 1 до 12). ≈сли введены некорректные данные, то сообщить об этом.
 */

public class Main23 {

	public static void main(String[] args) {
		int day;
		int month;

		Scanner c = new Scanner(System.in);

		System.out.print("¬ведите число от 1 до 31 >>" + "");
		while (!c.hasNextInt()) {
			String s = c.nextLine();
			System.out.print("¬ведите число от 1 до 31 >>");
		}
		day = c.nextInt();

		if ((day >= 1) && (day <= 31))
			System.out.println("day = " + day);
		else
			System.out.println("¬ы ввели не верную дату");

		System.out.print("¬ведите мес€ц от 1 до 12 >>");
		while (!c.hasNextInt()) {
			String s = c.nextLine();
			System.out.print("¬ведите мес€ц от 1 до 12 >>");
		}
		month = c.nextInt();

		if ((month >= 1) && (month <= 12))
			System.out.println("month = " + month);
		else
			System.out.println("¬ы ввели не верный мес€ц");

	}

}
