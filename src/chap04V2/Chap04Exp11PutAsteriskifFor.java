package chap04V2;

import java.util.Scanner;

public class Chap04Exp11PutAsteriskifFor {

	public static void main(String[] args) {

		Scanner stdIn = new Scanner(System.in);
		
		System.out.print("Ҫ��ʾ���ٸ�*�أ�");
		int n = stdIn.nextInt();
		
//		int i=0;
//		while (i<n) {
//			System.out.print('*');
//			i++;
//		} //while����
		
		for (int i = 0; i < n; i++) {
			System.out.print('*');
		} //for����
		

		System.out.println();
		stdIn.close();
		
	}//main����
}//�����
