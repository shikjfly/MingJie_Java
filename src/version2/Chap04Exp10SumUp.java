package version2;

import java.util.Scanner;

public class Chap04Exp10SumUp {

	public static void main(String[] args) {

		Scanner stdIn = new Scanner(System.in);
		
		System.out.println("����1��n�ĺ͡�");
		int n;
		do {
			System.out.print("n��ֵ��");
			n = stdIn.nextInt();
		} while (n<0);//do..while����
		
		
		int sum=0;
		int i = 0;
		while (n>i) {
			 sum += ++i;
		}//while����
		System.out.print("1��"+n+"�ĺ���"+sum+"��");
		stdIn.close();
		
	}//main����
}//�����
