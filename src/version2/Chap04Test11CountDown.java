package version2;

import java.util.Scanner;

public class Chap04Test11CountDown {

	public static void main(String[] args) {

		Scanner stdIn = new Scanner(System.in);	
		System.out.println("������");
//		int x;
//		do {
//			System.out.print("������ֵ��");
//			x = stdIn.nextInt();
//		} while (x<0); //do...while����
//
//		while (x>=0) {
//			System.out.println(x);
//			x--;
//		}
		int x = -1;
		for ( ;  x < 0; ) {
			System.out.print("������ֵ��");
			x = stdIn.nextInt();
		}//for����
		
		for( ;  x>=0;  x--) {
			System.out.println(x);
		}//for����
		
		stdIn.close();
	}//main����
}//�����
