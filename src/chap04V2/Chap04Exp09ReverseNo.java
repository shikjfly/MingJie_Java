package chap04V2;

import java.util.Scanner;

public class Chap04Exp09ReverseNo {

	public static void main(String[] args) {

		Scanner stdIn = new Scanner(System.in);
		
		System.out.println("������ʾ������ֵ��");
		int x;
		do {
			System.out.print("������ֵ��");
			x=stdIn.nextInt();
		} while (x < 0); //do..while����

		System.out.print("���������ǣ�");
		while (x>0) {
			System.out.print(x%10);
			x /= 10;
		}
		stdIn.close();
		
	}//main����
}//�����
