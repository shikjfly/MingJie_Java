package chap04V2;

import java.util.Scanner;

public class Chap04Exp07PutAsterisk2 {

	public static void main(String[] args) {

		Scanner stdIn = new Scanner(System.in);
		
		System.out.print("Ҫ��ʾ���ٸ�*�أ�");
		int n = stdIn.nextInt();
		while (n>0) {
			System.out.print('*');//�����ţ��ַ�����
			n--;
		}//while����

		System.out.println();
		stdIn.close();
		
	}//main����
}//�����
