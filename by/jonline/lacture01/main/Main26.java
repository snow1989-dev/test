package by.jonline.lacture01.main;

// �������� ��������� ���������� ����� �������� � �������� �� ���� �����.

public class Main26 {

	public static void main(String[] args) {
		int x;
		int y;
		int z;
		int max;
		int min;
		int sum;

		x = 1;
		y = 2;
		z = 3;

		System.out.println("x = " + x + " y = " + y + " z = " + z);

		if (x > y)
			max = x;
		else
			max = y;
		if (z > max)
			max = z;

		if (x < y)
			min = x;
		else
			min = y;
		if (z < min)
			min = z;

		sum = min + max;

		System.out.println(sum);

	}

}
