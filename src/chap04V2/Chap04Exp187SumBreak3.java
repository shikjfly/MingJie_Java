package chap04V2;

import java.util.Scanner;

public class Chap04Exp187SumBreak3 {

	public static void main(String[] args) {

		Scanner stdIn = new Scanner(System.in);
		System.out.print("���������мӷ����㡣\nҪ��Ӷ��ٸ�������");
		int n = stdIn.nextInt();
		
		int sum = 0;
		for(int i=0; i<n; i++) {
			System.out.print("������");
			int t = stdIn.nextInt();

			if (t<0) {
				System.out.println("���Ը������мӷ����㡣");
				continue;
			}//if����
			sum += t; //��t<0ʱ����ִ��
		}//for����
		System.out.println("�ϼ�ֵΪ"+sum+"��");
		
		stdIn.close();
		
	}//main����
}//�����
