package chap04V2;

import java.util.Scanner;

public class Chap04Test24Measure {

	public static void main(String[] args) {

		Scanner stdIn = new Scanner(System.in);
		int n;
		do {
			System.out.print("������ֵ��");
			n = stdIn.nextInt();
		} while (n<=0);//do...while����
		
		int x=0;
		for (int i = 1; i <=n; i++) {
			if (n%i == 0) {
				System.out.println(i);
				x++;
			} //if����
		} //for����
		System.out.println("...���ϸ�����"+x+"��");

		Boolean flag = true; // ture������
		for(int i=2; i<n; i++) {
			if (n%i == 0) {
				flag = false;//��Ϊ����������������Լ��
				break;
			}//if����	
		}//for����
		
		if (flag) {
			System.out.println(n+"��������");
		}else {
			System.out.println(n+"��Լ����");
		}//if����
				
		stdIn.close();
		
	}//main����
}//�����
