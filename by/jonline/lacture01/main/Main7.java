package by.jonline.lacture01.main;

/**
 * ��������� ��������� ���������� ������ ��������� a2*x6*x+b4*x+c, ��� ��������
 * ��������� a,x,b � c.
 */
public class Main7 {

	public static void main(String[] args) {
		double a;
		double b;
		double c;
		double x;
		double val;

		a = 1;
		b = 2;
		c = 5;
		x = 1;

		val = Math.pow(a, 2) * Math.pow(x, 7) + Math.pow(b, 4) * x + c;
		val = Math.abs(val);

		System.out.println(val);

	}

}
