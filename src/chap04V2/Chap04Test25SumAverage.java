package chap04V2;

import java.util.Scanner;

public class Chap04Test25SumAverage {

	public static void main(String[] args) {

		Scanner stdIn = new Scanner(System.in);

		System.out.print("���������мӷ����㡣\nҪ��Ӷ��ٸ�������");
		int n=stdIn.nextInt();
		
		int sum=0;
		for(int i=0; i<n; i++) {
			System.out.print("��������0��������");
			int t=stdIn.nextInt();
			if (t<=0) {
				break;
			}
			sum +=t;
		}
		System.out.println("�ϼ�ֵΪ" +sum+ "��");
		
		stdIn.close();
		
	}//main����
}//�����
