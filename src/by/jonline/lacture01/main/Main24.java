package by.jonline.lacture01.main;

import java.util.Scanner;

/**
 * —ставить программу, определ€ющую результат гадани€ на ромашке -
 * "любт - не любит", вз€в за исходное данное количеств лепестков n
 */

public class Main24 {

	public static void main(String[] args) {
		int n;

		Scanner c = new Scanner(System.in);

		System.out.print("¬ведите количество лепестков >>");

		while (!c.hasNextInt()) {
			String s = c.nextLine();
			System.out.print("¬ведите количество лепестков >>");
		}
		n = c.nextInt();

		if (n % 2 == 0)
			System.out.print("Ћюбит!!!");
		else
			System.out.print("Ќе любит!!!");

	}

}
