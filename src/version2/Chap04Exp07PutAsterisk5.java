package version2;

import java.util.Scanner;

public class Chap04Exp07PutAsterisk5 {

	public static void main(String[] args) {

		Scanner stdIn = new Scanner(System.in);
		
		System.out.print("Ҫ��ʾ���ٸ�*�أ�");
		int n = stdIn.nextInt();

		while (--n >= 0) { //�����ڿɸ�дn��ֵ
			System.out.print('*');//�����ţ��ַ�����
		}//while����

		System.out.println();
		stdIn.close();
		
	}//main����
}//�����
