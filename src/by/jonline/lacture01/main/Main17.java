package by.jonline.lacture01.main;

/**
 * ���� ����� ����� m, n. ���� ����� �� �����, �� �������� ������ �� ��� o���� �
 * ��� �� ������, ������ �������� �� ��������, � ���� �����, �� �������� �����
 * ������.
 */

public class Main17 {

	public static void main(String[] args) {

		int m;
		int n;

		m = 5;
		n = 9;

		if (m != n) {
			if (m > n) {
				n = m;
				System.out.println("m = " + m + ";" + "n = " + n);
			} else {
				m = n;
				System.out.println("m = " + m + "; " + "n = " + n + ".");
			}
		} else {
			m = 0;
			n = 0;
			System.out.println("m = " + m + "; " + "n = " + n + ".");
		}

	}
}
