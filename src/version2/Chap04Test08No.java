package version2;

import java.util.Scanner;

public class Chap04Test08No {

	public static void main(String[] args) {

		Scanner stdIn = new Scanner(System.in);
		int x;
		do {
			System.out.print("����ֵ��");
			x = stdIn.nextInt();
		} while (x<0);//do...while����
		
		int n=0;
		while (x>0) {
			x /= 10;
			n++;
		}//while����
		System.out.println("��ֵΪ"+ n +"λ��");
		stdIn.close();		
	}//main����
}//�����
