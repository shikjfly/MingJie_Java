package version2;

import java.util.Scanner;

public class Chap04Exp04CountDown1 {

	public static void main(String[] args) {

		Scanner stdIn = new Scanner(System.in);	
		System.out.println("������");
		int x;
		do {
			System.out.print("������ֵ��");
			x = stdIn.nextInt();
		} while (x <= 0);//do-while����
		
		while (x >= 0) {
			System.out.println(x--);
		}//while����
		stdIn.close();
	}//main����
}//�����
