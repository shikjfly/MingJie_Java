package chap04V2;

import java.util.Scanner;

public class Chap04Test16PutAsterisk {

	public static void main(String[] args) {

		Scanner stdIn = new Scanner(System.in);	
//		int x;
//		do {
//			System.out.print("Ҫ��ʾ���ٸ�*�أ�");
//			x = stdIn.nextInt();
//		} while (x<=0);
		
		int x;
		for(x=-1; x<=0; ) {
			System.out.print("Ҫ��ʾ���ٸ�*�أ�");
			x = stdIn.nextInt();
		}//for����
		
		for(int i=1 ; i <= x/5; i++) {
			System.out.println("*****");
		}//for����
		for(int i=1 ; i <= x%5; i++) {
			System.out.print("*");
		}//for����
		
		stdIn.close();
	}//main����
}//�����
