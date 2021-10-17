package by.jonline.lacture01.main;

import java.util.Scanner;

/**
 * Составить программу, рализующую эпизод применения компьютера в книжном
 * магазине. Компьютер запрашивает стоимость книги, сумму денег, внесенную
 * покупателем. Если сдачи не требуется, то ывести на экран "Спасибо!". если
 * денег внесено больше, чем необходимо, то печатает "Возьмине сдачу:", если
 * денег недостаточно, то печаает сообщение об этом и указывает размер
 * недостоющей суммы.
 */

public class Main34 {

	public static void main(String[] args) {
		double price;
		double sum;

		Scanner sc = new Scanner(System.in);

		System.out.print("Введите стоимость книги: ");

		while (!sc.hasNextDouble()) {
			String s = sc.nextLine();
			System.out.print("Введите стоимость книги: ");
		}

		price = sc.nextDouble();

		System.out.print("Введите внесенную покупателем сумму: ");

		while (!sc.hasNextDouble()) {
			String s = sc.nextLine();
			System.out.print("Введите внесенную покупателем сумму: ");
		}
		sum = sc.nextDouble();

		if (price == sum)
			System.out.print("Спасибо!");
		if (price < sum) {
			double difference = sum - price;
			System.out.print("Возьмине сдачу: " + difference);
		}
		if (price > sum) {
			double difference = price - sum;
			System.out.print("Денег недостаточно. Dytcbnt: " + difference);
		}

	}

}
