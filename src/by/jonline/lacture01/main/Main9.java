package by.jonline.lacture01.main;

/** �������� ���������, ������� ��������� �� ���� ��������� ��������, 
 * ��������� �� ������ ����������� ���������������.
 */
import java.util.Scanner;

public class Main9 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		 int a;
		 int b;
		 int c;
		 
		 System.out.print("a>>");
		 while (! scan.hasNextInt()){
			 String str = scan.nextLine();
			 System.out.print("a>>");
		 }
		a = scan.nextInt();
		
		 System.out.print("b>>");
		 while (! scan.hasNextInt()){
			 String str = scan.nextLine();
			 System.out.print("b>>");
		 }
		b = scan.nextInt();
		
		 System.out.print("c>>");
		 while (! scan.hasNextInt()){
			 String str = scan.nextLine();
			 System.out.print("c>>");
		 }
		c = scan.nextInt();
		
		if ((a==b) && (b==c) && (c==a))
			System.out.println("����������� ��������������");
		else
			System.out.println("����������� ����������������");
			
			

	}

}
