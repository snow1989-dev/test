package by.jonline.lacture01.main;

// Найдите max(min(a, b), min(c,d)).

public class Main27 {

	public static void main(String[] args) {
		int a;
		int b;
		int c;
		int d;
		int val;

		a = 3;
		b = 4;
		c = 5;
		d = 6;

		val = Math.max(Math.min(a, b), Math.min(c, d));

		System.out.print(val);

	}

}