package version2;

import java.util.Scanner;

public class Chap04Exp17SumBreak1 {

	public static void main(String[] args) {

		Scanner stdIn = new Scanner(System.in);
		System.out.print("���������мӷ����㡣\nҪ��Ӷ��ٸ�������");
		int n = stdIn.nextInt();
		
		int sum = 0;
		for(int i=0; i<n; i++) {
			System.out.print("��������0��������");
			int t = stdIn.nextInt();
			if (t==0) {
				break;
			}//if����
			sum += t;			
		}//for����
		System.out.println("�ϼ�ֵ��"+sum);
		
		stdIn.close();
		
	}//main����
}//�����
