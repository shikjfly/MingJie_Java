package chap04V2;

import java.util.Scanner;

public class Chap04Exp08PutAsterisk2 {

	public static void main(String[] args) {

		Scanner stdIn = new Scanner(System.in);
		
		System.out.print("Ҫ��ʾ���ٸ�*�أ�");
		int n = stdIn.nextInt();
		int i=1;
		while (n>=i) {
			System.out.print('*');//�����ţ��ַ�����
			i++;
		}//while����

		System.out.println();
		stdIn.close();
		
	}//main����
}//�����
