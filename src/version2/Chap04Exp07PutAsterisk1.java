package version2;

import java.util.Scanner;

public class Chap04Exp07PutAsterisk1 {

	public static void main(String[] args) {

		Scanner stdIn = new Scanner(System.in);
		
		System.out.print("Ҫ��ʾ���ٸ�*�أ�");
		int n = stdIn.nextInt();

		if (n>0) {
			while (n>0) {
				System.out.print("*");
				n--;
			}//while����
		}else {
			System.out.println();
		}//if����
		stdIn.close();
		
	}//main����
}//�����
