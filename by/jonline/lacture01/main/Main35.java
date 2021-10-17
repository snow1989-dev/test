package by.jonline.lacture01.main;

import java.util.Scanner;

// ¬ычислить число и мес€ц в не высокосном году по номеру дн€.

public class Main35 {

	public static void main(String[] args) {

		int day;

		day = 0;

		Scanner sc = new Scanner(System.in);

		System.out.print("¬ведите номер дн€ от 1 до 365: ");

		while (!sc.hasNextInt()) {
			String s = sc.nextLine();
			System.out.print("¬ведите номер дн€ от 1 до 365: ");
		}
		day = sc.nextInt();

		if (day < 0 || day > 365)
			System.out.println("¬ами введен не верный номер дн€");
		if (day > 0 && day <= 31)
			System.out.print(day + " €нвар€");
		if (day > 31 && day <= 59) {
			int day1 = day - 31;
			System.out.print(day1 + " феврал€");
		}
		if (day > 59 && day <= 90) {
			int day1 = day - 59;
			System.out.print(day1 + " марта");
		}
		if (day > 90 && day <= 120) {
			int day1 = day - 90;
			System.out.print(day1 + " апрел€");
		}
		if (day > 120 && day <= 151) {
			int day1 = day - 120;
			System.out.print(day1 + " ма€");
		}
		if (day > 151 && day <= 181) {
			int day1 = day - 151;
			System.out.print(day1 + " июн€");
		}
		if (day > 181 && day <= 212) {
			int day1 = day - 181;
			System.out.print(day1 + " июл€");
		}
		if (day > 212 && day <= 243) {
			int day1 = day - 212;
			System.out.print(day1 + " августа");
		}
		if (day > 243 && day <= 273) {
			int day1 = day - 243;
			System.out.print(day1 + " сент€бр€");
		}
		if (day > 273 && day <= 304) {
			int day1 = day - 273;
			System.out.print(day1 + " окт€бр€");
		}
		if (day > 304 && day <= 334) {
			int day1 = day - 304;
			System.out.print(day1 + " но€бр€");
		}
		if (day > 334 && day <= 365) {
			int day1 = day - 334;
			System.out.print(day1 + " декабр€");

		}
	}
}
